package com.pb.charts.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pb.charts.annotation.RequestJson;
import com.pb.charts.dao.VO.QueryMapperExt;
import com.pb.charts.entity.Ptype;
import com.pb.charts.dao.PtypeMapper;
import com.pb.charts.entity.PtypeExample;
import com.pb.charts.entity.VO.Query;
import com.pb.charts.entity.VO.ResultVo;
import com.pb.charts.services.IGoodsService;
import com.pb.charts.util.StringContentUtil;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sun.nio.ch.Net;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@RestController  //代表controller
@RequestMapping("/goodsC")
public class GoodsController {

    @Autowired
    private PtypeMapper ptypemapper;

    @Autowired
    private QueryMapperExt queryMapperExt;

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping(value="/test",method = RequestMethod.POST)
    @ResponseBody
    public JSONArray test(@RequestBody JSONObject jsonObject){

        Ptype ptype = new Ptype();

        PtypeExample ptypeExample = new PtypeExample();
        ptypeExample.createCriteria().andUsercodeLike("WTWL81-H-2");
        List<Ptype> ptypeList = ptypemapper.selectByExample(ptypeExample);
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);
        return  jsonArray;

    }


    /**
     *
     *
     *
     * Goodsstockdetail 库存记录
     * GoodsStocks      库存
     * [SIZE]           尺码
     * Color            颜色
     * Stock            仓库
     * Ptype            库存信息
     *
     *
     *
     *
     *
     * typeId       id-----Ptype.typeId = GoodsStocks.PtypeId
     * FullName     名字--Ptype
     * UserCode     编码--Ptype
     * recPrice     进价--Ptype
     * retailPrice  零售价--Ptype
     *
     * FullName     仓库名--Stock
     * NAME         大小名字--[SIZE]
     * NAME         颜色名字--[颜色]
     * qty          剩余数量--Goodsstockdetail
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * @Description: TODO
     * @param
     * @return
     * @throws
     * @author pengbin <pengbin>
     * 2018/5/29 17:19
     */
    @RequestMapping(value="/getStockList",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo getStockList(@RequestBody ResultVo resultVo) throws Exception{
        resultVo = goodsService.queryGoodsStock(resultVo);
        return  resultVo;
    }

    @RequestMapping(value="/getGoodsCode",method = RequestMethod.POST)
    public  List<Query> getGoodsCode(@RequestJson(value = "code") String code) throws Exception{
        List<Query> queryList = new ArrayList<Query>();
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isBlank(code)){
            code = "";
        }
        map.put("code",code);
        queryList = goodsService.queryGoodsCode(map);
        return queryList;
    }


    @RequestMapping(value="/getGoodsName",method = RequestMethod.POST)
    public  List<Query> getGoodsName(@RequestJson(value = "code") String name) throws Exception{
        List<Query> queryList = new ArrayList<Query>();
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isBlank(name)){
            name = "";
        }
        map.put("name",name);
        queryList = goodsService.queryGoodsName(map);
        return queryList;
    }
}
