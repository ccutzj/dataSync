package com.faw.repository.primary;

import com.faw.pojo.N00000020170Business;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface N00000020170BusinessRepository 
	extends MongoRepository<N00000020170Business, String> {
	
	/**
	 * 提取前一天数据
	 * @param data
	 * @return
	 */
	List<N00000020170Business> findByIsHistoryIsNullAndCreateTimeContains(String data);
	
	
	/**
	 * 提取ishistory是null数据
	 * @return
	 */
	List<N00000020170Business> findByIsHistoryIsNull();
	
	/**
	 * 按更新时间提取数据
	 * @param data 时间
	 * @return
	 */
	List<N00000020170Business> findByIsHistoryIsNullAndLastUpdateTimeContains(String data);

}
