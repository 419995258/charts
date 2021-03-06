package com.pb.charts.entity;

import java.util.ArrayList;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andColoridIsNull() {
            addCriterion("COLORID is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("COLORID is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("COLORID =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("COLORID <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("COLORID >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLORID >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("COLORID <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("COLORID <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("COLORID in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("COLORID not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("COLORID between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("COLORID not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("BARCODE is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("BARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("BARCODE =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("BARCODE <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("BARCODE >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BARCODE >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("BARCODE <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("BARCODE <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("BARCODE like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("BARCODE not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("BARCODE in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("BARCODE not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("BARCODE between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("BARCODE not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andSysrowIsNull() {
            addCriterion("sysrow is null");
            return (Criteria) this;
        }

        public Criteria andSysrowIsNotNull() {
            addCriterion("sysrow is not null");
            return (Criteria) this;
        }

        public Criteria andSysrowEqualTo(Integer value) {
            addCriterion("sysrow =", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowNotEqualTo(Integer value) {
            addCriterion("sysrow <>", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowGreaterThan(Integer value) {
            addCriterion("sysrow >", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysrow >=", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowLessThan(Integer value) {
            addCriterion("sysrow <", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowLessThanOrEqualTo(Integer value) {
            addCriterion("sysrow <=", value, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowIn(List<Integer> values) {
            addCriterion("sysrow in", values, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowNotIn(List<Integer> values) {
            addCriterion("sysrow not in", values, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowBetween(Integer value1, Integer value2) {
            addCriterion("sysrow between", value1, value2, "sysrow");
            return (Criteria) this;
        }

        public Criteria andSysrowNotBetween(Integer value1, Integer value2) {
            addCriterion("sysrow not between", value1, value2, "sysrow");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andPyIsNull() {
            addCriterion("py is null");
            return (Criteria) this;
        }

        public Criteria andPyIsNotNull() {
            addCriterion("py is not null");
            return (Criteria) this;
        }

        public Criteria andPyEqualTo(String value) {
            addCriterion("py =", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotEqualTo(String value) {
            addCriterion("py <>", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThan(String value) {
            addCriterion("py >", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThanOrEqualTo(String value) {
            addCriterion("py >=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThan(String value) {
            addCriterion("py <", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThanOrEqualTo(String value) {
            addCriterion("py <=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLike(String value) {
            addCriterion("py like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotLike(String value) {
            addCriterion("py not like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyIn(List<String> values) {
            addCriterion("py in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotIn(List<String> values) {
            addCriterion("py not in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyBetween(String value1, String value2) {
            addCriterion("py between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotBetween(String value1, String value2) {
            addCriterion("py not between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andXbarcodeIsNull() {
            addCriterion("XBARCODE is null");
            return (Criteria) this;
        }

        public Criteria andXbarcodeIsNotNull() {
            addCriterion("XBARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andXbarcodeEqualTo(String value) {
            addCriterion("XBARCODE =", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeNotEqualTo(String value) {
            addCriterion("XBARCODE <>", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeGreaterThan(String value) {
            addCriterion("XBARCODE >", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("XBARCODE >=", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeLessThan(String value) {
            addCriterion("XBARCODE <", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeLessThanOrEqualTo(String value) {
            addCriterion("XBARCODE <=", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeLike(String value) {
            addCriterion("XBARCODE like", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeNotLike(String value) {
            addCriterion("XBARCODE not like", value, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeIn(List<String> values) {
            addCriterion("XBARCODE in", values, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeNotIn(List<String> values) {
            addCriterion("XBARCODE not in", values, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeBetween(String value1, String value2) {
            addCriterion("XBARCODE between", value1, value2, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXbarcodeNotBetween(String value1, String value2) {
            addCriterion("XBARCODE not between", value1, value2, "xbarcode");
            return (Criteria) this;
        }

        public Criteria andXnameIsNull() {
            addCriterion("xname is null");
            return (Criteria) this;
        }

        public Criteria andXnameIsNotNull() {
            addCriterion("xname is not null");
            return (Criteria) this;
        }

        public Criteria andXnameEqualTo(String value) {
            addCriterion("xname =", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameNotEqualTo(String value) {
            addCriterion("xname <>", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameGreaterThan(String value) {
            addCriterion("xname >", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameGreaterThanOrEqualTo(String value) {
            addCriterion("xname >=", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameLessThan(String value) {
            addCriterion("xname <", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameLessThanOrEqualTo(String value) {
            addCriterion("xname <=", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameLike(String value) {
            addCriterion("xname like", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameNotLike(String value) {
            addCriterion("xname not like", value, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameIn(List<String> values) {
            addCriterion("xname in", values, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameNotIn(List<String> values) {
            addCriterion("xname not in", values, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameBetween(String value1, String value2) {
            addCriterion("xname between", value1, value2, "xname");
            return (Criteria) this;
        }

        public Criteria andXnameNotBetween(String value1, String value2) {
            addCriterion("xname not between", value1, value2, "xname");
            return (Criteria) this;
        }

        public Criteria andXcoloridIsNull() {
            addCriterion("xcolorid is null");
            return (Criteria) this;
        }

        public Criteria andXcoloridIsNotNull() {
            addCriterion("xcolorid is not null");
            return (Criteria) this;
        }

        public Criteria andXcoloridEqualTo(Integer value) {
            addCriterion("xcolorid =", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridNotEqualTo(Integer value) {
            addCriterion("xcolorid <>", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridGreaterThan(Integer value) {
            addCriterion("xcolorid >", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("xcolorid >=", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridLessThan(Integer value) {
            addCriterion("xcolorid <", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridLessThanOrEqualTo(Integer value) {
            addCriterion("xcolorid <=", value, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridIn(List<Integer> values) {
            addCriterion("xcolorid in", values, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridNotIn(List<Integer> values) {
            addCriterion("xcolorid not in", values, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridBetween(Integer value1, Integer value2) {
            addCriterion("xcolorid between", value1, value2, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andXcoloridNotBetween(Integer value1, Integer value2) {
            addCriterion("xcolorid not between", value1, value2, "xcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridIsNull() {
            addCriterion("lcolorid is null");
            return (Criteria) this;
        }

        public Criteria andLcoloridIsNotNull() {
            addCriterion("lcolorid is not null");
            return (Criteria) this;
        }

        public Criteria andLcoloridEqualTo(Integer value) {
            addCriterion("lcolorid =", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridNotEqualTo(Integer value) {
            addCriterion("lcolorid <>", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridGreaterThan(Integer value) {
            addCriterion("lcolorid >", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lcolorid >=", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridLessThan(Integer value) {
            addCriterion("lcolorid <", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridLessThanOrEqualTo(Integer value) {
            addCriterion("lcolorid <=", value, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridIn(List<Integer> values) {
            addCriterion("lcolorid in", values, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridNotIn(List<Integer> values) {
            addCriterion("lcolorid not in", values, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridBetween(Integer value1, Integer value2) {
            addCriterion("lcolorid between", value1, value2, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLcoloridNotBetween(Integer value1, Integer value2) {
            addCriterion("lcolorid not between", value1, value2, "lcolorid");
            return (Criteria) this;
        }

        public Criteria andLbarcodeIsNull() {
            addCriterion("lbarcode is null");
            return (Criteria) this;
        }

        public Criteria andLbarcodeIsNotNull() {
            addCriterion("lbarcode is not null");
            return (Criteria) this;
        }

        public Criteria andLbarcodeEqualTo(String value) {
            addCriterion("lbarcode =", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeNotEqualTo(String value) {
            addCriterion("lbarcode <>", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeGreaterThan(String value) {
            addCriterion("lbarcode >", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("lbarcode >=", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeLessThan(String value) {
            addCriterion("lbarcode <", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeLessThanOrEqualTo(String value) {
            addCriterion("lbarcode <=", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeLike(String value) {
            addCriterion("lbarcode like", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeNotLike(String value) {
            addCriterion("lbarcode not like", value, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeIn(List<String> values) {
            addCriterion("lbarcode in", values, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeNotIn(List<String> values) {
            addCriterion("lbarcode not in", values, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeBetween(String value1, String value2) {
            addCriterion("lbarcode between", value1, value2, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLbarcodeNotBetween(String value1, String value2) {
            addCriterion("lbarcode not between", value1, value2, "lbarcode");
            return (Criteria) this;
        }

        public Criteria andLnameIsNull() {
            addCriterion("lname is null");
            return (Criteria) this;
        }

        public Criteria andLnameIsNotNull() {
            addCriterion("lname is not null");
            return (Criteria) this;
        }

        public Criteria andLnameEqualTo(String value) {
            addCriterion("lname =", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotEqualTo(String value) {
            addCriterion("lname <>", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThan(String value) {
            addCriterion("lname >", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThanOrEqualTo(String value) {
            addCriterion("lname >=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThan(String value) {
            addCriterion("lname <", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThanOrEqualTo(String value) {
            addCriterion("lname <=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLike(String value) {
            addCriterion("lname like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotLike(String value) {
            addCriterion("lname not like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameIn(List<String> values) {
            addCriterion("lname in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotIn(List<String> values) {
            addCriterion("lname not in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameBetween(String value1, String value2) {
            addCriterion("lname between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotBetween(String value1, String value2) {
            addCriterion("lname not between", value1, value2, "lname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}