package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class Account_numExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Account_numExample() {
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

        public Criteria andAccNumIsNull() {
            addCriterion("ACC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAccNumIsNotNull() {
            addCriterion("ACC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAccNumEqualTo(String value) {
            addCriterion("ACC_NUM =", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotEqualTo(String value) {
            addCriterion("ACC_NUM <>", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThan(String value) {
            addCriterion("ACC_NUM >", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NUM >=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThan(String value) {
            addCriterion("ACC_NUM <", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLessThanOrEqualTo(String value) {
            addCriterion("ACC_NUM <=", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumLike(String value) {
            addCriterion("ACC_NUM like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotLike(String value) {
            addCriterion("ACC_NUM not like", value, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumIn(List<String> values) {
            addCriterion("ACC_NUM in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotIn(List<String> values) {
            addCriterion("ACC_NUM not in", values, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumBetween(String value1, String value2) {
            addCriterion("ACC_NUM between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccNumNotBetween(String value1, String value2) {
            addCriterion("ACC_NUM not between", value1, value2, "accNum");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNull() {
            addCriterion("ACC_PWD is null");
            return (Criteria) this;
        }

        public Criteria andAccPwdIsNotNull() {
            addCriterion("ACC_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andAccPwdEqualTo(String value) {
            addCriterion("ACC_PWD =", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotEqualTo(String value) {
            addCriterion("ACC_PWD <>", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThan(String value) {
            addCriterion("ACC_PWD >", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_PWD >=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThan(String value) {
            addCriterion("ACC_PWD <", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLessThanOrEqualTo(String value) {
            addCriterion("ACC_PWD <=", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdLike(String value) {
            addCriterion("ACC_PWD like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotLike(String value) {
            addCriterion("ACC_PWD not like", value, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdIn(List<String> values) {
            addCriterion("ACC_PWD in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotIn(List<String> values) {
            addCriterion("ACC_PWD not in", values, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdBetween(String value1, String value2) {
            addCriterion("ACC_PWD between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccPwdNotBetween(String value1, String value2) {
            addCriterion("ACC_PWD not between", value1, value2, "accPwd");
            return (Criteria) this;
        }

        public Criteria andAccStateIsNull() {
            addCriterion("ACC_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAccStateIsNotNull() {
            addCriterion("ACC_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccStateEqualTo(String value) {
            addCriterion("ACC_STATE =", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotEqualTo(String value) {
            addCriterion("ACC_STATE <>", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateGreaterThan(String value) {
            addCriterion("ACC_STATE >", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_STATE >=", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateLessThan(String value) {
            addCriterion("ACC_STATE <", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateLessThanOrEqualTo(String value) {
            addCriterion("ACC_STATE <=", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateLike(String value) {
            addCriterion("ACC_STATE like", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotLike(String value) {
            addCriterion("ACC_STATE not like", value, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateIn(List<String> values) {
            addCriterion("ACC_STATE in", values, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotIn(List<String> values) {
            addCriterion("ACC_STATE not in", values, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateBetween(String value1, String value2) {
            addCriterion("ACC_STATE between", value1, value2, "accState");
            return (Criteria) this;
        }

        public Criteria andAccStateNotBetween(String value1, String value2) {
            addCriterion("ACC_STATE not between", value1, value2, "accState");
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