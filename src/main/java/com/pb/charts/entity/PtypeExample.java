package com.pb.charts.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtypeExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeId like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeId not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andParidIsNull() {
            addCriterion("ParId is null");
            return (Criteria) this;
        }

        public Criteria andParidIsNotNull() {
            addCriterion("ParId is not null");
            return (Criteria) this;
        }

        public Criteria andParidEqualTo(String value) {
            addCriterion("ParId =", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotEqualTo(String value) {
            addCriterion("ParId <>", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThan(String value) {
            addCriterion("ParId >", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThanOrEqualTo(String value) {
            addCriterion("ParId >=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThan(String value) {
            addCriterion("ParId <", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThanOrEqualTo(String value) {
            addCriterion("ParId <=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLike(String value) {
            addCriterion("ParId like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotLike(String value) {
            addCriterion("ParId not like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidIn(List<String> values) {
            addCriterion("ParId in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotIn(List<String> values) {
            addCriterion("ParId not in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidBetween(String value1, String value2) {
            addCriterion("ParId between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotBetween(String value1, String value2) {
            addCriterion("ParId not between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andLevealIsNull() {
            addCriterion("leveal is null");
            return (Criteria) this;
        }

        public Criteria andLevealIsNotNull() {
            addCriterion("leveal is not null");
            return (Criteria) this;
        }

        public Criteria andLevealEqualTo(Short value) {
            addCriterion("leveal =", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealNotEqualTo(Short value) {
            addCriterion("leveal <>", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealGreaterThan(Short value) {
            addCriterion("leveal >", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealGreaterThanOrEqualTo(Short value) {
            addCriterion("leveal >=", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealLessThan(Short value) {
            addCriterion("leveal <", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealLessThanOrEqualTo(Short value) {
            addCriterion("leveal <=", value, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealIn(List<Short> values) {
            addCriterion("leveal in", values, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealNotIn(List<Short> values) {
            addCriterion("leveal not in", values, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealBetween(Short value1, Short value2) {
            addCriterion("leveal between", value1, value2, "leveal");
            return (Criteria) this;
        }

        public Criteria andLevealNotBetween(Short value1, Short value2) {
            addCriterion("leveal not between", value1, value2, "leveal");
            return (Criteria) this;
        }

        public Criteria andSonnumIsNull() {
            addCriterion("sonnum is null");
            return (Criteria) this;
        }

        public Criteria andSonnumIsNotNull() {
            addCriterion("sonnum is not null");
            return (Criteria) this;
        }

        public Criteria andSonnumEqualTo(Integer value) {
            addCriterion("sonnum =", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumNotEqualTo(Integer value) {
            addCriterion("sonnum <>", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumGreaterThan(Integer value) {
            addCriterion("sonnum >", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sonnum >=", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumLessThan(Integer value) {
            addCriterion("sonnum <", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumLessThanOrEqualTo(Integer value) {
            addCriterion("sonnum <=", value, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumIn(List<Integer> values) {
            addCriterion("sonnum in", values, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumNotIn(List<Integer> values) {
            addCriterion("sonnum not in", values, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumBetween(Integer value1, Integer value2) {
            addCriterion("sonnum between", value1, value2, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sonnum not between", value1, value2, "sonnum");
            return (Criteria) this;
        }

        public Criteria andSoncountIsNull() {
            addCriterion("soncount is null");
            return (Criteria) this;
        }

        public Criteria andSoncountIsNotNull() {
            addCriterion("soncount is not null");
            return (Criteria) this;
        }

        public Criteria andSoncountEqualTo(Integer value) {
            addCriterion("soncount =", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountNotEqualTo(Integer value) {
            addCriterion("soncount <>", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountGreaterThan(Integer value) {
            addCriterion("soncount >", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("soncount >=", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountLessThan(Integer value) {
            addCriterion("soncount <", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountLessThanOrEqualTo(Integer value) {
            addCriterion("soncount <=", value, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountIn(List<Integer> values) {
            addCriterion("soncount in", values, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountNotIn(List<Integer> values) {
            addCriterion("soncount not in", values, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountBetween(Integer value1, Integer value2) {
            addCriterion("soncount between", value1, value2, "soncount");
            return (Criteria) this;
        }

        public Criteria andSoncountNotBetween(Integer value1, Integer value2) {
            addCriterion("soncount not between", value1, value2, "soncount");
            return (Criteria) this;
        }

        public Criteria andCanmodifyIsNull() {
            addCriterion("CanModify is null");
            return (Criteria) this;
        }

        public Criteria andCanmodifyIsNotNull() {
            addCriterion("CanModify is not null");
            return (Criteria) this;
        }

        public Criteria andCanmodifyEqualTo(String value) {
            addCriterion("CanModify =", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyNotEqualTo(String value) {
            addCriterion("CanModify <>", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyGreaterThan(String value) {
            addCriterion("CanModify >", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyGreaterThanOrEqualTo(String value) {
            addCriterion("CanModify >=", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyLessThan(String value) {
            addCriterion("CanModify <", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyLessThanOrEqualTo(String value) {
            addCriterion("CanModify <=", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyLike(String value) {
            addCriterion("CanModify like", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyNotLike(String value) {
            addCriterion("CanModify not like", value, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyIn(List<String> values) {
            addCriterion("CanModify in", values, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyNotIn(List<String> values) {
            addCriterion("CanModify not in", values, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyBetween(String value1, String value2) {
            addCriterion("CanModify between", value1, value2, "canmodify");
            return (Criteria) this;
        }

        public Criteria andCanmodifyNotBetween(String value1, String value2) {
            addCriterion("CanModify not between", value1, value2, "canmodify");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("UserCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("UserCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("UserCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("UserCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("UserCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("UserCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("UserCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("UserCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("UserCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("UserCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("UserCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("UserCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("UserCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("UserCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("BarCode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("BarCode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("BarCode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("BarCode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("BarCode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BarCode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("BarCode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("BarCode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("BarCode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("BarCode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("BarCode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("BarCode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("BarCode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("BarCode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("Standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("Standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("Standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("Standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("Standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("Standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("Standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("Standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("Standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("Standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("Standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("Standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("Standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("Standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUnit1IsNull() {
            addCriterion("Unit1 is null");
            return (Criteria) this;
        }

        public Criteria andUnit1IsNotNull() {
            addCriterion("Unit1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit1EqualTo(String value) {
            addCriterion("Unit1 =", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotEqualTo(String value) {
            addCriterion("Unit1 <>", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1GreaterThan(String value) {
            addCriterion("Unit1 >", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1GreaterThanOrEqualTo(String value) {
            addCriterion("Unit1 >=", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1LessThan(String value) {
            addCriterion("Unit1 <", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1LessThanOrEqualTo(String value) {
            addCriterion("Unit1 <=", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1Like(String value) {
            addCriterion("Unit1 like", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotLike(String value) {
            addCriterion("Unit1 not like", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1In(List<String> values) {
            addCriterion("Unit1 in", values, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotIn(List<String> values) {
            addCriterion("Unit1 not in", values, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1Between(String value1, String value2) {
            addCriterion("Unit1 between", value1, value2, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotBetween(String value1, String value2) {
            addCriterion("Unit1 not between", value1, value2, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit2IsNull() {
            addCriterion("Unit2 is null");
            return (Criteria) this;
        }

        public Criteria andUnit2IsNotNull() {
            addCriterion("Unit2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit2EqualTo(String value) {
            addCriterion("Unit2 =", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotEqualTo(String value) {
            addCriterion("Unit2 <>", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2GreaterThan(String value) {
            addCriterion("Unit2 >", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2GreaterThanOrEqualTo(String value) {
            addCriterion("Unit2 >=", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2LessThan(String value) {
            addCriterion("Unit2 <", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2LessThanOrEqualTo(String value) {
            addCriterion("Unit2 <=", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2Like(String value) {
            addCriterion("Unit2 like", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotLike(String value) {
            addCriterion("Unit2 not like", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2In(List<String> values) {
            addCriterion("Unit2 in", values, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotIn(List<String> values) {
            addCriterion("Unit2 not in", values, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2Between(String value1, String value2) {
            addCriterion("Unit2 between", value1, value2, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotBetween(String value1, String value2) {
            addCriterion("Unit2 not between", value1, value2, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnitrate1IsNull() {
            addCriterion("UnitRate1 is null");
            return (Criteria) this;
        }

        public Criteria andUnitrate1IsNotNull() {
            addCriterion("UnitRate1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitrate1EqualTo(BigDecimal value) {
            addCriterion("UnitRate1 =", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1NotEqualTo(BigDecimal value) {
            addCriterion("UnitRate1 <>", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1GreaterThan(BigDecimal value) {
            addCriterion("UnitRate1 >", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitRate1 >=", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1LessThan(BigDecimal value) {
            addCriterion("UnitRate1 <", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitRate1 <=", value, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1In(List<BigDecimal> values) {
            addCriterion("UnitRate1 in", values, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1NotIn(List<BigDecimal> values) {
            addCriterion("UnitRate1 not in", values, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitRate1 between", value1, value2, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitRate1 not between", value1, value2, "unitrate1");
            return (Criteria) this;
        }

        public Criteria andUnitrate2IsNull() {
            addCriterion("UnitRate2 is null");
            return (Criteria) this;
        }

        public Criteria andUnitrate2IsNotNull() {
            addCriterion("UnitRate2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitrate2EqualTo(BigDecimal value) {
            addCriterion("UnitRate2 =", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2NotEqualTo(BigDecimal value) {
            addCriterion("UnitRate2 <>", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2GreaterThan(BigDecimal value) {
            addCriterion("UnitRate2 >", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitRate2 >=", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2LessThan(BigDecimal value) {
            addCriterion("UnitRate2 <", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitRate2 <=", value, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2In(List<BigDecimal> values) {
            addCriterion("UnitRate2 in", values, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2NotIn(List<BigDecimal> values) {
            addCriterion("UnitRate2 not in", values, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitRate2 between", value1, value2, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andUnitrate2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitRate2 not between", value1, value2, "unitrate2");
            return (Criteria) this;
        }

        public Criteria andPreprice1IsNull() {
            addCriterion("preprice1 is null");
            return (Criteria) this;
        }

        public Criteria andPreprice1IsNotNull() {
            addCriterion("preprice1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreprice1EqualTo(BigDecimal value) {
            addCriterion("preprice1 =", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1NotEqualTo(BigDecimal value) {
            addCriterion("preprice1 <>", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1GreaterThan(BigDecimal value) {
            addCriterion("preprice1 >", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice1 >=", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1LessThan(BigDecimal value) {
            addCriterion("preprice1 <", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice1 <=", value, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1In(List<BigDecimal> values) {
            addCriterion("preprice1 in", values, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1NotIn(List<BigDecimal> values) {
            addCriterion("preprice1 not in", values, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice1 between", value1, value2, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice1 not between", value1, value2, "preprice1");
            return (Criteria) this;
        }

        public Criteria andPreprice2IsNull() {
            addCriterion("preprice2 is null");
            return (Criteria) this;
        }

        public Criteria andPreprice2IsNotNull() {
            addCriterion("preprice2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreprice2EqualTo(BigDecimal value) {
            addCriterion("preprice2 =", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2NotEqualTo(BigDecimal value) {
            addCriterion("preprice2 <>", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2GreaterThan(BigDecimal value) {
            addCriterion("preprice2 >", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice2 >=", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2LessThan(BigDecimal value) {
            addCriterion("preprice2 <", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice2 <=", value, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2In(List<BigDecimal> values) {
            addCriterion("preprice2 in", values, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2NotIn(List<BigDecimal> values) {
            addCriterion("preprice2 not in", values, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice2 between", value1, value2, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice2 not between", value1, value2, "preprice2");
            return (Criteria) this;
        }

        public Criteria andPreprice3IsNull() {
            addCriterion("preprice3 is null");
            return (Criteria) this;
        }

        public Criteria andPreprice3IsNotNull() {
            addCriterion("preprice3 is not null");
            return (Criteria) this;
        }

        public Criteria andPreprice3EqualTo(BigDecimal value) {
            addCriterion("preprice3 =", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3NotEqualTo(BigDecimal value) {
            addCriterion("preprice3 <>", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3GreaterThan(BigDecimal value) {
            addCriterion("preprice3 >", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice3 >=", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3LessThan(BigDecimal value) {
            addCriterion("preprice3 <", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice3 <=", value, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3In(List<BigDecimal> values) {
            addCriterion("preprice3 in", values, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3NotIn(List<BigDecimal> values) {
            addCriterion("preprice3 not in", values, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice3 between", value1, value2, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice3 not between", value1, value2, "preprice3");
            return (Criteria) this;
        }

        public Criteria andPreprice4IsNull() {
            addCriterion("preprice4 is null");
            return (Criteria) this;
        }

        public Criteria andPreprice4IsNotNull() {
            addCriterion("preprice4 is not null");
            return (Criteria) this;
        }

        public Criteria andPreprice4EqualTo(BigDecimal value) {
            addCriterion("preprice4 =", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4NotEqualTo(BigDecimal value) {
            addCriterion("preprice4 <>", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4GreaterThan(BigDecimal value) {
            addCriterion("preprice4 >", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice4 >=", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4LessThan(BigDecimal value) {
            addCriterion("preprice4 <", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("preprice4 <=", value, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4In(List<BigDecimal> values) {
            addCriterion("preprice4 in", values, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4NotIn(List<BigDecimal> values) {
            addCriterion("preprice4 not in", values, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice4 between", value1, value2, "preprice4");
            return (Criteria) this;
        }

        public Criteria andPreprice4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preprice4 not between", value1, value2, "preprice4");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthIsNull() {
            addCriterion("UsefulLifeMonth is null");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthIsNotNull() {
            addCriterion("UsefulLifeMonth is not null");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthEqualTo(Short value) {
            addCriterion("UsefulLifeMonth =", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthNotEqualTo(Short value) {
            addCriterion("UsefulLifeMonth <>", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthGreaterThan(Short value) {
            addCriterion("UsefulLifeMonth >", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthGreaterThanOrEqualTo(Short value) {
            addCriterion("UsefulLifeMonth >=", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthLessThan(Short value) {
            addCriterion("UsefulLifeMonth <", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthLessThanOrEqualTo(Short value) {
            addCriterion("UsefulLifeMonth <=", value, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthIn(List<Short> values) {
            addCriterion("UsefulLifeMonth in", values, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthNotIn(List<Short> values) {
            addCriterion("UsefulLifeMonth not in", values, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthBetween(Short value1, Short value2) {
            addCriterion("UsefulLifeMonth between", value1, value2, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifemonthNotBetween(Short value1, Short value2) {
            addCriterion("UsefulLifeMonth not between", value1, value2, "usefullifemonth");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayIsNull() {
            addCriterion("UsefulLifeDay is null");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayIsNotNull() {
            addCriterion("UsefulLifeDay is not null");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayEqualTo(Short value) {
            addCriterion("UsefulLifeDay =", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayNotEqualTo(Short value) {
            addCriterion("UsefulLifeDay <>", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayGreaterThan(Short value) {
            addCriterion("UsefulLifeDay >", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayGreaterThanOrEqualTo(Short value) {
            addCriterion("UsefulLifeDay >=", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayLessThan(Short value) {
            addCriterion("UsefulLifeDay <", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayLessThanOrEqualTo(Short value) {
            addCriterion("UsefulLifeDay <=", value, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayIn(List<Short> values) {
            addCriterion("UsefulLifeDay in", values, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayNotIn(List<Short> values) {
            addCriterion("UsefulLifeDay not in", values, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayBetween(Short value1, Short value2) {
            addCriterion("UsefulLifeDay between", value1, value2, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andUsefullifedayNotBetween(Short value1, Short value2) {
            addCriterion("UsefulLifeDay not between", value1, value2, "usefullifeday");
            return (Criteria) this;
        }

        public Criteria andColorgroupidIsNull() {
            addCriterion("COLORGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andColorgroupidIsNotNull() {
            addCriterion("COLORGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andColorgroupidEqualTo(Integer value) {
            addCriterion("COLORGROUPID =", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidNotEqualTo(Integer value) {
            addCriterion("COLORGROUPID <>", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidGreaterThan(Integer value) {
            addCriterion("COLORGROUPID >", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLORGROUPID >=", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidLessThan(Integer value) {
            addCriterion("COLORGROUPID <", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("COLORGROUPID <=", value, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidIn(List<Integer> values) {
            addCriterion("COLORGROUPID in", values, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidNotIn(List<Integer> values) {
            addCriterion("COLORGROUPID not in", values, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidBetween(Integer value1, Integer value2) {
            addCriterion("COLORGROUPID between", value1, value2, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andColorgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("COLORGROUPID not between", value1, value2, "colorgroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidIsNull() {
            addCriterion("SIZEGROUPID is null");
            return (Criteria) this;
        }

        public Criteria andSizegroupidIsNotNull() {
            addCriterion("SIZEGROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andSizegroupidEqualTo(Integer value) {
            addCriterion("SIZEGROUPID =", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotEqualTo(Integer value) {
            addCriterion("SIZEGROUPID <>", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidGreaterThan(Integer value) {
            addCriterion("SIZEGROUPID >", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIZEGROUPID >=", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidLessThan(Integer value) {
            addCriterion("SIZEGROUPID <", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidLessThanOrEqualTo(Integer value) {
            addCriterion("SIZEGROUPID <=", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidIn(List<Integer> values) {
            addCriterion("SIZEGROUPID in", values, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotIn(List<Integer> values) {
            addCriterion("SIZEGROUPID not in", values, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidBetween(Integer value1, Integer value2) {
            addCriterion("SIZEGROUPID between", value1, value2, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("SIZEGROUPID not between", value1, value2, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andBreakwarnIsNull() {
            addCriterion("BREAKWARN is null");
            return (Criteria) this;
        }

        public Criteria andBreakwarnIsNotNull() {
            addCriterion("BREAKWARN is not null");
            return (Criteria) this;
        }

        public Criteria andBreakwarnEqualTo(BigDecimal value) {
            addCriterion("BREAKWARN =", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnNotEqualTo(BigDecimal value) {
            addCriterion("BREAKWARN <>", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnGreaterThan(BigDecimal value) {
            addCriterion("BREAKWARN >", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BREAKWARN >=", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnLessThan(BigDecimal value) {
            addCriterion("BREAKWARN <", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BREAKWARN <=", value, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnIn(List<BigDecimal> values) {
            addCriterion("BREAKWARN in", values, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnNotIn(List<BigDecimal> values) {
            addCriterion("BREAKWARN not in", values, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BREAKWARN between", value1, value2, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andBreakwarnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BREAKWARN not between", value1, value2, "breakwarn");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andRecpriceIsNull() {
            addCriterion("recPrice is null");
            return (Criteria) this;
        }

        public Criteria andRecpriceIsNotNull() {
            addCriterion("recPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRecpriceEqualTo(BigDecimal value) {
            addCriterion("recPrice =", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceNotEqualTo(BigDecimal value) {
            addCriterion("recPrice <>", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceGreaterThan(BigDecimal value) {
            addCriterion("recPrice >", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recPrice >=", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceLessThan(BigDecimal value) {
            addCriterion("recPrice <", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recPrice <=", value, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceIn(List<BigDecimal> values) {
            addCriterion("recPrice in", values, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceNotIn(List<BigDecimal> values) {
            addCriterion("recPrice not in", values, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recPrice between", value1, value2, "recprice");
            return (Criteria) this;
        }

        public Criteria andRecpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recPrice not between", value1, value2, "recprice");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCostmodeIsNull() {
            addCriterion("costmode is null");
            return (Criteria) this;
        }

        public Criteria andCostmodeIsNotNull() {
            addCriterion("costmode is not null");
            return (Criteria) this;
        }

        public Criteria andCostmodeEqualTo(Integer value) {
            addCriterion("costmode =", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeNotEqualTo(Integer value) {
            addCriterion("costmode <>", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeGreaterThan(Integer value) {
            addCriterion("costmode >", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("costmode >=", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeLessThan(Integer value) {
            addCriterion("costmode <", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeLessThanOrEqualTo(Integer value) {
            addCriterion("costmode <=", value, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeIn(List<Integer> values) {
            addCriterion("costmode in", values, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeNotIn(List<Integer> values) {
            addCriterion("costmode not in", values, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeBetween(Integer value1, Integer value2) {
            addCriterion("costmode between", value1, value2, "costmode");
            return (Criteria) this;
        }

        public Criteria andCostmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("costmode not between", value1, value2, "costmode");
            return (Criteria) this;
        }

        public Criteria andNamepyIsNull() {
            addCriterion("Namepy is null");
            return (Criteria) this;
        }

        public Criteria andNamepyIsNotNull() {
            addCriterion("Namepy is not null");
            return (Criteria) this;
        }

        public Criteria andNamepyEqualTo(String value) {
            addCriterion("Namepy =", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyNotEqualTo(String value) {
            addCriterion("Namepy <>", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyGreaterThan(String value) {
            addCriterion("Namepy >", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyGreaterThanOrEqualTo(String value) {
            addCriterion("Namepy >=", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyLessThan(String value) {
            addCriterion("Namepy <", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyLessThanOrEqualTo(String value) {
            addCriterion("Namepy <=", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyLike(String value) {
            addCriterion("Namepy like", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyNotLike(String value) {
            addCriterion("Namepy not like", value, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyIn(List<String> values) {
            addCriterion("Namepy in", values, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyNotIn(List<String> values) {
            addCriterion("Namepy not in", values, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyBetween(String value1, String value2) {
            addCriterion("Namepy between", value1, value2, "namepy");
            return (Criteria) this;
        }

        public Criteria andNamepyNotBetween(String value1, String value2) {
            addCriterion("Namepy not between", value1, value2, "namepy");
            return (Criteria) this;
        }

        public Criteria andWarnupIsNull() {
            addCriterion("warnup is null");
            return (Criteria) this;
        }

        public Criteria andWarnupIsNotNull() {
            addCriterion("warnup is not null");
            return (Criteria) this;
        }

        public Criteria andWarnupEqualTo(BigDecimal value) {
            addCriterion("warnup =", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupNotEqualTo(BigDecimal value) {
            addCriterion("warnup <>", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupGreaterThan(BigDecimal value) {
            addCriterion("warnup >", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warnup >=", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupLessThan(BigDecimal value) {
            addCriterion("warnup <", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warnup <=", value, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupIn(List<BigDecimal> values) {
            addCriterion("warnup in", values, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupNotIn(List<BigDecimal> values) {
            addCriterion("warnup not in", values, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warnup between", value1, value2, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarnupNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warnup not between", value1, value2, "warnup");
            return (Criteria) this;
        }

        public Criteria andWarndownIsNull() {
            addCriterion("warndown is null");
            return (Criteria) this;
        }

        public Criteria andWarndownIsNotNull() {
            addCriterion("warndown is not null");
            return (Criteria) this;
        }

        public Criteria andWarndownEqualTo(BigDecimal value) {
            addCriterion("warndown =", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownNotEqualTo(BigDecimal value) {
            addCriterion("warndown <>", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownGreaterThan(BigDecimal value) {
            addCriterion("warndown >", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warndown >=", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownLessThan(BigDecimal value) {
            addCriterion("warndown <", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warndown <=", value, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownIn(List<BigDecimal> values) {
            addCriterion("warndown in", values, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownNotIn(List<BigDecimal> values) {
            addCriterion("warndown not in", values, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warndown between", value1, value2, "warndown");
            return (Criteria) this;
        }

        public Criteria andWarndownNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warndown not between", value1, value2, "warndown");
            return (Criteria) this;
        }

        public Criteria andRecIsNull() {
            addCriterion("Rec is null");
            return (Criteria) this;
        }

        public Criteria andRecIsNotNull() {
            addCriterion("Rec is not null");
            return (Criteria) this;
        }

        public Criteria andRecEqualTo(Integer value) {
            addCriterion("Rec =", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecNotEqualTo(Integer value) {
            addCriterion("Rec <>", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecGreaterThan(Integer value) {
            addCriterion("Rec >", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecGreaterThanOrEqualTo(Integer value) {
            addCriterion("Rec >=", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecLessThan(Integer value) {
            addCriterion("Rec <", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecLessThanOrEqualTo(Integer value) {
            addCriterion("Rec <=", value, "rec");
            return (Criteria) this;
        }

        public Criteria andRecIn(List<Integer> values) {
            addCriterion("Rec in", values, "rec");
            return (Criteria) this;
        }

        public Criteria andRecNotIn(List<Integer> values) {
            addCriterion("Rec not in", values, "rec");
            return (Criteria) this;
        }

        public Criteria andRecBetween(Integer value1, Integer value2) {
            addCriterion("Rec between", value1, value2, "rec");
            return (Criteria) this;
        }

        public Criteria andRecNotBetween(Integer value1, Integer value2) {
            addCriterion("Rec not between", value1, value2, "rec");
            return (Criteria) this;
        }

        public Criteria andParrecIsNull() {
            addCriterion("ParRec is null");
            return (Criteria) this;
        }

        public Criteria andParrecIsNotNull() {
            addCriterion("ParRec is not null");
            return (Criteria) this;
        }

        public Criteria andParrecEqualTo(Integer value) {
            addCriterion("ParRec =", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecNotEqualTo(Integer value) {
            addCriterion("ParRec <>", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecGreaterThan(Integer value) {
            addCriterion("ParRec >", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParRec >=", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecLessThan(Integer value) {
            addCriterion("ParRec <", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecLessThanOrEqualTo(Integer value) {
            addCriterion("ParRec <=", value, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecIn(List<Integer> values) {
            addCriterion("ParRec in", values, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecNotIn(List<Integer> values) {
            addCriterion("ParRec not in", values, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecBetween(Integer value1, Integer value2) {
            addCriterion("ParRec between", value1, value2, "parrec");
            return (Criteria) this;
        }

        public Criteria andParrecNotBetween(Integer value1, Integer value2) {
            addCriterion("ParRec not between", value1, value2, "parrec");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNull() {
            addCriterion("FORMATID is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FORMATID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(String value) {
            addCriterion("FORMATID =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(String value) {
            addCriterion("FORMATID <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(String value) {
            addCriterion("FORMATID >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATID >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(String value) {
            addCriterion("FORMATID <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(String value) {
            addCriterion("FORMATID <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLike(String value) {
            addCriterion("FORMATID like", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotLike(String value) {
            addCriterion("FORMATID not like", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<String> values) {
            addCriterion("FORMATID in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<String> values) {
            addCriterion("FORMATID not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(String value1, String value2) {
            addCriterion("FORMATID between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(String value1, String value2) {
            addCriterion("FORMATID not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andCspzIsNull() {
            addCriterion("CSPZ is null");
            return (Criteria) this;
        }

        public Criteria andCspzIsNotNull() {
            addCriterion("CSPZ is not null");
            return (Criteria) this;
        }

        public Criteria andCspzEqualTo(Integer value) {
            addCriterion("CSPZ =", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzNotEqualTo(Integer value) {
            addCriterion("CSPZ <>", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzGreaterThan(Integer value) {
            addCriterion("CSPZ >", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSPZ >=", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzLessThan(Integer value) {
            addCriterion("CSPZ <", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzLessThanOrEqualTo(Integer value) {
            addCriterion("CSPZ <=", value, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzIn(List<Integer> values) {
            addCriterion("CSPZ in", values, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzNotIn(List<Integer> values) {
            addCriterion("CSPZ not in", values, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzBetween(Integer value1, Integer value2) {
            addCriterion("CSPZ between", value1, value2, "cspz");
            return (Criteria) this;
        }

        public Criteria andCspzNotBetween(Integer value1, Integer value2) {
            addCriterion("CSPZ not between", value1, value2, "cspz");
            return (Criteria) this;
        }

        public Criteria andRecprice1IsNull() {
            addCriterion("recPrice1 is null");
            return (Criteria) this;
        }

        public Criteria andRecprice1IsNotNull() {
            addCriterion("recPrice1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecprice1EqualTo(BigDecimal value) {
            addCriterion("recPrice1 =", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1NotEqualTo(BigDecimal value) {
            addCriterion("recPrice1 <>", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1GreaterThan(BigDecimal value) {
            addCriterion("recPrice1 >", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recPrice1 >=", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1LessThan(BigDecimal value) {
            addCriterion("recPrice1 <", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("recPrice1 <=", value, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1In(List<BigDecimal> values) {
            addCriterion("recPrice1 in", values, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1NotIn(List<BigDecimal> values) {
            addCriterion("recPrice1 not in", values, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("recPrice1 between", value1, value2, "recprice1");
            return (Criteria) this;
        }

        public Criteria andRecprice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recPrice1 not between", value1, value2, "recprice1");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("MinPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("MinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(BigDecimal value) {
            addCriterion("MinPrice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(BigDecimal value) {
            addCriterion("MinPrice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(BigDecimal value) {
            addCriterion("MinPrice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinPrice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(BigDecimal value) {
            addCriterion("MinPrice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinPrice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<BigDecimal> values) {
            addCriterion("MinPrice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<BigDecimal> values) {
            addCriterion("MinPrice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinPrice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinPrice not between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(BigDecimal value) {
            addCriterion("vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(BigDecimal value) {
            addCriterion("vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(BigDecimal value) {
            addCriterion("vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(BigDecimal value) {
            addCriterion("vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<BigDecimal> values) {
            addCriterion("vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<BigDecimal> values) {
            addCriterion("vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vipprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceIsNull() {
            addCriterion("specialprice is null");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceIsNotNull() {
            addCriterion("specialprice is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceEqualTo(BigDecimal value) {
            addCriterion("specialprice =", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceNotEqualTo(BigDecimal value) {
            addCriterion("specialprice <>", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceGreaterThan(BigDecimal value) {
            addCriterion("specialprice >", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("specialprice >=", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceLessThan(BigDecimal value) {
            addCriterion("specialprice <", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("specialprice <=", value, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceIn(List<BigDecimal> values) {
            addCriterion("specialprice in", values, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceNotIn(List<BigDecimal> values) {
            addCriterion("specialprice not in", values, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specialprice between", value1, value2, "specialprice");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("specialprice not between", value1, value2, "specialprice");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxrate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxrate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Integer value) {
            addCriterion("taxrate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Integer value) {
            addCriterion("taxrate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Integer value) {
            addCriterion("taxrate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("taxrate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Integer value) {
            addCriterion("taxrate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Integer value) {
            addCriterion("taxrate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Integer> values) {
            addCriterion("taxrate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Integer> values) {
            addCriterion("taxrate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Integer value1, Integer value2) {
            addCriterion("taxrate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Integer value1, Integer value2) {
            addCriterion("taxrate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(Boolean value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(Boolean value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(Boolean value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(Boolean value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(Boolean value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<Boolean> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<Boolean> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(Boolean value1, Boolean value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("Stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("Stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Boolean value) {
            addCriterion("Stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Boolean value) {
            addCriterion("Stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Boolean value) {
            addCriterion("Stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Boolean value) {
            addCriterion("Stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Boolean value) {
            addCriterion("Stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Boolean> values) {
            addCriterion("Stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Boolean> values) {
            addCriterion("Stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Boolean value1, Boolean value2) {
            addCriterion("Stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Stop not between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(Integer value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(Integer value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(Integer value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(Integer value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<Integer> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<Integer> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(Integer value1, Integer value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(Integer value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(Integer value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(Integer value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(Integer value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(Integer value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<Integer> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<Integer> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(Integer value1, Integer value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(Integer value1, Integer value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIsNull() {
            addCriterion("retailPrice is null");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIsNotNull() {
            addCriterion("retailPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRetailpriceEqualTo(BigDecimal value) {
            addCriterion("retailPrice =", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotEqualTo(BigDecimal value) {
            addCriterion("retailPrice <>", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceGreaterThan(BigDecimal value) {
            addCriterion("retailPrice >", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retailPrice >=", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceLessThan(BigDecimal value) {
            addCriterion("retailPrice <", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retailPrice <=", value, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceIn(List<BigDecimal> values) {
            addCriterion("retailPrice in", values, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotIn(List<BigDecimal> values) {
            addCriterion("retailPrice not in", values, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retailPrice between", value1, value2, "retailprice");
            return (Criteria) this;
        }

        public Criteria andRetailpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retailPrice not between", value1, value2, "retailprice");
            return (Criteria) this;
        }

        public Criteria andDiscount1IsNull() {
            addCriterion("discount1 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount1IsNotNull() {
            addCriterion("discount1 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount1EqualTo(BigDecimal value) {
            addCriterion("discount1 =", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotEqualTo(BigDecimal value) {
            addCriterion("discount1 <>", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1GreaterThan(BigDecimal value) {
            addCriterion("discount1 >", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount1 >=", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1LessThan(BigDecimal value) {
            addCriterion("discount1 <", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount1 <=", value, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1In(List<BigDecimal> values) {
            addCriterion("discount1 in", values, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotIn(List<BigDecimal> values) {
            addCriterion("discount1 not in", values, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount1 between", value1, value2, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount1 not between", value1, value2, "discount1");
            return (Criteria) this;
        }

        public Criteria andDiscount2IsNull() {
            addCriterion("discount2 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount2IsNotNull() {
            addCriterion("discount2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount2EqualTo(BigDecimal value) {
            addCriterion("discount2 =", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotEqualTo(BigDecimal value) {
            addCriterion("discount2 <>", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2GreaterThan(BigDecimal value) {
            addCriterion("discount2 >", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount2 >=", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2LessThan(BigDecimal value) {
            addCriterion("discount2 <", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount2 <=", value, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2In(List<BigDecimal> values) {
            addCriterion("discount2 in", values, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotIn(List<BigDecimal> values) {
            addCriterion("discount2 not in", values, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount2 between", value1, value2, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount2 not between", value1, value2, "discount2");
            return (Criteria) this;
        }

        public Criteria andDiscount3IsNull() {
            addCriterion("discount3 is null");
            return (Criteria) this;
        }

        public Criteria andDiscount3IsNotNull() {
            addCriterion("discount3 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount3EqualTo(BigDecimal value) {
            addCriterion("discount3 =", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotEqualTo(BigDecimal value) {
            addCriterion("discount3 <>", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3GreaterThan(BigDecimal value) {
            addCriterion("discount3 >", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount3 >=", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3LessThan(BigDecimal value) {
            addCriterion("discount3 <", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount3 <=", value, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3In(List<BigDecimal> values) {
            addCriterion("discount3 in", values, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotIn(List<BigDecimal> values) {
            addCriterion("discount3 not in", values, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount3 between", value1, value2, "discount3");
            return (Criteria) this;
        }

        public Criteria andDiscount3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount3 not between", value1, value2, "discount3");
            return (Criteria) this;
        }

        public Criteria andPorderIsNull() {
            addCriterion("porder is null");
            return (Criteria) this;
        }

        public Criteria andPorderIsNotNull() {
            addCriterion("porder is not null");
            return (Criteria) this;
        }

        public Criteria andPorderEqualTo(Integer value) {
            addCriterion("porder =", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderNotEqualTo(Integer value) {
            addCriterion("porder <>", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderGreaterThan(Integer value) {
            addCriterion("porder >", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("porder >=", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderLessThan(Integer value) {
            addCriterion("porder <", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderLessThanOrEqualTo(Integer value) {
            addCriterion("porder <=", value, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderIn(List<Integer> values) {
            addCriterion("porder in", values, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderNotIn(List<Integer> values) {
            addCriterion("porder not in", values, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderBetween(Integer value1, Integer value2) {
            addCriterion("porder between", value1, value2, "porder");
            return (Criteria) this;
        }

        public Criteria andPorderNotBetween(Integer value1, Integer value2) {
            addCriterion("porder not between", value1, value2, "porder");
            return (Criteria) this;
        }

        public Criteria andRecdiscountIsNull() {
            addCriterion("recdiscount is null");
            return (Criteria) this;
        }

        public Criteria andRecdiscountIsNotNull() {
            addCriterion("recdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andRecdiscountEqualTo(BigDecimal value) {
            addCriterion("recdiscount =", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountNotEqualTo(BigDecimal value) {
            addCriterion("recdiscount <>", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountGreaterThan(BigDecimal value) {
            addCriterion("recdiscount >", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recdiscount >=", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountLessThan(BigDecimal value) {
            addCriterion("recdiscount <", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recdiscount <=", value, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountIn(List<BigDecimal> values) {
            addCriterion("recdiscount in", values, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountNotIn(List<BigDecimal> values) {
            addCriterion("recdiscount not in", values, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recdiscount between", value1, value2, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recdiscount not between", value1, value2, "recdiscount");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1IsNull() {
            addCriterion("recdiscount1 is null");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1IsNotNull() {
            addCriterion("recdiscount1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1EqualTo(BigDecimal value) {
            addCriterion("recdiscount1 =", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1NotEqualTo(BigDecimal value) {
            addCriterion("recdiscount1 <>", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1GreaterThan(BigDecimal value) {
            addCriterion("recdiscount1 >", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recdiscount1 >=", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1LessThan(BigDecimal value) {
            addCriterion("recdiscount1 <", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("recdiscount1 <=", value, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1In(List<BigDecimal> values) {
            addCriterion("recdiscount1 in", values, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1NotIn(List<BigDecimal> values) {
            addCriterion("recdiscount1 not in", values, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("recdiscount1 between", value1, value2, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andRecdiscount1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recdiscount1 not between", value1, value2, "recdiscount1");
            return (Criteria) this;
        }

        public Criteria andStopdateIsNull() {
            addCriterion("StopDate is null");
            return (Criteria) this;
        }

        public Criteria andStopdateIsNotNull() {
            addCriterion("StopDate is not null");
            return (Criteria) this;
        }

        public Criteria andStopdateEqualTo(String value) {
            addCriterion("StopDate =", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotEqualTo(String value) {
            addCriterion("StopDate <>", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateGreaterThan(String value) {
            addCriterion("StopDate >", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateGreaterThanOrEqualTo(String value) {
            addCriterion("StopDate >=", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateLessThan(String value) {
            addCriterion("StopDate <", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateLessThanOrEqualTo(String value) {
            addCriterion("StopDate <=", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateLike(String value) {
            addCriterion("StopDate like", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotLike(String value) {
            addCriterion("StopDate not like", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateIn(List<String> values) {
            addCriterion("StopDate in", values, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotIn(List<String> values) {
            addCriterion("StopDate not in", values, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateBetween(String value1, String value2) {
            addCriterion("StopDate between", value1, value2, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotBetween(String value1, String value2) {
            addCriterion("StopDate not between", value1, value2, "stopdate");
            return (Criteria) this;
        }

        public Criteria andColoridlistIsNull() {
            addCriterion("ColorIdList is null");
            return (Criteria) this;
        }

        public Criteria andColoridlistIsNotNull() {
            addCriterion("ColorIdList is not null");
            return (Criteria) this;
        }

        public Criteria andColoridlistEqualTo(String value) {
            addCriterion("ColorIdList =", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistNotEqualTo(String value) {
            addCriterion("ColorIdList <>", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistGreaterThan(String value) {
            addCriterion("ColorIdList >", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistGreaterThanOrEqualTo(String value) {
            addCriterion("ColorIdList >=", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistLessThan(String value) {
            addCriterion("ColorIdList <", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistLessThanOrEqualTo(String value) {
            addCriterion("ColorIdList <=", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistLike(String value) {
            addCriterion("ColorIdList like", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistNotLike(String value) {
            addCriterion("ColorIdList not like", value, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistIn(List<String> values) {
            addCriterion("ColorIdList in", values, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistNotIn(List<String> values) {
            addCriterion("ColorIdList not in", values, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistBetween(String value1, String value2) {
            addCriterion("ColorIdList between", value1, value2, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andColoridlistNotBetween(String value1, String value2) {
            addCriterion("ColorIdList not between", value1, value2, "coloridlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistIsNull() {
            addCriterion("SizeIdList is null");
            return (Criteria) this;
        }

        public Criteria andSizeidlistIsNotNull() {
            addCriterion("SizeIdList is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidlistEqualTo(String value) {
            addCriterion("SizeIdList =", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistNotEqualTo(String value) {
            addCriterion("SizeIdList <>", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistGreaterThan(String value) {
            addCriterion("SizeIdList >", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistGreaterThanOrEqualTo(String value) {
            addCriterion("SizeIdList >=", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistLessThan(String value) {
            addCriterion("SizeIdList <", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistLessThanOrEqualTo(String value) {
            addCriterion("SizeIdList <=", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistLike(String value) {
            addCriterion("SizeIdList like", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistNotLike(String value) {
            addCriterion("SizeIdList not like", value, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistIn(List<String> values) {
            addCriterion("SizeIdList in", values, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistNotIn(List<String> values) {
            addCriterion("SizeIdList not in", values, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistBetween(String value1, String value2) {
            addCriterion("SizeIdList between", value1, value2, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andSizeidlistNotBetween(String value1, String value2) {
            addCriterion("SizeIdList not between", value1, value2, "sizeidlist");
            return (Criteria) this;
        }

        public Criteria andAttrib1IsNull() {
            addCriterion("Attrib1 is null");
            return (Criteria) this;
        }

        public Criteria andAttrib1IsNotNull() {
            addCriterion("Attrib1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttrib1EqualTo(Integer value) {
            addCriterion("Attrib1 =", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1NotEqualTo(Integer value) {
            addCriterion("Attrib1 <>", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1GreaterThan(Integer value) {
            addCriterion("Attrib1 >", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attrib1 >=", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1LessThan(Integer value) {
            addCriterion("Attrib1 <", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1LessThanOrEqualTo(Integer value) {
            addCriterion("Attrib1 <=", value, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1In(List<Integer> values) {
            addCriterion("Attrib1 in", values, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1NotIn(List<Integer> values) {
            addCriterion("Attrib1 not in", values, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1Between(Integer value1, Integer value2) {
            addCriterion("Attrib1 between", value1, value2, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib1NotBetween(Integer value1, Integer value2) {
            addCriterion("Attrib1 not between", value1, value2, "attrib1");
            return (Criteria) this;
        }

        public Criteria andAttrib2IsNull() {
            addCriterion("Attrib2 is null");
            return (Criteria) this;
        }

        public Criteria andAttrib2IsNotNull() {
            addCriterion("Attrib2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttrib2EqualTo(Integer value) {
            addCriterion("Attrib2 =", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2NotEqualTo(Integer value) {
            addCriterion("Attrib2 <>", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2GreaterThan(Integer value) {
            addCriterion("Attrib2 >", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attrib2 >=", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2LessThan(Integer value) {
            addCriterion("Attrib2 <", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2LessThanOrEqualTo(Integer value) {
            addCriterion("Attrib2 <=", value, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2In(List<Integer> values) {
            addCriterion("Attrib2 in", values, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2NotIn(List<Integer> values) {
            addCriterion("Attrib2 not in", values, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2Between(Integer value1, Integer value2) {
            addCriterion("Attrib2 between", value1, value2, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib2NotBetween(Integer value1, Integer value2) {
            addCriterion("Attrib2 not between", value1, value2, "attrib2");
            return (Criteria) this;
        }

        public Criteria andAttrib3IsNull() {
            addCriterion("Attrib3 is null");
            return (Criteria) this;
        }

        public Criteria andAttrib3IsNotNull() {
            addCriterion("Attrib3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttrib3EqualTo(Integer value) {
            addCriterion("Attrib3 =", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3NotEqualTo(Integer value) {
            addCriterion("Attrib3 <>", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3GreaterThan(Integer value) {
            addCriterion("Attrib3 >", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attrib3 >=", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3LessThan(Integer value) {
            addCriterion("Attrib3 <", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3LessThanOrEqualTo(Integer value) {
            addCriterion("Attrib3 <=", value, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3In(List<Integer> values) {
            addCriterion("Attrib3 in", values, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3NotIn(List<Integer> values) {
            addCriterion("Attrib3 not in", values, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3Between(Integer value1, Integer value2) {
            addCriterion("Attrib3 between", value1, value2, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib3NotBetween(Integer value1, Integer value2) {
            addCriterion("Attrib3 not between", value1, value2, "attrib3");
            return (Criteria) this;
        }

        public Criteria andAttrib4IsNull() {
            addCriterion("Attrib4 is null");
            return (Criteria) this;
        }

        public Criteria andAttrib4IsNotNull() {
            addCriterion("Attrib4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttrib4EqualTo(Integer value) {
            addCriterion("Attrib4 =", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4NotEqualTo(Integer value) {
            addCriterion("Attrib4 <>", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4GreaterThan(Integer value) {
            addCriterion("Attrib4 >", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4GreaterThanOrEqualTo(Integer value) {
            addCriterion("Attrib4 >=", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4LessThan(Integer value) {
            addCriterion("Attrib4 <", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4LessThanOrEqualTo(Integer value) {
            addCriterion("Attrib4 <=", value, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4In(List<Integer> values) {
            addCriterion("Attrib4 in", values, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4NotIn(List<Integer> values) {
            addCriterion("Attrib4 not in", values, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4Between(Integer value1, Integer value2) {
            addCriterion("Attrib4 between", value1, value2, "attrib4");
            return (Criteria) this;
        }

        public Criteria andAttrib4NotBetween(Integer value1, Integer value2) {
            addCriterion("Attrib4 not between", value1, value2, "attrib4");
            return (Criteria) this;
        }

        public Criteria andLdateIsNull() {
            addCriterion("Ldate is null");
            return (Criteria) this;
        }

        public Criteria andLdateIsNotNull() {
            addCriterion("Ldate is not null");
            return (Criteria) this;
        }

        public Criteria andLdateEqualTo(Date value) {
            addCriterion("Ldate =", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateNotEqualTo(Date value) {
            addCriterion("Ldate <>", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateGreaterThan(Date value) {
            addCriterion("Ldate >", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Ldate >=", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateLessThan(Date value) {
            addCriterion("Ldate <", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateLessThanOrEqualTo(Date value) {
            addCriterion("Ldate <=", value, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateIn(List<Date> values) {
            addCriterion("Ldate in", values, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateNotIn(List<Date> values) {
            addCriterion("Ldate not in", values, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateBetween(Date value1, Date value2) {
            addCriterion("Ldate between", value1, value2, "ldate");
            return (Criteria) this;
        }

        public Criteria andLdateNotBetween(Date value1, Date value2) {
            addCriterion("Ldate not between", value1, value2, "ldate");
            return (Criteria) this;
        }

        public Criteria andYtypeidIsNull() {
            addCriterion("ytypeid is null");
            return (Criteria) this;
        }

        public Criteria andYtypeidIsNotNull() {
            addCriterion("ytypeid is not null");
            return (Criteria) this;
        }

        public Criteria andYtypeidEqualTo(String value) {
            addCriterion("ytypeid =", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidNotEqualTo(String value) {
            addCriterion("ytypeid <>", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidGreaterThan(String value) {
            addCriterion("ytypeid >", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ytypeid >=", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidLessThan(String value) {
            addCriterion("ytypeid <", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidLessThanOrEqualTo(String value) {
            addCriterion("ytypeid <=", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidLike(String value) {
            addCriterion("ytypeid like", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidNotLike(String value) {
            addCriterion("ytypeid not like", value, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidIn(List<String> values) {
            addCriterion("ytypeid in", values, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidNotIn(List<String> values) {
            addCriterion("ytypeid not in", values, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidBetween(String value1, String value2) {
            addCriterion("ytypeid between", value1, value2, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYtypeidNotBetween(String value1, String value2) {
            addCriterion("ytypeid not between", value1, value2, "ytypeid");
            return (Criteria) this;
        }

        public Criteria andYrecpriceIsNull() {
            addCriterion("yrecprice is null");
            return (Criteria) this;
        }

        public Criteria andYrecpriceIsNotNull() {
            addCriterion("yrecprice is not null");
            return (Criteria) this;
        }

        public Criteria andYrecpriceEqualTo(BigDecimal value) {
            addCriterion("yrecprice =", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceNotEqualTo(BigDecimal value) {
            addCriterion("yrecprice <>", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceGreaterThan(BigDecimal value) {
            addCriterion("yrecprice >", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yrecprice >=", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceLessThan(BigDecimal value) {
            addCriterion("yrecprice <", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yrecprice <=", value, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceIn(List<BigDecimal> values) {
            addCriterion("yrecprice in", values, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceNotIn(List<BigDecimal> values) {
            addCriterion("yrecprice not in", values, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yrecprice between", value1, value2, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andYrecpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yrecprice not between", value1, value2, "yrecprice");
            return (Criteria) this;
        }

        public Criteria andSfzpIsNull() {
            addCriterion("sfzp is null");
            return (Criteria) this;
        }

        public Criteria andSfzpIsNotNull() {
            addCriterion("sfzp is not null");
            return (Criteria) this;
        }

        public Criteria andSfzpEqualTo(String value) {
            addCriterion("sfzp =", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpNotEqualTo(String value) {
            addCriterion("sfzp <>", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpGreaterThan(String value) {
            addCriterion("sfzp >", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpGreaterThanOrEqualTo(String value) {
            addCriterion("sfzp >=", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpLessThan(String value) {
            addCriterion("sfzp <", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpLessThanOrEqualTo(String value) {
            addCriterion("sfzp <=", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpLike(String value) {
            addCriterion("sfzp like", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpNotLike(String value) {
            addCriterion("sfzp not like", value, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpIn(List<String> values) {
            addCriterion("sfzp in", values, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpNotIn(List<String> values) {
            addCriterion("sfzp not in", values, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpBetween(String value1, String value2) {
            addCriterion("sfzp between", value1, value2, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSfzpNotBetween(String value1, String value2) {
            addCriterion("sfzp not between", value1, value2, "sfzp");
            return (Criteria) this;
        }

        public Criteria andSflyIsNull() {
            addCriterion("sfly is null");
            return (Criteria) this;
        }

        public Criteria andSflyIsNotNull() {
            addCriterion("sfly is not null");
            return (Criteria) this;
        }

        public Criteria andSflyEqualTo(String value) {
            addCriterion("sfly =", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyNotEqualTo(String value) {
            addCriterion("sfly <>", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyGreaterThan(String value) {
            addCriterion("sfly >", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyGreaterThanOrEqualTo(String value) {
            addCriterion("sfly >=", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyLessThan(String value) {
            addCriterion("sfly <", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyLessThanOrEqualTo(String value) {
            addCriterion("sfly <=", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyLike(String value) {
            addCriterion("sfly like", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyNotLike(String value) {
            addCriterion("sfly not like", value, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyIn(List<String> values) {
            addCriterion("sfly in", values, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyNotIn(List<String> values) {
            addCriterion("sfly not in", values, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyBetween(String value1, String value2) {
            addCriterion("sfly between", value1, value2, "sfly");
            return (Criteria) this;
        }

        public Criteria andSflyNotBetween(String value1, String value2) {
            addCriterion("sfly not between", value1, value2, "sfly");
            return (Criteria) this;
        }

        public Criteria andLyzlIsNull() {
            addCriterion("lyzl is null");
            return (Criteria) this;
        }

        public Criteria andLyzlIsNotNull() {
            addCriterion("lyzl is not null");
            return (Criteria) this;
        }

        public Criteria andLyzlEqualTo(BigDecimal value) {
            addCriterion("lyzl =", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlNotEqualTo(BigDecimal value) {
            addCriterion("lyzl <>", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlGreaterThan(BigDecimal value) {
            addCriterion("lyzl >", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lyzl >=", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlLessThan(BigDecimal value) {
            addCriterion("lyzl <", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lyzl <=", value, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlIn(List<BigDecimal> values) {
            addCriterion("lyzl in", values, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlNotIn(List<BigDecimal> values) {
            addCriterion("lyzl not in", values, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lyzl between", value1, value2, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lyzl not between", value1, value2, "lyzl");
            return (Criteria) this;
        }

        public Criteria andLyzkIsNull() {
            addCriterion("lyzk is null");
            return (Criteria) this;
        }

        public Criteria andLyzkIsNotNull() {
            addCriterion("lyzk is not null");
            return (Criteria) this;
        }

        public Criteria andLyzkEqualTo(BigDecimal value) {
            addCriterion("lyzk =", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkNotEqualTo(BigDecimal value) {
            addCriterion("lyzk <>", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkGreaterThan(BigDecimal value) {
            addCriterion("lyzk >", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lyzk >=", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkLessThan(BigDecimal value) {
            addCriterion("lyzk <", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lyzk <=", value, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkIn(List<BigDecimal> values) {
            addCriterion("lyzk in", values, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkNotIn(List<BigDecimal> values) {
            addCriterion("lyzk not in", values, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lyzk between", value1, value2, "lyzk");
            return (Criteria) this;
        }

        public Criteria andLyzkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lyzk not between", value1, value2, "lyzk");
            return (Criteria) this;
        }

        public Criteria andJyfsIsNull() {
            addCriterion("jyfs is null");
            return (Criteria) this;
        }

        public Criteria andJyfsIsNotNull() {
            addCriterion("jyfs is not null");
            return (Criteria) this;
        }

        public Criteria andJyfsEqualTo(Integer value) {
            addCriterion("jyfs =", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsNotEqualTo(Integer value) {
            addCriterion("jyfs <>", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsGreaterThan(Integer value) {
            addCriterion("jyfs >", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsGreaterThanOrEqualTo(Integer value) {
            addCriterion("jyfs >=", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsLessThan(Integer value) {
            addCriterion("jyfs <", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsLessThanOrEqualTo(Integer value) {
            addCriterion("jyfs <=", value, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsIn(List<Integer> values) {
            addCriterion("jyfs in", values, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsNotIn(List<Integer> values) {
            addCriterion("jyfs not in", values, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsBetween(Integer value1, Integer value2) {
            addCriterion("jyfs between", value1, value2, "jyfs");
            return (Criteria) this;
        }

        public Criteria andJyfsNotBetween(Integer value1, Integer value2) {
            addCriterion("jyfs not between", value1, value2, "jyfs");
            return (Criteria) this;
        }

        public Criteria andClstypeidIsNull() {
            addCriterion("clstypeid is null");
            return (Criteria) this;
        }

        public Criteria andClstypeidIsNotNull() {
            addCriterion("clstypeid is not null");
            return (Criteria) this;
        }

        public Criteria andClstypeidEqualTo(String value) {
            addCriterion("clstypeid =", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidNotEqualTo(String value) {
            addCriterion("clstypeid <>", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidGreaterThan(String value) {
            addCriterion("clstypeid >", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidGreaterThanOrEqualTo(String value) {
            addCriterion("clstypeid >=", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidLessThan(String value) {
            addCriterion("clstypeid <", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidLessThanOrEqualTo(String value) {
            addCriterion("clstypeid <=", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidLike(String value) {
            addCriterion("clstypeid like", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidNotLike(String value) {
            addCriterion("clstypeid not like", value, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidIn(List<String> values) {
            addCriterion("clstypeid in", values, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidNotIn(List<String> values) {
            addCriterion("clstypeid not in", values, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidBetween(String value1, String value2) {
            addCriterion("clstypeid between", value1, value2, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andClstypeidNotBetween(String value1, String value2) {
            addCriterion("clstypeid not between", value1, value2, "clstypeid");
            return (Criteria) this;
        }

        public Criteria andYstyleIsNull() {
            addCriterion("yStyle is null");
            return (Criteria) this;
        }

        public Criteria andYstyleIsNotNull() {
            addCriterion("yStyle is not null");
            return (Criteria) this;
        }

        public Criteria andYstyleEqualTo(String value) {
            addCriterion("yStyle =", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleNotEqualTo(String value) {
            addCriterion("yStyle <>", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleGreaterThan(String value) {
            addCriterion("yStyle >", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleGreaterThanOrEqualTo(String value) {
            addCriterion("yStyle >=", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleLessThan(String value) {
            addCriterion("yStyle <", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleLessThanOrEqualTo(String value) {
            addCriterion("yStyle <=", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleLike(String value) {
            addCriterion("yStyle like", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleNotLike(String value) {
            addCriterion("yStyle not like", value, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleIn(List<String> values) {
            addCriterion("yStyle in", values, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleNotIn(List<String> values) {
            addCriterion("yStyle not in", values, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleBetween(String value1, String value2) {
            addCriterion("yStyle between", value1, value2, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYstyleNotBetween(String value1, String value2) {
            addCriterion("yStyle not between", value1, value2, "ystyle");
            return (Criteria) this;
        }

        public Criteria andYcomposition1IsNull() {
            addCriterion("ycomposition1 is null");
            return (Criteria) this;
        }

        public Criteria andYcomposition1IsNotNull() {
            addCriterion("ycomposition1 is not null");
            return (Criteria) this;
        }

        public Criteria andYcomposition1EqualTo(String value) {
            addCriterion("ycomposition1 =", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1NotEqualTo(String value) {
            addCriterion("ycomposition1 <>", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1GreaterThan(String value) {
            addCriterion("ycomposition1 >", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1GreaterThanOrEqualTo(String value) {
            addCriterion("ycomposition1 >=", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1LessThan(String value) {
            addCriterion("ycomposition1 <", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1LessThanOrEqualTo(String value) {
            addCriterion("ycomposition1 <=", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1Like(String value) {
            addCriterion("ycomposition1 like", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1NotLike(String value) {
            addCriterion("ycomposition1 not like", value, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1In(List<String> values) {
            addCriterion("ycomposition1 in", values, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1NotIn(List<String> values) {
            addCriterion("ycomposition1 not in", values, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1Between(String value1, String value2) {
            addCriterion("ycomposition1 between", value1, value2, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition1NotBetween(String value1, String value2) {
            addCriterion("ycomposition1 not between", value1, value2, "ycomposition1");
            return (Criteria) this;
        }

        public Criteria andYcomposition2IsNull() {
            addCriterion("ycomposition2 is null");
            return (Criteria) this;
        }

        public Criteria andYcomposition2IsNotNull() {
            addCriterion("ycomposition2 is not null");
            return (Criteria) this;
        }

        public Criteria andYcomposition2EqualTo(String value) {
            addCriterion("ycomposition2 =", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2NotEqualTo(String value) {
            addCriterion("ycomposition2 <>", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2GreaterThan(String value) {
            addCriterion("ycomposition2 >", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2GreaterThanOrEqualTo(String value) {
            addCriterion("ycomposition2 >=", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2LessThan(String value) {
            addCriterion("ycomposition2 <", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2LessThanOrEqualTo(String value) {
            addCriterion("ycomposition2 <=", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2Like(String value) {
            addCriterion("ycomposition2 like", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2NotLike(String value) {
            addCriterion("ycomposition2 not like", value, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2In(List<String> values) {
            addCriterion("ycomposition2 in", values, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2NotIn(List<String> values) {
            addCriterion("ycomposition2 not in", values, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2Between(String value1, String value2) {
            addCriterion("ycomposition2 between", value1, value2, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition2NotBetween(String value1, String value2) {
            addCriterion("ycomposition2 not between", value1, value2, "ycomposition2");
            return (Criteria) this;
        }

        public Criteria andYcomposition3IsNull() {
            addCriterion("ycomposition3 is null");
            return (Criteria) this;
        }

        public Criteria andYcomposition3IsNotNull() {
            addCriterion("ycomposition3 is not null");
            return (Criteria) this;
        }

        public Criteria andYcomposition3EqualTo(String value) {
            addCriterion("ycomposition3 =", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3NotEqualTo(String value) {
            addCriterion("ycomposition3 <>", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3GreaterThan(String value) {
            addCriterion("ycomposition3 >", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3GreaterThanOrEqualTo(String value) {
            addCriterion("ycomposition3 >=", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3LessThan(String value) {
            addCriterion("ycomposition3 <", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3LessThanOrEqualTo(String value) {
            addCriterion("ycomposition3 <=", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3Like(String value) {
            addCriterion("ycomposition3 like", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3NotLike(String value) {
            addCriterion("ycomposition3 not like", value, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3In(List<String> values) {
            addCriterion("ycomposition3 in", values, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3NotIn(List<String> values) {
            addCriterion("ycomposition3 not in", values, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3Between(String value1, String value2) {
            addCriterion("ycomposition3 between", value1, value2, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andYcomposition3NotBetween(String value1, String value2) {
            addCriterion("ycomposition3 not between", value1, value2, "ycomposition3");
            return (Criteria) this;
        }

        public Criteria andLtypeidIsNull() {
            addCriterion("ltypeid is null");
            return (Criteria) this;
        }

        public Criteria andLtypeidIsNotNull() {
            addCriterion("ltypeid is not null");
            return (Criteria) this;
        }

        public Criteria andLtypeidEqualTo(String value) {
            addCriterion("ltypeid =", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidNotEqualTo(String value) {
            addCriterion("ltypeid <>", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidGreaterThan(String value) {
            addCriterion("ltypeid >", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("ltypeid >=", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidLessThan(String value) {
            addCriterion("ltypeid <", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidLessThanOrEqualTo(String value) {
            addCriterion("ltypeid <=", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidLike(String value) {
            addCriterion("ltypeid like", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidNotLike(String value) {
            addCriterion("ltypeid not like", value, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidIn(List<String> values) {
            addCriterion("ltypeid in", values, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidNotIn(List<String> values) {
            addCriterion("ltypeid not in", values, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidBetween(String value1, String value2) {
            addCriterion("ltypeid between", value1, value2, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andLtypeidNotBetween(String value1, String value2) {
            addCriterion("ltypeid not between", value1, value2, "ltypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidIsNull() {
            addCriterion("xtypeid is null");
            return (Criteria) this;
        }

        public Criteria andXtypeidIsNotNull() {
            addCriterion("xtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeidEqualTo(String value) {
            addCriterion("xtypeid =", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidNotEqualTo(String value) {
            addCriterion("xtypeid <>", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidGreaterThan(String value) {
            addCriterion("xtypeid >", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("xtypeid >=", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidLessThan(String value) {
            addCriterion("xtypeid <", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidLessThanOrEqualTo(String value) {
            addCriterion("xtypeid <=", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidLike(String value) {
            addCriterion("xtypeid like", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidNotLike(String value) {
            addCriterion("xtypeid not like", value, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidIn(List<String> values) {
            addCriterion("xtypeid in", values, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidNotIn(List<String> values) {
            addCriterion("xtypeid not in", values, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidBetween(String value1, String value2) {
            addCriterion("xtypeid between", value1, value2, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andXtypeidNotBetween(String value1, String value2) {
            addCriterion("xtypeid not between", value1, value2, "xtypeid");
            return (Criteria) this;
        }

        public Criteria andSftjIsNull() {
            addCriterion("sftj is null");
            return (Criteria) this;
        }

        public Criteria andSftjIsNotNull() {
            addCriterion("sftj is not null");
            return (Criteria) this;
        }

        public Criteria andSftjEqualTo(String value) {
            addCriterion("sftj =", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotEqualTo(String value) {
            addCriterion("sftj <>", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThan(String value) {
            addCriterion("sftj >", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThanOrEqualTo(String value) {
            addCriterion("sftj >=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThan(String value) {
            addCriterion("sftj <", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThanOrEqualTo(String value) {
            addCriterion("sftj <=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLike(String value) {
            addCriterion("sftj like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotLike(String value) {
            addCriterion("sftj not like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjIn(List<String> values) {
            addCriterion("sftj in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotIn(List<String> values) {
            addCriterion("sftj not in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjBetween(String value1, String value2) {
            addCriterion("sftj between", value1, value2, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotBetween(String value1, String value2) {
            addCriterion("sftj not between", value1, value2, "sftj");
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