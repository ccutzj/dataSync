package com.faw.service;

import org.springframework.transaction.annotation.Transactional;

public interface DataSyncService {

    /**
     * N00000020170_business_history表
     * @throws Exception
     */
    @Transactional
    void n00000020170BusinessHistoryRunner(String dayNo);

    /**
     * n00000020170Business表
     */
    @Transactional
    void n00000020170BusinessRunner(String dayNo);
}
