package com.faw.service.impl;

import com.faw.dao.ScrmGdHMapper;
import com.faw.dao.ScrmGdMapper;
import com.faw.pojo.N00000020170Business;
import com.faw.pojo.N00000020170BusinessHistory;
import com.faw.repository.primary.N00000020170BusinessHistoryRepository;
import com.faw.repository.primary.N00000020170BusinessRepository;
import com.faw.service.DataSyncService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class DataSyncServiceImpl implements DataSyncService {

    private static Logger logger = LoggerFactory.getLogger(DataSyncServiceImpl.class);

    @Autowired
    private N00000020170BusinessRepository n00000020170BusinessRepository;

    @Autowired
    private N00000020170BusinessHistoryRepository n00000020170BusinessHistoryRepository;

    @Autowired
    private ScrmGdMapper scrmGdMapper;

    @Autowired
    private ScrmGdHMapper scrmGdHMapper;

    @Override
    public void n00000020170BusinessHistoryRunner(String dayNo) {
        List<N00000020170BusinessHistory> n00000020170BusinessHistorylist = null;
        // 默认
        if (dayNo == null) {
            Date date = getExcDate();
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            logger.info("开始查询{}七陌数据库time:{}",dateString, new Date());
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findByBiupdatetimeContains(dateString);
            logger.info("查询七陌数据库执行完毕！开始执行Oracle写入！{}", new Date());
            logger.info("n00000020170BusinessHistorylist数据Size:{}", n00000020170BusinessHistorylist.size());
            try{
                if (n00000020170BusinessHistorylist.size() > 0) {
                    //写入Oracle数据库
                    writeOracleH(n00000020170BusinessHistorylist);
                }
                logger.info("数据写入Oracle成功");
            }catch (Exception e){
                logger.info("n00000020170BusinessHistoryRunner同步Service异常:{}", e.getMessage());
            }
        }
        // 全量
        else if ("all".equals(dayNo)) {
            logger.info("开始查询七陌数据库time:{}", new Date());
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findAll();
            logger.info("获取七陌数据库执行完毕：{}", new Date());
            if (n00000020170BusinessHistorylist.size() > 0) {
                scrmGdHMapper.deleteAll();
                scrmGdHMapper.insertAll(n00000020170BusinessHistorylist);
            }
        }
        // 按天数
        else {
            Integer days = Integer.parseInt(dayNo);
            Date date = DateUtils.addDays(new Date(), days);
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            logger.info("开始查询{}七陌数据库time:{}",dateString, new Date());
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findByBiupdatetimeContains(dateString);
            logger.info("获取七陌数据库执行完毕：{}", new Date());
            if (n00000020170BusinessHistorylist.size() > 0) {
                //写入Oracle数据库
                writeOracleH(n00000020170BusinessHistorylist);
            }

        }
    }

    /**
     * 工单历史表写入Oracle数据库
     * @param n00000020170BusinessHistorylist
     */
    private void writeOracleH(List<N00000020170BusinessHistory> n00000020170BusinessHistorylist) {
        //遍历mongodb数据库中获取的数据
        for (N00000020170BusinessHistory n00000020170BusinessHistory : n00000020170BusinessHistorylist) {
            N00000020170BusinessHistory business = scrmGdHMapper.selectByPrimaryKey(n00000020170BusinessHistory.getId());
            if (business != null){
                scrmGdHMapper.deleteByPrimaryKey(business.getId());
            }
            scrmGdHMapper.insert(n00000020170BusinessHistory);
        }
    }

    @Override
    public void n00000020170BusinessRunner(String dayNo){
        List<N00000020170Business> n00000020170Businesslist = null;
        int count = 0;
        // 默认
        if (dayNo == null) {
            Date date = getExcDate();
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            logger.info("开始查询{}七陌数据库time:{}",dateString, new Date());
            try{
                n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNullAndLastUpdateTimeContains(dateString);
                logger.info("查询七陌数据库执行完毕！开始执行Oracle写入！{}", new Date());
                logger.info("n00000020170BusinesslistSize:{}", n00000020170Businesslist.size());
                if (n00000020170Businesslist.size() > 0) {
                    //写入Oracle
                    writeOracle(n00000020170Businesslist);
                }
                logger.info("数据写入Oracle成功");
            }catch (Exception e){
                logger.info("n00000020170BusinessRunner同步Service异常:{}", e.getMessage());
            }


        }
        // 全量
        else if ("all".equals(dayNo)) {
            logger.info("开始查询全部七陌数据库time:{}", new Date());
            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNull();
            logger.info("查询七陌数据库执行完毕！开始执行Oracle写入！{}", new Date());
            logger.info("n00000020170BusinesslistSize:{}", n00000020170Businesslist.size());
            if (n00000020170Businesslist.size() > 0) {
                writeOracle(n00000020170Businesslist);
            }
            logger.info("数据写入Oracle成功");
        }
        // 按日期
        else {
            Integer days = Integer.parseInt(dayNo);
            Date date = DateUtils.addDays(new Date(), days);
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNullAndLastUpdateTimeContains(dateString);
            if (n00000020170Businesslist.size() > 0) {
                writeOracle(n00000020170Businesslist);
            }
        }
    }

    /**
     * 工单表写入Oracle数据库
     * @param n00000020170Businesslist
     */
    private void writeOracle(List<N00000020170Business> n00000020170Businesslist){
        for(N00000020170Business n00000020170Business : n00000020170Businesslist){
            N00000020170Business business = scrmGdMapper.selectById(n00000020170Business.getId());
            if(business!=null){
                scrmGdMapper.deleteById(n00000020170Business.getId());
            }
            scrmGdMapper.insert(n00000020170Business);
        }
    }


    /**
     * 获取执行时间
     * @return
     */
    private Date getExcDate() {
        //前一天日期
		Date date = DateUtils.addDays(new Date(), -1);
//        Date date = new Date();
        return date;
    }
}
