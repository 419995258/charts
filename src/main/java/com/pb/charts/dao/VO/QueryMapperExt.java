package com.pb.charts.dao.VO;


import com.pb.charts.entity.VO.Query;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QueryMapperExt {
    /**
     *
     * @Description: TODO
     * @param    goodsCode,goodsName
     * @return 
     * @throws
     * @author pengbin 
     * 2018/3/6 9:15
     */
    List<Query> selectStocks(@Param("goodsCode") String goodsCode, @Param("goodsName")String goodsName);
}