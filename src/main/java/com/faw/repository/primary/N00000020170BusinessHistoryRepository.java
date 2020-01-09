package com.faw.repository.primary;

import com.faw.pojo.N00000020170BusinessHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N00000020170BusinessHistoryRepository 
	extends MongoRepository<N00000020170BusinessHistory, String> {
	
	/**
	 * 提取前一天数据数据
	 * @param date
	 * @retur
	 */
	List<N00000020170BusinessHistory> findByBiupdatetimeContains(String date);
	
	/**
	 * 根据工单号，查询工单历史信息
	 * @param orderId
	 * @return
	 */
	List<N00000020170BusinessHistory> findByBusinessid(String orderId);
}
