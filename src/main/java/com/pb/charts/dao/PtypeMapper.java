package com.pb.charts.dao;

import com.pb.charts.entity.Ptype;
import com.pb.charts.entity.PtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtypeMapper {
    int deleteByExample(PtypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(Ptype record);

    int insertSelective(Ptype record);

    List<Ptype> selectByExampleWithBLOBs(PtypeExample example);

    List<Ptype> selectByExample(PtypeExample example);

    Ptype selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") Ptype record, @Param("example") PtypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Ptype record, @Param("example") PtypeExample example);

    int updateByExample(@Param("record") Ptype record, @Param("example") PtypeExample example);

    int updateByPrimaryKeySelective(Ptype record);

    int updateByPrimaryKeyWithBLOBs(Ptype record);

    int updateByPrimaryKey(Ptype record);
}