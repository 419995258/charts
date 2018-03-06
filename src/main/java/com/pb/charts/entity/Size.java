package com.pb.charts.entity;

public class Size {
    private Integer sizeid;

    private String name;

    private String remark;

    private String barcode;

    private Integer sysrow;

    private Integer order;

    private String xbarcode;

    private String xname;

    private Integer xsizeid;

    private Integer lsizeid;

    private String lbarcode;

    private String lname;

    public Integer getSizeid() {
        return sizeid;
    }

    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
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

    public Integer getXsizeid() {
        return xsizeid;
    }

    public void setXsizeid(Integer xsizeid) {
        this.xsizeid = xsizeid;
    }

    public Integer getLsizeid() {
        return lsizeid;
    }

    public void setLsizeid(Integer lsizeid) {
        this.lsizeid = lsizeid;
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