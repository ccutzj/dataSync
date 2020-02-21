package com.faw.dao;

import com.faw.pojo.N00000020170BusinessHistory;

import java.util.List;

public interface ScrmGdHMapper {
    int deleteByPrimaryKey(String id);

    int insert(N00000020170BusinessHistory record);

    int insertSelective(N00000020170BusinessHistory record);

    N00000020170BusinessHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(N00000020170BusinessHistory record);

    int updateByPrimaryKey(N00000020170BusinessHistory record);

    int deleteAll();

    int insertAll(List<N00000020170BusinessHistory> n00000020170BusinessHistorylist);
}