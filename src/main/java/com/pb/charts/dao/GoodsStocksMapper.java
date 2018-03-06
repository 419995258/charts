package com.pb.charts.dao;

import com.pb.charts.entity.GoodsStocks;
import com.pb.charts.entity.GoodsStocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsStocksMapper {
    int deleteByExample(GoodsStocksExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(GoodsStocks record);

    int insertSelective(GoodsStocks record);

    List<GoodsStocks> selectByExample(GoodsStocksExample example);

    GoodsStocks selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") GoodsStocks record, @Param("example") GoodsStocksExample example);

    int updateByExample(@Param("record") GoodsStocks record, @Param("example") GoodsStocksExample example);

    int updateByPrimaryKeySelective(GoodsStocks record);

    int updateByPrimaryKey(GoodsStocks record);
}