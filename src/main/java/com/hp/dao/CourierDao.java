package com.hp.dao;
import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.hp.bean.Courier;


public interface CourierDao {

	@Select("select * from e_courier")
	List<Courier> queryAllCouriers();

	List<Courier> queryCouriersByExample(String search);
	
	@Select("select * from e_courier where courier_no = #{courierNo}")
	Courier queryAllCouriersBycourierNo(Integer courierNo);
	
}
