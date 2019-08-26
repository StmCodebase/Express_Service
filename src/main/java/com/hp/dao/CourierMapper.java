package com.hp.dao;

import com.hp.bean.Courier;
import com.hp.bean.CourierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourierMapper {
    long countByExample(CourierExample example);

    int deleteByExample(CourierExample example);

    int deleteByPrimaryKey(Integer courierNo);

    int insert(Courier record);

    int insertSelective(Courier record);

    List<Courier> selectByExample(CourierExample example);

    Courier selectByPrimaryKey(Integer courierNo);

    int updateByExampleSelective(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByExample(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByPrimaryKeySelective(Courier record);

    int updateByPrimaryKey(Courier record);
}