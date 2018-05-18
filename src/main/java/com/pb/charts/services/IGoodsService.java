package com.pb.charts.services;

import com.pb.charts.entity.Ptype;
import com.pb.charts.entity.VO.Query;
import com.pb.charts.entity.VO.ResultVo;

import java.util.List;
import java.util.Map;

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

    
    /**
     * 模糊查询商品的编码
     * @Description: TODO
     * @param
     * @return
     * @throws
     * @author pengbin <pengbin>
     * 2018/5/18 14:10
     */
    public List<Query> queryGoodsCode(Map<String,Object> map) throws Exception;


    /**
     * 模糊查询商品的名字
     * @Description: TODO
     * @param
     * @return
     * @throws
     * @author pengbin <pengbin>
     * 2018/5/18 14:10
     */
    public List<Query> queryGoodsName(Map<String,Object> map) throws Exception;
}
