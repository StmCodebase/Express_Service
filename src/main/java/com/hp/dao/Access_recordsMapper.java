package com.hp.dao;

import com.hp.bean.Access_records;
import com.hp.bean.Access_recordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Access_recordsMapper {
    long countByExample(Access_recordsExample example);

    int deleteByExample(Access_recordsExample example);

    int deleteByPrimaryKey(Integer accNo);

    int insert(Access_records record);

    int insertSelective(Access_records record);

    List<Access_records> selectByExample(Access_recordsExample example);

    Access_records selectByPrimaryKey(Integer accNo);

    int updateByExampleSelective(@Param("record") Access_records record, @Param("example") Access_recordsExample example);

    int updateByExample(@Param("record") Access_records record, @Param("example") Access_recordsExample example);

    int updateByPrimaryKeySelective(Access_records record);

    int updateByPrimaryKey(Access_records record);
}