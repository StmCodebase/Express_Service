package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Access_recordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Access_recordsExample() {
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

        public Criteria andAccNoIsNull() {
            addCriterion("ACC_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccNoIsNotNull() {
            addCriterion("ACC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoEqualTo(Integer value) {
            addCriterion("ACC_NO =", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoNotEqualTo(Integer value) {
            addCriterion("ACC_NO <>", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoGreaterThan(Integer value) {
            addCriterion("ACC_NO >", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACC_NO >=", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoLessThan(Integer value) {
            addCriterion("ACC_NO <", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoLessThanOrEqualTo(Integer value) {
            addCriterion("ACC_NO <=", value, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoIn(List<Integer> values) {
            addCriterion("ACC_NO in", values, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoNotIn(List<Integer> values) {
            addCriterion("ACC_NO not in", values, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoBetween(Integer value1, Integer value2) {
            addCriterion("ACC_NO between", value1, value2, "accNo");
            return (Criteria) this;
        }

        public Criteria andAccNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ACC_NO not between", value1, value2, "accNo");
            return (Criteria) this;
        }

        public Criteria andPoNoIsNull() {
            addCriterion("PO_NO is null");
            return (Criteria) this;
        }

        public Criteria andPoNoIsNotNull() {
            addCriterion("PO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPoNoEqualTo(Integer value) {
            addCriterion("PO_NO =", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotEqualTo(Integer value) {
            addCriterion("PO_NO <>", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoGreaterThan(Integer value) {
            addCriterion("PO_NO >", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PO_NO >=", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoLessThan(Integer value) {
            addCriterion("PO_NO <", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoLessThanOrEqualTo(Integer value) {
            addCriterion("PO_NO <=", value, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoIn(List<Integer> values) {
            addCriterion("PO_NO in", values, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotIn(List<Integer> values) {
            addCriterion("PO_NO not in", values, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoBetween(Integer value1, Integer value2) {
            addCriterion("PO_NO between", value1, value2, "poNo");
            return (Criteria) this;
        }

        public Criteria andPoNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PO_NO not between", value1, value2, "poNo");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("STOCK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("STOCK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(Integer value) {
            addCriterion("STOCK_NUM =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(Integer value) {
            addCriterion("STOCK_NUM <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(Integer value) {
            addCriterion("STOCK_NUM >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_NUM >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(Integer value) {
            addCriterion("STOCK_NUM <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_NUM <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<Integer> values) {
            addCriterion("STOCK_NUM in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<Integer> values) {
            addCriterion("STOCK_NUM not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_NUM between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_NUM not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andUNoIsNull() {
            addCriterion("U_NO is null");
            return (Criteria) this;
        }

        public Criteria andUNoIsNotNull() {
            addCriterion("U_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUNoEqualTo(Integer value) {
            addCriterion("U_NO =", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotEqualTo(Integer value) {
            addCriterion("U_NO <>", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoGreaterThan(Integer value) {
            addCriterion("U_NO >", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_NO >=", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoLessThan(Integer value) {
            addCriterion("U_NO <", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoLessThanOrEqualTo(Integer value) {
            addCriterion("U_NO <=", value, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoIn(List<Integer> values) {
            addCriterion("U_NO in", values, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotIn(List<Integer> values) {
            addCriterion("U_NO not in", values, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoBetween(Integer value1, Integer value2) {
            addCriterion("U_NO between", value1, value2, "uNo");
            return (Criteria) this;
        }

        public Criteria andUNoNotBetween(Integer value1, Integer value2) {
            addCriterion("U_NO not between", value1, value2, "uNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoIsNull() {
            addCriterion("STOCK_STATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andStockStateNoIsNotNull() {
            addCriterion("STOCK_STATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStockStateNoEqualTo(String value) {
            addCriterion("STOCK_STATE_NO =", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotEqualTo(String value) {
            addCriterion("STOCK_STATE_NO <>", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoGreaterThan(String value) {
            addCriterion("STOCK_STATE_NO >", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_STATE_NO >=", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoLessThan(String value) {
            addCriterion("STOCK_STATE_NO <", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoLessThanOrEqualTo(String value) {
            addCriterion("STOCK_STATE_NO <=", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoLike(String value) {
            addCriterion("STOCK_STATE_NO like", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotLike(String value) {
            addCriterion("STOCK_STATE_NO not like", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoIn(List<String> values) {
            addCriterion("STOCK_STATE_NO in", values, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotIn(List<String> values) {
            addCriterion("STOCK_STATE_NO not in", values, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoBetween(String value1, String value2) {
            addCriterion("STOCK_STATE_NO between", value1, value2, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotBetween(String value1, String value2) {
            addCriterion("STOCK_STATE_NO not between", value1, value2, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeIsNull() {
            addCriterion("ACC_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeIsNotNull() {
            addCriterion("ACC_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeEqualTo(Date value) {
            addCriterion("ACC_START_TIME =", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeNotEqualTo(Date value) {
            addCriterion("ACC_START_TIME <>", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeGreaterThan(Date value) {
            addCriterion("ACC_START_TIME >", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACC_START_TIME >=", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeLessThan(Date value) {
            addCriterion("ACC_START_TIME <", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACC_START_TIME <=", value, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeIn(List<Date> values) {
            addCriterion("ACC_START_TIME in", values, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeNotIn(List<Date> values) {
            addCriterion("ACC_START_TIME not in", values, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeBetween(Date value1, Date value2) {
            addCriterion("ACC_START_TIME between", value1, value2, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACC_START_TIME not between", value1, value2, "accStartTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeIsNull() {
            addCriterion("ACC_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeIsNotNull() {
            addCriterion("ACC_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeEqualTo(Date value) {
            addCriterion("ACC_END_TIME =", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeNotEqualTo(Date value) {
            addCriterion("ACC_END_TIME <>", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeGreaterThan(Date value) {
            addCriterion("ACC_END_TIME >", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACC_END_TIME >=", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeLessThan(Date value) {
            addCriterion("ACC_END_TIME <", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACC_END_TIME <=", value, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeIn(List<Date> values) {
            addCriterion("ACC_END_TIME in", values, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeNotIn(List<Date> values) {
            addCriterion("ACC_END_TIME not in", values, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeBetween(Date value1, Date value2) {
            addCriterion("ACC_END_TIME between", value1, value2, "accEndTime");
            return (Criteria) this;
        }

        public Criteria andAccEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACC_END_TIME not between", value1, value2, "accEndTime");
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