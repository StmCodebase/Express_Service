package com.hp.dao;
import java.util.List;
import org.apache.ibatis.annotations.Select;

import com.hp.bean.Enterprise;

public interface EnterpriseDao {

	@Select("select * from e_enterprise")
	List<Enterprise> queryAllEnterprises();
		
	List<Enterprise> queryEnterprisesByExample(String search);
	
	@Select("select * from e_enterprise where ENT_NO = #{entNo}")
	Enterprise queryAllEnterprisesByentNo(Integer entNo);
	
}
