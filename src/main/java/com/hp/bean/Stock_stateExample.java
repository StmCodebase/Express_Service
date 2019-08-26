package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class Stock_stateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Stock_stateExample() {
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

        public Criteria andStockStateNoIsNull() {
            addCriterion("STOCK_STATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andStockStateNoIsNotNull() {
            addCriterion("STOCK_STATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStockStateNoEqualTo(Integer value) {
            addCriterion("STOCK_STATE_NO =", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotEqualTo(Integer value) {
            addCriterion("STOCK_STATE_NO <>", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoGreaterThan(Integer value) {
            addCriterion("STOCK_STATE_NO >", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_STATE_NO >=", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoLessThan(Integer value) {
            addCriterion("STOCK_STATE_NO <", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_STATE_NO <=", value, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoIn(List<Integer> values) {
            addCriterion("STOCK_STATE_NO in", values, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotIn(List<Integer> values) {
            addCriterion("STOCK_STATE_NO not in", values, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_STATE_NO between", value1, value2, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNoNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_STATE_NO not between", value1, value2, "stockStateNo");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsIsNull() {
            addCriterion("STOCK_STATE_NEWS is null");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsIsNotNull() {
            addCriterion("STOCK_STATE_NEWS is not null");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsEqualTo(String value) {
            addCriterion("STOCK_STATE_NEWS =", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsNotEqualTo(String value) {
            addCriterion("STOCK_STATE_NEWS <>", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsGreaterThan(String value) {
            addCriterion("STOCK_STATE_NEWS >", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_STATE_NEWS >=", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsLessThan(String value) {
            addCriterion("STOCK_STATE_NEWS <", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsLessThanOrEqualTo(String value) {
            addCriterion("STOCK_STATE_NEWS <=", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsLike(String value) {
            addCriterion("STOCK_STATE_NEWS like", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsNotLike(String value) {
            addCriterion("STOCK_STATE_NEWS not like", value, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsIn(List<String> values) {
            addCriterion("STOCK_STATE_NEWS in", values, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsNotIn(List<String> values) {
            addCriterion("STOCK_STATE_NEWS not in", values, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsBetween(String value1, String value2) {
            addCriterion("STOCK_STATE_NEWS between", value1, value2, "stockStateNews");
            return (Criteria) this;
        }

        public Criteria andStockStateNewsNotBetween(String value1, String value2) {
            addCriterion("STOCK_STATE_NEWS not between", value1, value2, "stockStateNews");
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