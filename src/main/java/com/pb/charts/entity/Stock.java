package com.pb.charts.entity;

public class Stock {
    private String typeid;

    private String parid;

    private Short leveal;

    private Integer sonnum;

    private Integer soncount;

    private String fullname;

    private String name;

    private String usercode;

    private String comment;

    private Boolean deleted;

    private String namepy;

    private Integer rec;

    private Integer parrec;

    private String zoneid;

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getParid() {
        return parid;
    }

    public void setParid(String parid) {
        this.parid = parid == null ? null : parid.trim();
    }

    public Short getLeveal() {
        return leveal;
    }

    public void setLeveal(Short leveal) {
        this.leveal = leveal;
    }

    public Integer getSonnum() {
        return sonnum;
    }

    public void setSonnum(Integer sonnum) {
        this.sonnum = sonnum;
    }

    public Integer getSoncount() {
        return soncount;
    }

    public void setSoncount(Integer soncount) {
        this.soncount = soncount;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getNamepy() {
        return namepy;
    }

    public void setNamepy(String namepy) {
        this.namepy = namepy == null ? null : namepy.trim();
    }

    public Integer getRec() {
        return rec;
    }

    public void setRec(Integer rec) {
        this.rec = rec;
    }

    public Integer getParrec() {
        return parrec;
    }

    public void setParrec(Integer parrec) {
        this.parrec = parrec;
    }

    public String getZoneid() {
        return zoneid;
    }

    public void setZoneid(String zoneid) {
        this.zoneid = zoneid == null ? null : zoneid.trim();
    }
}