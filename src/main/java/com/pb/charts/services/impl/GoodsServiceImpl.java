package com.pb.charts.services.impl;

import com.pb.charts.dao.PtypeMapper;
import com.pb.charts.dao.VO.QueryMapperExt;
import com.pb.charts.entity.Ptype;
import com.pb.charts.entity.PtypeExample;
import com.pb.charts.entity.VO.Query;
import com.pb.charts.entity.VO.ResultVo;
import com.pb.charts.services.IGoodsService;
import com.pb.charts.util.FengYeBasic;
import com.pb.charts.util.ObjectUtil;
import com.pb.charts.util.StringContentUtil;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl extends FengYeBasic implements IGoodsService {

    @Autowired
    private PtypeMapper ptypemapper;

    @Autowired
    private QueryMapperExt queryMapperExt;

    @Override
    public ResultVo queryGoodsStock(ResultVo param) throws Exception{

        ResultVo resultVo = new ResultVo();
        List<Query> queryList = new ArrayList<Query>();

        String pagesize = param.getPageSize();
        String currentpage = param.getCurrentpage();

        int pageNum = 1;
        int psize = 10;

        if (StringContentUtil.isNoEmpty(pagesize)) {
            psize = ObjectUtil.convToInteger(pagesize);
        }

        if (StringContentUtil.isNoEmpty(currentpage)) {
            pageNum = ObjectUtil.convToInteger(currentpage);
        }
//        因为sqlserver2000太老，不支持函数
//        this.setPageInfo(psize, pageNum);


        // TODO: 2018/3/6 模糊查询，如果要用把xml的搜索改为like 
       /* if(StringUtils.isNotBlank(param.getGoodsCode())){
            param.setGoodsCode("%" + param.getGoodsCode() + "%");
        }
        if(StringUtils.isNotBlank(param.getGoodsName())){
            param.setGoodsName("%" + param.getGoodsName() + "%");
        }*/
        Query query = new Query();
        BeanUtils.copyProperties(param, query);
        queryList = queryMapperExt.selectStocks(query.getGoodsCode(),query.getGoodsName());
        for (Iterator<Query> queryIterator = queryList.iterator(); queryIterator.hasNext(); ) {
            Query next = queryIterator.next();
            BigDecimal recMoney = new BigDecimal(next.getRecPrice());
            BigDecimal qty = new BigDecimal(next.getQty());
            String rec = null;
            String qt = null;
            //设置金额四舍五入取两位小数
            rec = recMoney.setScale(2, RoundingMode.HALF_UP).toString();
            //设置数量取整数
            qt = qty.setScale(0).toString();
            next.setRecPrice(rec);
            next.setQty(qt);
        }
//        this.setReturnPageInfo(psize, pageNum, queryList, resultVo);
        resultVo.setRows(queryList);
        return resultVo;
    }

    @Override
    public List<Query> queryGoodsCode(Map<String, Object> map) throws Exception {
        if(map == null){
            map = new HashMap<String,Object>();
        }
        String code = (String) map.get("code");
        List<Query> queryList = new ArrayList<Query>();
        queryList = queryMapperExt.queryGoodsCode("%" + code + "%");
        return queryList;
    }

    @Override
    public List<Query> queryGoodsName(Map<String, Object> map) throws Exception {
        if(map == null){
            map = new HashMap<String,Object>();
        }
        String name = (String) map.get("name");
        List<Query> queryList = new ArrayList<Query>();
        queryList = queryMapperExt.queryGoodsName("%" + name + "%");
        return queryList;
    }
}
