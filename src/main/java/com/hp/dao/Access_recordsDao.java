package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.hp.bean.Access_records;

public interface Access_recordsDao {

	@Select("select * from e_access_records where acc_end_time IS null and PO_NO = ANY(SELECT PO_no from e_post WHERE PO_END_TIME IS NULL) ")
	List<Access_records> queryAllAccess_records();
	
	@Select("SELECT * FROM e_access_records where ACC_NO  = ANY(select MAX(ACC_NO)"
			+ " AS ACC_NO from e_access_records where  PO_NO = ANY(SELECT PO_no from e_post WHERE PO_END_TIME IS NULL) GROUP BY PO_NO" + 
			") AND ACC_END_TIME IS TRUE")
	List<Access_records> queryAllInAccess_records();
	
	@Select("SELECT * from  e_access_records WHERE PO_NO = #{poNo} ORDER BY ACC_START_TIME")
	List<Access_records> queryAccessrecordsByPono(Access_records access_records);
}
