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
import java.util.Iterator;
import java.util.List;


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

    @RequestMapping(value="/getStockList",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo getStockList(@RequestBody ResultVo resultVo) throws Exception{
        resultVo = goodsService.queryGoodsStock(resultVo);
        return  resultVo;
    }

    @RequestMapping(value="/getGoodsCode",method = RequestMethod.POST)
    public  List<Ptype> login3(@RequestJson(value = "code") String code){
        List<Ptype> ptypeList = new ArrayList<Ptype>();
        System.out.println(code);
        System.out.println("ok");
        return ptypeList;
    }
}