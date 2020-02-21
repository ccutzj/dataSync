package com.faw.controller;

import com.faw.service.DataSyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datasync")
@Slf4j
public class AutoSync {

    @Autowired
    private DataSyncService dataSyncService;

    @GetMapping("/scrmgd")
    public String dataSyncScrmGd(){
        try {
            log.info("N00000020170_business表同步开始。。。");
            dataSyncService.n00000020170BusinessRunner(null);
            log.info("N00000020170_business表同步结束。。。");
            return "success!";
        } catch (Exception e) {
            log.info(e.getMessage());
            return "error!";
        }
    }

    @GetMapping("/scrmgdh")
    public String dataSyncScrmGdH(){
        try {
            log.info("N00000020170_business_history表同步开始。。。");
            dataSyncService.n00000020170BusinessHistoryRunner(null);
            log.info("N00000020170_business_history表同步结束。。。");
            return "success!";
        } catch (Exception e) {
            log.info(e.getMessage());
            return "error!";
        }
    }
}
