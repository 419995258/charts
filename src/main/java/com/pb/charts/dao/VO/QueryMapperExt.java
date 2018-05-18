package com.pb.charts.dao.VO;


import com.pb.charts.entity.Ptype;
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


    /**
     * 模糊查询商品的编码
     * @Description: TODO
     * @param
     * @return
     * @throws
     * @author pengbin <pengbin
     * 2018/5/18 14:10
     */
    List<Query> queryGoodsCode(@Param("goodsCode") String goodsCode) throws Exception;

    /**
     * 模糊查询商品的名字
     * @Description: TODO
     * @param
     * @return
     * @throws
     * @author pengbin <pengbin>
     * 2018/5/18 14:10
     */
    List<Query> queryGoodsName(@Param("goodsName") String goodsName) throws Exception;
}