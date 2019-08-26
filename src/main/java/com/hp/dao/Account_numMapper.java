package com.hp.dao;

import com.hp.bean.Account_num;
import com.hp.bean.Account_numExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Account_numMapper {
    long countByExample(Account_numExample example);

    int deleteByExample(Account_numExample example);

    int deleteByPrimaryKey(Integer accNo);

    int insert(Account_num record);

    int insertSelective(Account_num record);

    List<Account_num> selectByExample(Account_numExample example);

    Account_num selectByPrimaryKey(Integer accNo);

    int updateByExampleSelective(@Param("record") Account_num record, @Param("example") Account_numExample example);

    int updateByExample(@Param("record") Account_num record, @Param("example") Account_numExample example);

    int updateByPrimaryKeySelective(Account_num record);

    int updateByPrimaryKey(Account_num record);
}