package com.pb.charts.entity;

import java.math.BigDecimal;

public class GoodsStocks {
    private Integer orderid;

    private String ptypeid;

    private String ktypeid;

    private String jobnumber;

    private String outfactorydate;

    private BigDecimal qty;

    private BigDecimal price;

    private BigDecimal total;

    private Integer goodsorder;

    private String zoneid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getPtypeid() {
        return ptypeid;
    }

    public void setPtypeid(String ptypeid) {
        this.ptypeid = ptypeid == null ? null : ptypeid.trim();
    }

    public String getKtypeid() {
        return ktypeid;
    }

    public void setKtypeid(String ktypeid) {
        this.ktypeid = ktypeid == null ? null : ktypeid.trim();
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber == null ? null : jobnumber.trim();
    }

    public String getOutfactorydate() {
        return outfactorydate;
    }

    public void setOutfactorydate(String outfactorydate) {
        this.outfactorydate = outfactorydate == null ? null : outfactorydate.trim();
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getGoodsorder() {
        return goodsorder;
    }

    public void setGoodsorder(Integer goodsorder) {
        this.goodsorder = goodsorder;
    }

    public String getZoneid() {
        return zoneid;
    }

    public void setZoneid(String zoneid) {
        this.zoneid = zoneid == null ? null : zoneid.trim();
    }
}