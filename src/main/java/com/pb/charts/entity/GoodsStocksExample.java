package com.pb.charts.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsStocksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsStocksExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPtypeidIsNull() {
            addCriterion("PtypeId is null");
            return (Criteria) this;
        }

        public Criteria andPtypeidIsNotNull() {
            addCriterion("PtypeId is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeidEqualTo(String value) {
            addCriterion("PtypeId =", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotEqualTo(String value) {
            addCriterion("PtypeId <>", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidGreaterThan(String value) {
            addCriterion("PtypeId >", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("PtypeId >=", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidLessThan(String value) {
            addCriterion("PtypeId <", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidLessThanOrEqualTo(String value) {
            addCriterion("PtypeId <=", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidLike(String value) {
            addCriterion("PtypeId like", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotLike(String value) {
            addCriterion("PtypeId not like", value, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidIn(List<String> values) {
            addCriterion("PtypeId in", values, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotIn(List<String> values) {
            addCriterion("PtypeId not in", values, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidBetween(String value1, String value2) {
            addCriterion("PtypeId between", value1, value2, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andPtypeidNotBetween(String value1, String value2) {
            addCriterion("PtypeId not between", value1, value2, "ptypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidIsNull() {
            addCriterion("KtypeId is null");
            return (Criteria) this;
        }

        public Criteria andKtypeidIsNotNull() {
            addCriterion("KtypeId is not null");
            return (Criteria) this;
        }

        public Criteria andKtypeidEqualTo(String value) {
            addCriterion("KtypeId =", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidNotEqualTo(String value) {
            addCriterion("KtypeId <>", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidGreaterThan(String value) {
            addCriterion("KtypeId >", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("KtypeId >=", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidLessThan(String value) {
            addCriterion("KtypeId <", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidLessThanOrEqualTo(String value) {
            addCriterion("KtypeId <=", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidLike(String value) {
            addCriterion("KtypeId like", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidNotLike(String value) {
            addCriterion("KtypeId not like", value, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidIn(List<String> values) {
            addCriterion("KtypeId in", values, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidNotIn(List<String> values) {
            addCriterion("KtypeId not in", values, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidBetween(String value1, String value2) {
            addCriterion("KtypeId between", value1, value2, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andKtypeidNotBetween(String value1, String value2) {
            addCriterion("KtypeId not between", value1, value2, "ktypeid");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNull() {
            addCriterion("JobNumber is null");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNotNull() {
            addCriterion("JobNumber is not null");
            return (Criteria) this;
        }

        public Criteria andJobnumberEqualTo(String value) {
            addCriterion("JobNumber =", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotEqualTo(String value) {
            addCriterion("JobNumber <>", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThan(String value) {
            addCriterion("JobNumber >", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("JobNumber >=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThan(String value) {
            addCriterion("JobNumber <", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThanOrEqualTo(String value) {
            addCriterion("JobNumber <=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLike(String value) {
            addCriterion("JobNumber like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotLike(String value) {
            addCriterion("JobNumber not like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberIn(List<String> values) {
            addCriterion("JobNumber in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotIn(List<String> values) {
            addCriterion("JobNumber not in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberBetween(String value1, String value2) {
            addCriterion("JobNumber between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotBetween(String value1, String value2) {
            addCriterion("JobNumber not between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateIsNull() {
            addCriterion("OutFactoryDate is null");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateIsNotNull() {
            addCriterion("OutFactoryDate is not null");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateEqualTo(String value) {
            addCriterion("OutFactoryDate =", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateNotEqualTo(String value) {
            addCriterion("OutFactoryDate <>", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateGreaterThan(String value) {
            addCriterion("OutFactoryDate >", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateGreaterThanOrEqualTo(String value) {
            addCriterion("OutFactoryDate >=", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateLessThan(String value) {
            addCriterion("OutFactoryDate <", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateLessThanOrEqualTo(String value) {
            addCriterion("OutFactoryDate <=", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateLike(String value) {
            addCriterion("OutFactoryDate like", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateNotLike(String value) {
            addCriterion("OutFactoryDate not like", value, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateIn(List<String> values) {
            addCriterion("OutFactoryDate in", values, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateNotIn(List<String> values) {
            addCriterion("OutFactoryDate not in", values, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateBetween(String value1, String value2) {
            addCriterion("OutFactoryDate between", value1, value2, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andOutfactorydateNotBetween(String value1, String value2) {
            addCriterion("OutFactoryDate not between", value1, value2, "outfactorydate");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("Qty is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("Qty is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("Qty =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("Qty <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("Qty >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Qty >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("Qty <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Qty <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("Qty in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("Qty not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Qty between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Qty not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("Total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("Total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("Total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("Total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("Total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("Total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("Total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("Total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andGoodsorderIsNull() {
            addCriterion("GoodsOrder is null");
            return (Criteria) this;
        }

        public Criteria andGoodsorderIsNotNull() {
            addCriterion("GoodsOrder is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsorderEqualTo(Integer value) {
            addCriterion("GoodsOrder =", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderNotEqualTo(Integer value) {
            addCriterion("GoodsOrder <>", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderGreaterThan(Integer value) {
            addCriterion("GoodsOrder >", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsOrder >=", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderLessThan(Integer value) {
            addCriterion("GoodsOrder <", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsOrder <=", value, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderIn(List<Integer> values) {
            addCriterion("GoodsOrder in", values, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderNotIn(List<Integer> values) {
            addCriterion("GoodsOrder not in", values, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderBetween(Integer value1, Integer value2) {
            addCriterion("GoodsOrder between", value1, value2, "goodsorder");
            return (Criteria) this;
        }

        public Criteria andGoodsorderNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsOrder not between", value1, value2, "goodsorder");
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