package com.pb.charts.services;

import com.pb.charts.entity.VO.ResultVo;

public interface IGoodsService {
    /**
     * 查询商品的剩余库存，分页查询
     * @Description: TODO
     * @param    
     * @return 
     * @throws
     * @author pengbin 
     * 2018/3/6 11:08
     */
    public ResultVo queryGoodsStock(ResultVo param) throws Exception;
}
