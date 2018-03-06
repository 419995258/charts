package com.pb.charts.entity;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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
            addCriterion("parid is null");
            return (Criteria) this;
        }

        public Criteria andParidIsNotNull() {
            addCriterion("parid is not null");
            return (Criteria) this;
        }

        public Criteria andParidEqualTo(String value) {
            addCriterion("parid =", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotEqualTo(String value) {
            addCriterion("parid <>", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThan(String value) {
            addCriterion("parid >", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThanOrEqualTo(String value) {
            addCriterion("parid >=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThan(String value) {
            addCriterion("parid <", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThanOrEqualTo(String value) {
            addCriterion("parid <=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLike(String value) {
            addCriterion("parid like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotLike(String value) {
            addCriterion("parid not like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidIn(List<String> values) {
            addCriterion("parid in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotIn(List<String> values) {
            addCriterion("parid not in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidBetween(String value1, String value2) {
            addCriterion("parid between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotBetween(String value1, String value2) {
            addCriterion("parid not between", value1, value2, "parid");
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

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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

        public Criteria andZoneidIsNull() {
            addCriterion("ZoneID is null");
            return (Criteria) this;
        }

        public Criteria andZoneidIsNotNull() {
            addCriterion("ZoneID is not null");
            return (Criteria) this;
        }

        public Criteria andZoneidEqualTo(String value) {
            addCriterion("ZoneID =", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotEqualTo(String value) {
            addCriterion("ZoneID <>", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidGreaterThan(String value) {
            addCriterion("ZoneID >", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidGreaterThanOrEqualTo(String value) {
            addCriterion("ZoneID >=", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidLessThan(String value) {
            addCriterion("ZoneID <", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidLessThanOrEqualTo(String value) {
            addCriterion("ZoneID <=", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidLike(String value) {
            addCriterion("ZoneID like", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotLike(String value) {
            addCriterion("ZoneID not like", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidIn(List<String> values) {
            addCriterion("ZoneID in", values, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotIn(List<String> values) {
            addCriterion("ZoneID not in", values, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidBetween(String value1, String value2) {
            addCriterion("ZoneID between", value1, value2, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotBetween(String value1, String value2) {
            addCriterion("ZoneID not between", value1, value2, "zoneid");
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