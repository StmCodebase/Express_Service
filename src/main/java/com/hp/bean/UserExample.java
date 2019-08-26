package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andGNoIsNull() {
            addCriterion("G_NO is null");
            return (Criteria) this;
        }

        public Criteria andGNoIsNotNull() {
            addCriterion("G_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGNoEqualTo(Integer value) {
            addCriterion("G_NO =", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoNotEqualTo(Integer value) {
            addCriterion("G_NO <>", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoGreaterThan(Integer value) {
            addCriterion("G_NO >", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_NO >=", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoLessThan(Integer value) {
            addCriterion("G_NO <", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoLessThanOrEqualTo(Integer value) {
            addCriterion("G_NO <=", value, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoIn(List<Integer> values) {
            addCriterion("G_NO in", values, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoNotIn(List<Integer> values) {
            addCriterion("G_NO not in", values, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoBetween(Integer value1, Integer value2) {
            addCriterion("G_NO between", value1, value2, "gNo");
            return (Criteria) this;
        }

        public Criteria andGNoNotBetween(Integer value1, Integer value2) {
            addCriterion("G_NO not between", value1, value2, "gNo");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_EMAIL =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_EMAIL <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_EMAIL >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_EMAIL >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_EMAIL <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_EMAIL <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_EMAIL like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_EMAIL not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_EMAIL in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_EMAIL not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_EMAIL between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_EMAIL not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("U_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("U_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("U_PHONE =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("U_PHONE <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("U_PHONE >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("U_PHONE >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("U_PHONE <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("U_PHONE <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("U_PHONE like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("U_PHONE not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("U_PHONE in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("U_PHONE not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("U_PHONE between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("U_PHONE not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("U_SEX like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("U_SEX not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUNumIsNull() {
            addCriterion("U_NUM is null");
            return (Criteria) this;
        }

        public Criteria andUNumIsNotNull() {
            addCriterion("U_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andUNumEqualTo(String value) {
            addCriterion("U_NUM =", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotEqualTo(String value) {
            addCriterion("U_NUM <>", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumGreaterThan(String value) {
            addCriterion("U_NUM >", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumGreaterThanOrEqualTo(String value) {
            addCriterion("U_NUM >=", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumLessThan(String value) {
            addCriterion("U_NUM <", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumLessThanOrEqualTo(String value) {
            addCriterion("U_NUM <=", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumLike(String value) {
            addCriterion("U_NUM like", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotLike(String value) {
            addCriterion("U_NUM not like", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumIn(List<String> values) {
            addCriterion("U_NUM in", values, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotIn(List<String> values) {
            addCriterion("U_NUM not in", values, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumBetween(String value1, String value2) {
            addCriterion("U_NUM between", value1, value2, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotBetween(String value1, String value2) {
            addCriterion("U_NUM not between", value1, value2, "uNum");
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