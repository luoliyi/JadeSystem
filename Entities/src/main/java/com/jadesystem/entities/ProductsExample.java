package com.jadesystem.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ProductsExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andPidIsNull() {
            addCriterion("pId is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pId is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pId =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pId <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pId >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pId >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pId <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pId <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pId in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pId not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pId between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pId not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPcidIsNull() {
            addCriterion("pcId is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcId is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("pcId =", value, "pcid");
            }
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Integer value) {
            addCriterion("pcId <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Integer value) {
            addCriterion("pcId >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcId >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Integer value) {
            addCriterion("pcId <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Integer value) {
            addCriterion("pcId <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Integer> values) {
            addCriterion("pcId in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Integer> values) {
            addCriterion("pcId not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Integer value1, Integer value2) {
            addCriterion("pcId between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Integer value1, Integer value2) {
            addCriterion("pcId not between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPbidIsNull() {
            addCriterion("pbId is null");
            return (Criteria) this;
        }

        public Criteria andPbidIsNotNull() {
            addCriterion("pbId is not null");
            return (Criteria) this;
        }

        public Criteria andPbidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("pbId =", value, "pbid");
            }
            return (Criteria) this;
        }

        public Criteria andPbidNotEqualTo(Integer value) {
            addCriterion("pbId <>", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidGreaterThan(Integer value) {
            addCriterion("pbId >", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pbId >=", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidLessThan(Integer value) {
            addCriterion("pbId <", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidLessThanOrEqualTo(Integer value) {
            addCriterion("pbId <=", value, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidIn(List<Integer> values) {
            addCriterion("pbId in", values, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidNotIn(List<Integer> values) {
            addCriterion("pbId not in", values, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidBetween(Integer value1, Integer value2) {
            addCriterion("pbId between", value1, value2, "pbid");
            return (Criteria) this;
        }

        public Criteria andPbidNotBetween(Integer value1, Integer value2) {
            addCriterion("pbId not between", value1, value2, "pbid");
            return (Criteria) this;
        }

        public Criteria andPiidIsNull() {
            addCriterion("piId is null");
            return (Criteria) this;
        }

        public Criteria andPiidIsNotNull() {
            addCriterion("piId is not null");
            return (Criteria) this;
        }

        public Criteria andPiidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("piId =", value, "piid");
            }
            return (Criteria) this;
        }

        public Criteria andPiidNotEqualTo(Integer value) {
            addCriterion("piId <>", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThan(Integer value) {
            addCriterion("piId >", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("piId >=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThan(Integer value) {
            addCriterion("piId <", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThanOrEqualTo(Integer value) {
            addCriterion("piId <=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidIn(List<Integer> values) {
            addCriterion("piId in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotIn(List<Integer> values) {
            addCriterion("piId not in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidBetween(Integer value1, Integer value2) {
            addCriterion("piId between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotBetween(Integer value1, Integer value2) {
            addCriterion("piId not between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPmidIsNull() {
            addCriterion("pmId is null");
            return (Criteria) this;
        }

        public Criteria andPmidIsNotNull() {
            addCriterion("pmId is not null");
            return (Criteria) this;
        }

        public Criteria andPmidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("pmId =", value, "pmid");
            }
            return (Criteria) this;
        }

        public Criteria andPmidNotEqualTo(Integer value) {
            addCriterion("pmId <>", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThan(Integer value) {
            addCriterion("pmId >", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmId >=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThan(Integer value) {
            addCriterion("pmId <", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidLessThanOrEqualTo(Integer value) {
            addCriterion("pmId <=", value, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidIn(List<Integer> values) {
            addCriterion("pmId in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotIn(List<Integer> values) {
            addCriterion("pmId not in", values, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidBetween(Integer value1, Integer value2) {
            addCriterion("pmId between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPmidNotBetween(Integer value1, Integer value2) {
            addCriterion("pmId not between", value1, value2, "pmid");
            return (Criteria) this;
        }

        public Criteria andPitidIsNull() {
            addCriterion("pitId is null");
            return (Criteria) this;
        }

        public Criteria andPitidIsNotNull() {
            addCriterion("pitId is not null");
            return (Criteria) this;
        }

        public Criteria andPitidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("pitId =", value, "pitid");
            }
            return (Criteria) this;
        }

        public Criteria andPitidNotEqualTo(Integer value) {
            addCriterion("pitId <>", value, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidGreaterThan(Integer value) {
            addCriterion("pitId >", value, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pitId >=", value, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidLessThan(Integer value) {
            addCriterion("pitId <", value, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidLessThanOrEqualTo(Integer value) {
            addCriterion("pitId <=", value, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidIn(List<Integer> values) {
            addCriterion("pitId in", values, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidNotIn(List<Integer> values) {
            addCriterion("pitId not in", values, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidBetween(Integer value1, Integer value2) {
            addCriterion("pitId between", value1, value2, "pitid");
            return (Criteria) this;
        }

        public Criteria andPitidNotBetween(Integer value1, Integer value2) {
            addCriterion("pitId not between", value1, value2, "pitid");
            return (Criteria) this;
        }

        public Criteria andPhtidIsNull() {
            addCriterion("phtId is null");
            return (Criteria) this;
        }

        public Criteria andPhtidIsNotNull() {
            addCriterion("phtId is not null");
            return (Criteria) this;
        }

        public Criteria andPhtidEqualTo(Integer value) {
            if(value!=0) {
                addCriterion("phtId =", value, "phtid");
            }
            return (Criteria) this;
        }

        public Criteria andPhtidNotEqualTo(Integer value) {
            addCriterion("phtId <>", value, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidGreaterThan(Integer value) {
            addCriterion("phtId >", value, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("phtId >=", value, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidLessThan(Integer value) {
            addCriterion("phtId <", value, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidLessThanOrEqualTo(Integer value) {
            addCriterion("phtId <=", value, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidIn(List<Integer> values) {
            addCriterion("phtId in", values, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidNotIn(List<Integer> values) {
            addCriterion("phtId not in", values, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidBetween(Integer value1, Integer value2) {
            addCriterion("phtId between", value1, value2, "phtid");
            return (Criteria) this;
        }

        public Criteria andPhtidNotBetween(Integer value1, Integer value2) {
            addCriterion("phtId not between", value1, value2, "phtid");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceIsNull() {
            addCriterion("pMarketPrice is null");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceIsNotNull() {
            addCriterion("pMarketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceEqualTo(BigDecimal value) {
            addCriterion("pMarketPrice =", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("pMarketPrice <>", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceGreaterThan(BigDecimal value) {
            addCriterion("pMarketPrice >", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pMarketPrice >=", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceLessThan(BigDecimal value) {
            addCriterion("pMarketPrice <", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pMarketPrice <=", value, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceIn(List<BigDecimal> values) {
            addCriterion("pMarketPrice in", values, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("pMarketPrice not in", values, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pMarketPrice between", value1, value2, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pMarketPrice not between", value1, value2, "pmarketprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceIsNull() {
            addCriterion("pMyPrice is null");
            return (Criteria) this;
        }

        public Criteria andPmypriceIsNotNull() {
            addCriterion("pMyPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPmypriceEqualTo(BigDecimal value) {
            addCriterion("pMyPrice =", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceNotEqualTo(BigDecimal value) {
            addCriterion("pMyPrice <>", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceGreaterThan(BigDecimal value) {
            addCriterion("pMyPrice >", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pMyPrice >=", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceLessThan(BigDecimal value) {
            addCriterion("pMyPrice <", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pMyPrice <=", value, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceIn(List<BigDecimal> values) {
            addCriterion("pMyPrice in", values, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceNotIn(List<BigDecimal> values) {
            addCriterion("pMyPrice not in", values, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pMyPrice between", value1, value2, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPmypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pMyPrice not between", value1, value2, "pmyprice");
            return (Criteria) this;
        }

        public Criteria andPpictureIsNull() {
            addCriterion("pPicture is null");
            return (Criteria) this;
        }

        public Criteria andPpictureIsNotNull() {
            addCriterion("pPicture is not null");
            return (Criteria) this;
        }

        public Criteria andPpictureEqualTo(String value) {
            addCriterion("pPicture =", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotEqualTo(String value) {
            addCriterion("pPicture <>", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureGreaterThan(String value) {
            addCriterion("pPicture >", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureGreaterThanOrEqualTo(String value) {
            addCriterion("pPicture >=", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLessThan(String value) {
            addCriterion("pPicture <", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLessThanOrEqualTo(String value) {
            addCriterion("pPicture <=", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureLike(String value) {
            addCriterion("pPicture like", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotLike(String value) {
            addCriterion("pPicture not like", value, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureIn(List<String> values) {
            addCriterion("pPicture in", values, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotIn(List<String> values) {
            addCriterion("pPicture not in", values, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureBetween(String value1, String value2) {
            addCriterion("pPicture between", value1, value2, "ppicture");
            return (Criteria) this;
        }

        public Criteria andPpictureNotBetween(String value1, String value2) {
            addCriterion("pPicture not between", value1, value2, "ppicture");
            return (Criteria) this;
        }
    }

    /**
     */
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