package com.faw.service.impl;

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

    @Override
    public void n00000020170BusinessHistoryRunner(String dayNo) {
        List<N00000020170BusinessHistory> n00000020170BusinessHistorylist = null;
        // 默认
        if (dayNo == null) {
            Date date = getExcDate();
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            logger.info("开始查询七陌数据库time:{}", new Date());
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findByBiupdatetimeContains(dateString);
            logger.info("查询七陌数据库执行完毕：{}", new Date());
            if (n00000020170BusinessHistorylist.size() > 0) {
                //遍历mongodb数据库中获取的数据
//                n00000020170BusinessHistorylist.forEach(e -> {
//                    N00000020170BusinessHistory n00000020170BusinessHistory = n00000020170BusinessHistoryMapper.selectByPrimaryKey(e.getId());
//                    if (n00000020170BusinessHistory != null) {
//                        n00000020170BusinessHistoryMapper.deleteByPrimaryKey(n00000020170BusinessHistory.getId());
//                    }
//                    N00000000535Business n00000000535Business = e.getN00000000535Business();
//                    if (n00000000535Business != null) {
//                        N00000000535Business business = n00000000535BusinessMapper.selectByPrimaryKey(e.getId());
//                        if (business != null) {
//                            n00000000535BusinessMapper.deleteByPrimaryKey(business.getId());
//                        }
//                        e.setExcutedata(e.getId());
//                        e.getN00000000535Business().setId(e.getId());
//                        n00000000535BusinessMapper.insert(e.getN00000000535Business());
//                    }
//
//                });
//                n00000020170BusinessHistoryMapper.insertAll(n00000020170BusinessHistorylist);
            }
            logger.info("七陌数据库数据：{}", n00000020170BusinessHistorylist);
            logger.info("数据写入Oracle成功");
        }
        // 全量
        else if ("all".equals(dayNo)) {
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findAll();
            if (n00000020170BusinessHistorylist.size() > 0) {
//                n00000000535BusinessMapper.deleteAll();
//                n00000020170BusinessHistorylist.forEach(e -> {
//                    N00000000535Business n00000000535Business = e.getN00000000535Business();
//                    if (n00000000535Business != null) {
//                        e.setExcutedata(e.getId());
//                        e.getN00000000535Business().setId(e.getId());
//                        n00000000535BusinessMapper.insert(e.getN00000000535Business());
//                    }
//                });
//                n00000020170BusinessHistoryMapper.deleteAll();
//                n00000020170BusinessHistoryMapper.insertAll(n00000020170BusinessHistorylist);
            }
        }
        // 按天数
        else {
            Integer days = Integer.parseInt(dayNo);
            Date date = DateUtils.addDays(new Date(), days);
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            n00000020170BusinessHistorylist = n00000020170BusinessHistoryRepository.findByBiupdatetimeContains(dateString);
            if (n00000020170BusinessHistorylist.size() > 0) {
//                n00000020170BusinessHistorylist.forEach(e -> {
//                    N00000020170BusinessHistory n00000020170BusinessHistory = n00000020170BusinessHistoryMapper.selectByPrimaryKey(e.getId());
//                    if (n00000020170BusinessHistory != null) {
//                        n00000020170BusinessHistoryMapper.deleteByPrimaryKey(e.getId());
//                    }
//                    N00000000535Business n00000000535Business = e.getN00000000535Business();
//                    if (n00000000535Business != null) {
//                        N00000000535Business business = n00000000535BusinessMapper.selectByPrimaryKey(e.getId());
//                        if (business != null) {
//                            n00000000535BusinessMapper.deleteByPrimaryKey(business.getId());
//                        }
//                        e.setExcutedata(e.getId());
//                        e.getN00000000535Business().setId(e.getId());
//                        n00000000535BusinessMapper.insert(e.getN00000000535Business());
//                    }
//
//                });
//                n00000020170BusinessHistoryMapper.insertAll(n00000020170BusinessHistorylist);
            }

        }
    }

    @Override
    public void n00000020170BusinessRunner(String dayNo) {
        List<N00000020170Business> n00000020170Businesslist = null;
        // 默认
        if (dayNo == null) {
            Date date = getExcDate();
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            logger.info("开始查询七陌数据库time:{},传输dateString:{}", new Date() ,dateString);
            String dateTest = "2018-09-19";
//            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNullAndLastUpdateTimeContains(dateString);
            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNullAndLastUpdateTimeContains(dateTest);
            logger.info("查询七陌数据库执行完毕：{}", new Date());
            if (n00000020170Businesslist.size() > 0) {
                //遍历mongodb数据库中获取的数据
                for(N00000020170Business n00000020170Business:n00000020170Businesslist){

//                    N00000020170Business business = n00000020170BusinessMapper.selectByPrimaryKey(n00000020170Business.getId());
//                    if(business!=null){
//                        n00000020170BusinessMapper.deleteByPrimaryKey(n00000020170Business.getId());
//                    }
//                    n00000020170BusinessMapper.insert(n00000020170Business);
                }
                logger.info("七陌数据库数据：{}", n00000020170Businesslist);
                logger.info("数据写入Oracle成功");
            }
        }
        // 全量
        else if ("all".equals(dayNo)) {
            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNull();
            if (n00000020170Businesslist.size() > 0) {
                for(N00000020170Business n00000020170Business:n00000020170Businesslist){
//                    N00000020170Business business = n00000020170BusinessMapper.selectByPrimaryKey(n00000020170Business.getId());
//                    if(business!=null){
//                        n00000020170BusinessMapper.deleteByPrimaryKey(n00000020170Business.getId());
//                    }
//                    n00000020170BusinessMapper.insert(n00000020170Business);
                }
            }
        }
        // 按日期
        else {
            Integer days = Integer.parseInt(dayNo);
            Date date = DateUtils.addDays(new Date(), days);
            String dateString = DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(date);
            n00000020170Businesslist = n00000020170BusinessRepository.findByIsHistoryIsNullAndLastUpdateTimeContains(dateString);
            if (n00000020170Businesslist.size() > 0) {
                for(N00000020170Business n00000020170Business:n00000020170Businesslist){
//                    N00000020170Business business = n00000020170BusinessMapper.selectByPrimaryKey(n00000020170Business.getId());
//                    if(business!=null){
//                        n00000020170BusinessMapper.deleteByPrimaryKey(n00000020170Business.getId());
//                    }
//                    n00000020170BusinessMapper.insert(n00000020170Business);
                }
            }
        }
    }

    /**
     * 获取执行时间
     * @return
     */
    private Date getExcDate() {
//		Date date = DateUtils.addDays(new Date(), -1);
        Date date = new Date();
        return date;
    }
}
