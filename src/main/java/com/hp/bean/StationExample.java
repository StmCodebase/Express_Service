package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("CNO is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("CNO is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("CNO =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("CNO <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("CNO >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNO >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("CNO <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("CNO <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("CNO in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("CNO not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("CNO between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("CNO not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andStaNameIsNull() {
            addCriterion("STA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaNameIsNotNull() {
            addCriterion("STA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaNameEqualTo(String value) {
            addCriterion("STA_NAME =", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotEqualTo(String value) {
            addCriterion("STA_NAME <>", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThan(String value) {
            addCriterion("STA_NAME >", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThanOrEqualTo(String value) {
            addCriterion("STA_NAME >=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThan(String value) {
            addCriterion("STA_NAME <", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThanOrEqualTo(String value) {
            addCriterion("STA_NAME <=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLike(String value) {
            addCriterion("STA_NAME like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotLike(String value) {
            addCriterion("STA_NAME not like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameIn(List<String> values) {
            addCriterion("STA_NAME in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotIn(List<String> values) {
            addCriterion("STA_NAME not in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameBetween(String value1, String value2) {
            addCriterion("STA_NAME between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotBetween(String value1, String value2) {
            addCriterion("STA_NAME not between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andStaAddressIsNull() {
            addCriterion("STA_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStaAddressIsNotNull() {
            addCriterion("STA_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStaAddressEqualTo(String value) {
            addCriterion("STA_ADDRESS =", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressNotEqualTo(String value) {
            addCriterion("STA_ADDRESS <>", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressGreaterThan(String value) {
            addCriterion("STA_ADDRESS >", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("STA_ADDRESS >=", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressLessThan(String value) {
            addCriterion("STA_ADDRESS <", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressLessThanOrEqualTo(String value) {
            addCriterion("STA_ADDRESS <=", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressLike(String value) {
            addCriterion("STA_ADDRESS like", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressNotLike(String value) {
            addCriterion("STA_ADDRESS not like", value, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressIn(List<String> values) {
            addCriterion("STA_ADDRESS in", values, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressNotIn(List<String> values) {
            addCriterion("STA_ADDRESS not in", values, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressBetween(String value1, String value2) {
            addCriterion("STA_ADDRESS between", value1, value2, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaAddressNotBetween(String value1, String value2) {
            addCriterion("STA_ADDRESS not between", value1, value2, "staAddress");
            return (Criteria) this;
        }

        public Criteria andStaPersonIsNull() {
            addCriterion("STA_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andStaPersonIsNotNull() {
            addCriterion("STA_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andStaPersonEqualTo(String value) {
            addCriterion("STA_PERSON =", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonNotEqualTo(String value) {
            addCriterion("STA_PERSON <>", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonGreaterThan(String value) {
            addCriterion("STA_PERSON >", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonGreaterThanOrEqualTo(String value) {
            addCriterion("STA_PERSON >=", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonLessThan(String value) {
            addCriterion("STA_PERSON <", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonLessThanOrEqualTo(String value) {
            addCriterion("STA_PERSON <=", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonLike(String value) {
            addCriterion("STA_PERSON like", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonNotLike(String value) {
            addCriterion("STA_PERSON not like", value, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonIn(List<String> values) {
            addCriterion("STA_PERSON in", values, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonNotIn(List<String> values) {
            addCriterion("STA_PERSON not in", values, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonBetween(String value1, String value2) {
            addCriterion("STA_PERSON between", value1, value2, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPersonNotBetween(String value1, String value2) {
            addCriterion("STA_PERSON not between", value1, value2, "staPerson");
            return (Criteria) this;
        }

        public Criteria andStaPhoneIsNull() {
            addCriterion("STA_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStaPhoneIsNotNull() {
            addCriterion("STA_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStaPhoneEqualTo(String value) {
            addCriterion("STA_PHONE =", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneNotEqualTo(String value) {
            addCriterion("STA_PHONE <>", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneGreaterThan(String value) {
            addCriterion("STA_PHONE >", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STA_PHONE >=", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneLessThan(String value) {
            addCriterion("STA_PHONE <", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneLessThanOrEqualTo(String value) {
            addCriterion("STA_PHONE <=", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneLike(String value) {
            addCriterion("STA_PHONE like", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneNotLike(String value) {
            addCriterion("STA_PHONE not like", value, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneIn(List<String> values) {
            addCriterion("STA_PHONE in", values, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneNotIn(List<String> values) {
            addCriterion("STA_PHONE not in", values, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneBetween(String value1, String value2) {
            addCriterion("STA_PHONE between", value1, value2, "staPhone");
            return (Criteria) this;
        }

        public Criteria andStaPhoneNotBetween(String value1, String value2) {
            addCriterion("STA_PHONE not between", value1, value2, "staPhone");
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