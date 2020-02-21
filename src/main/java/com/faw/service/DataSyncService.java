package com.faw.service;

import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;

public interface DataSyncService {

    /**
     * 同步前一天的N00000020170_business_history表
     * @throws Exception
     */
    @Transactional
    void n00000020170BusinessHistoryRunner(String dayNo);

    /**
     * 同步前一天的n00000020170Business表
     */
    @Transactional
    void n00000020170BusinessRunner(String dayNo);
}
