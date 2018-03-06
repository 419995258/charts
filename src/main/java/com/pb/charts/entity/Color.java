package com.pb.charts.entity;

public class Color {
    private Integer colorid;

    private String name;

    private String remark;

    private String barcode;

    private Integer sysrow;

    private Integer order;

    private String py;

    private String xbarcode;

    private String xname;

    private Integer xcolorid;

    private Integer lcolorid;

    private String lbarcode;

    private String lname;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Integer getSysrow() {
        return sysrow;
    }

    public void setSysrow(Integer sysrow) {
        this.sysrow = sysrow;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py == null ? null : py.trim();
    }

    public String getXbarcode() {
        return xbarcode;
    }

    public void setXbarcode(String xbarcode) {
        this.xbarcode = xbarcode == null ? null : xbarcode.trim();
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname == null ? null : xname.trim();
    }

    public Integer getXcolorid() {
        return xcolorid;
    }

    public void setXcolorid(Integer xcolorid) {
        this.xcolorid = xcolorid;
    }

    public Integer getLcolorid() {
        return lcolorid;
    }

    public void setLcolorid(Integer lcolorid) {
        this.lcolorid = lcolorid;
    }

    public String getLbarcode() {
        return lbarcode;
    }

    public void setLbarcode(String lbarcode) {
        this.lbarcode = lbarcode == null ? null : lbarcode.trim();
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }
}