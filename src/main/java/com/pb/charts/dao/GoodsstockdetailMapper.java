package com.pb.charts.dao;

import com.pb.charts.entity.Goodsstockdetail;
import com.pb.charts.entity.GoodsstockdetailExample;
import com.pb.charts.entity.GoodsstockdetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsstockdetailMapper {
    int deleteByExample(GoodsstockdetailExample example);

    int deleteByPrimaryKey(GoodsstockdetailKey key);

    int insert(Goodsstockdetail record);

    int insertSelective(Goodsstockdetail record);

    List<Goodsstockdetail> selectByExample(GoodsstockdetailExample example);

    Goodsstockdetail selectByPrimaryKey(GoodsstockdetailKey key);

    int updateByExampleSelective(@Param("record") Goodsstockdetail record, @Param("example") GoodsstockdetailExample example);

    int updateByExample(@Param("record") Goodsstockdetail record, @Param("example") GoodsstockdetailExample example);

    int updateByPrimaryKeySelective(Goodsstockdetail record);

    int updateByPrimaryKey(Goodsstockdetail record);
}