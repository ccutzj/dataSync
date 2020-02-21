package com.faw;

//import com.faw.dao.ScrmGdDao;
import com.faw.dao.ScrmGdMapper;
//import com.faw.dao.ScrmGdRepository;
import com.faw.pojo.N00000020170Business;
import com.faw.pojo.ScrmGd;
//import com.faw.pojo.ScrmGd_old;
import com.faw.service.DataSyncService;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FawApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(FawApplicationTests.class);

	@Autowired
	private DataSyncService dataSyncService;

	@Autowired
	private ScrmGdMapper scrmGdMapper;
	@Test
	public void contextLoads() {
//		try {
//			logger.info("N00000020170_business_history表同步开始。。。");
//			dataSyncService.n00000020170BusinessHistoryRunner(null);
//			logger.info("N00000020170_business_history表同步结束。。。");

//            logger.info("N00000020170_business表同步开始。。。");
//            dataSyncService.n00000020170BusinessRunner(null);
//            logger.info("N00000020170_business表同步结束。。。");

//			logger.info("读取Oracle数据");
//			ScrmGd scrmGd = scrmGdDao.selectById("abcd123");
//			ScrmGd_old scrmGd = scrmGdRepository.findOne("abcd123");
//			ScrmGd scrmGd = new ScrmGd();
//			scrmGd.setId("qwer");
//			scrmGd.setFlow("test");
//			int count = scrmGdMapper.insert(scrmGd);
//			System.out.println("插入返回数据:" + count);
//			N00000020170Business scrmGdList = scrmGdMapper.selectById("123");
//			logger.info("scrmGd数据:{}", scrmGdList);

//		} catch (Exception e) {
//			logger.info(e.getMessage());
//		}
	}

    @Test
    public void test(){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = sf.parse(null);
            logger.info("date:{}", date);
        } catch (Exception e) {
            logger.info("转换时间格式错误{}", e.getMessage());
            try {
                Date certificateDate = sf2.parse("");
                logger.info("certificateDate:{}", certificateDate);
            }catch (Exception e2) {
                logger.error("获取潜客数据字段DPCUS不正确{}", e2.getMessage());
            }
        }
    }


}
