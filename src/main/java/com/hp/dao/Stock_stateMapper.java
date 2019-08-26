package com.hp.dao;

import com.hp.bean.Stock_state;
import com.hp.bean.Stock_stateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stock_stateMapper {
    long countByExample(Stock_stateExample example);

    int deleteByExample(Stock_stateExample example);

    int deleteByPrimaryKey(Integer stockStateNo);

    int insert(Stock_state record);

    int insertSelective(Stock_state record);

    List<Stock_state> selectByExample(Stock_stateExample example);

    Stock_state selectByPrimaryKey(Integer stockStateNo);

    int updateByExampleSelective(@Param("record") Stock_state record, @Param("example") Stock_stateExample example);

    int updateByExample(@Param("record") Stock_state record, @Param("example") Stock_stateExample example);

    int updateByPrimaryKeySelective(Stock_state record);

    int updateByPrimaryKey(Stock_state record);
}