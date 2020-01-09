package com.faw;

import com.faw.service.DataSyncService;
import com.faw.task.JobTasker;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FawApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(JobTasker.class);

	@Autowired
	private DataSyncService dataSyncService;
	@Test
	void contextLoads() {
		try {
			logger.info("N00000020170_business表同步开始。。。");
			dataSyncService.n00000020170BusinessRunner(null);
			logger.info("N00000020170_business表同步结束。。。");
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

}
