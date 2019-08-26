package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class CourierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourierExample() {
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

        public Criteria andCourierNoIsNull() {
            addCriterion("COURIER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCourierNoIsNotNull() {
            addCriterion("COURIER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNoEqualTo(Integer value) {
            addCriterion("COURIER_NO =", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoNotEqualTo(Integer value) {
            addCriterion("COURIER_NO <>", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoGreaterThan(Integer value) {
            addCriterion("COURIER_NO >", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURIER_NO >=", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoLessThan(Integer value) {
            addCriterion("COURIER_NO <", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoLessThanOrEqualTo(Integer value) {
            addCriterion("COURIER_NO <=", value, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoIn(List<Integer> values) {
            addCriterion("COURIER_NO in", values, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoNotIn(List<Integer> values) {
            addCriterion("COURIER_NO not in", values, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_NO between", value1, value2, "courierNo");
            return (Criteria) this;
        }

        public Criteria andCourierNoNotBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_NO not between", value1, value2, "courierNo");
            return (Criteria) this;
        }

        public Criteria andStaNoIsNull() {
            addCriterion("STA_NO is null");
            return (Criteria) this;
        }

        public Criteria andStaNoIsNotNull() {
            addCriterion("STA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStaNoEqualTo(Integer value) {
            addCriterion("STA_NO =", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoNotEqualTo(Integer value) {
            addCriterion("STA_NO <>", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoGreaterThan(Integer value) {
            addCriterion("STA_NO >", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STA_NO >=", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoLessThan(Integer value) {
            addCriterion("STA_NO <", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoLessThanOrEqualTo(Integer value) {
            addCriterion("STA_NO <=", value, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoIn(List<Integer> values) {
            addCriterion("STA_NO in", values, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoNotIn(List<Integer> values) {
            addCriterion("STA_NO not in", values, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoBetween(Integer value1, Integer value2) {
            addCriterion("STA_NO between", value1, value2, "staNo");
            return (Criteria) this;
        }

        public Criteria andStaNoNotBetween(Integer value1, Integer value2) {
            addCriterion("STA_NO not between", value1, value2, "staNo");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNull() {
            addCriterion("COURIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNotNull() {
            addCriterion("COURIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNameEqualTo(String value) {
            addCriterion("COURIER_NAME =", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotEqualTo(String value) {
            addCriterion("COURIER_NAME <>", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThan(String value) {
            addCriterion("COURIER_NAME >", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURIER_NAME >=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThan(String value) {
            addCriterion("COURIER_NAME <", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThanOrEqualTo(String value) {
            addCriterion("COURIER_NAME <=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLike(String value) {
            addCriterion("COURIER_NAME like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotLike(String value) {
            addCriterion("COURIER_NAME not like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameIn(List<String> values) {
            addCriterion("COURIER_NAME in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotIn(List<String> values) {
            addCriterion("COURIER_NAME not in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameBetween(String value1, String value2) {
            addCriterion("COURIER_NAME between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotBetween(String value1, String value2) {
            addCriterion("COURIER_NAME not between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIsNull() {
            addCriterion("COURIER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIsNotNull() {
            addCriterion("COURIER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneEqualTo(String value) {
            addCriterion("COURIER_PHONE =", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotEqualTo(String value) {
            addCriterion("COURIER_PHONE <>", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneGreaterThan(String value) {
            addCriterion("COURIER_PHONE >", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COURIER_PHONE >=", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLessThan(String value) {
            addCriterion("COURIER_PHONE <", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLessThanOrEqualTo(String value) {
            addCriterion("COURIER_PHONE <=", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneLike(String value) {
            addCriterion("COURIER_PHONE like", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotLike(String value) {
            addCriterion("COURIER_PHONE not like", value, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneIn(List<String> values) {
            addCriterion("COURIER_PHONE in", values, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotIn(List<String> values) {
            addCriterion("COURIER_PHONE not in", values, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneBetween(String value1, String value2) {
            addCriterion("COURIER_PHONE between", value1, value2, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierPhoneNotBetween(String value1, String value2) {
            addCriterion("COURIER_PHONE not between", value1, value2, "courierPhone");
            return (Criteria) this;
        }

        public Criteria andCourierSexIsNull() {
            addCriterion("COURIER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andCourierSexIsNotNull() {
            addCriterion("COURIER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andCourierSexEqualTo(String value) {
            addCriterion("COURIER_SEX =", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexNotEqualTo(String value) {
            addCriterion("COURIER_SEX <>", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexGreaterThan(String value) {
            addCriterion("COURIER_SEX >", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexGreaterThanOrEqualTo(String value) {
            addCriterion("COURIER_SEX >=", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexLessThan(String value) {
            addCriterion("COURIER_SEX <", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexLessThanOrEqualTo(String value) {
            addCriterion("COURIER_SEX <=", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexLike(String value) {
            addCriterion("COURIER_SEX like", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexNotLike(String value) {
            addCriterion("COURIER_SEX not like", value, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexIn(List<String> values) {
            addCriterion("COURIER_SEX in", values, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexNotIn(List<String> values) {
            addCriterion("COURIER_SEX not in", values, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexBetween(String value1, String value2) {
            addCriterion("COURIER_SEX between", value1, value2, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierSexNotBetween(String value1, String value2) {
            addCriterion("COURIER_SEX not between", value1, value2, "courierSex");
            return (Criteria) this;
        }

        public Criteria andCourierEmailIsNull() {
            addCriterion("COURIER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCourierEmailIsNotNull() {
            addCriterion("COURIER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCourierEmailEqualTo(String value) {
            addCriterion("COURIER_EMAIL =", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailNotEqualTo(String value) {
            addCriterion("COURIER_EMAIL <>", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailGreaterThan(String value) {
            addCriterion("COURIER_EMAIL >", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("COURIER_EMAIL >=", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailLessThan(String value) {
            addCriterion("COURIER_EMAIL <", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailLessThanOrEqualTo(String value) {
            addCriterion("COURIER_EMAIL <=", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailLike(String value) {
            addCriterion("COURIER_EMAIL like", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailNotLike(String value) {
            addCriterion("COURIER_EMAIL not like", value, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailIn(List<String> values) {
            addCriterion("COURIER_EMAIL in", values, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailNotIn(List<String> values) {
            addCriterion("COURIER_EMAIL not in", values, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailBetween(String value1, String value2) {
            addCriterion("COURIER_EMAIL between", value1, value2, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierEmailNotBetween(String value1, String value2) {
            addCriterion("COURIER_EMAIL not between", value1, value2, "courierEmail");
            return (Criteria) this;
        }

        public Criteria andCourierNumIsNull() {
            addCriterion("COURIER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCourierNumIsNotNull() {
            addCriterion("COURIER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNumEqualTo(String value) {
            addCriterion("COURIER_NUM =", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotEqualTo(String value) {
            addCriterion("COURIER_NUM <>", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThan(String value) {
            addCriterion("COURIER_NUM >", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThanOrEqualTo(String value) {
            addCriterion("COURIER_NUM >=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThan(String value) {
            addCriterion("COURIER_NUM <", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThanOrEqualTo(String value) {
            addCriterion("COURIER_NUM <=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLike(String value) {
            addCriterion("COURIER_NUM like", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotLike(String value) {
            addCriterion("COURIER_NUM not like", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumIn(List<String> values) {
            addCriterion("COURIER_NUM in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotIn(List<String> values) {
            addCriterion("COURIER_NUM not in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumBetween(String value1, String value2) {
            addCriterion("COURIER_NUM between", value1, value2, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotBetween(String value1, String value2) {
            addCriterion("COURIER_NUM not between", value1, value2, "courierNum");
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