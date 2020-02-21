package com.faw.dao;

import com.faw.pojo.N00000020170Business;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ScrmGdMapper {

    N00000020170Business selectById(String id);

    int deleteById(String id);

    int insert(N00000020170Business record);

}