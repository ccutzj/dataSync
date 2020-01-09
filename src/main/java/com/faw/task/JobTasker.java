package com.faw.task;

import com.faw.service.DataSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

//@Component
public class JobTasker {

    private static Logger logger = LoggerFactory.getLogger(JobTasker.class);

    @Autowired
    private DataSyncService dataSyncService;

    /**
     * N00000020170_business_history表同步
     */
    @Scheduled(cron = "${jobs.final}")
    public void job3() {
        try {
            logger.info("N00000020170_business_history表同步开始。。。");
            dataSyncService.n00000020170BusinessHistoryRunner(null);
            logger.info("N00000020170_business_history表同步结束。。。");
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }

    /**
     * N00000020170_business表同步
     */
    @Scheduled(cron = "${jobs.final}")
    public void job5() {
        try {
            logger.info("N00000020170_business表同步开始。。。");
            dataSyncService.n00000020170BusinessRunner(null);
            logger.info("N00000020170_business表同步结束。。。");
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
}
