package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEntNoIsNull() {
            addCriterion("ENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andEntNoIsNotNull() {
            addCriterion("ENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEntNoEqualTo(Integer value) {
            addCriterion("ENT_NO =", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoNotEqualTo(Integer value) {
            addCriterion("ENT_NO <>", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoGreaterThan(Integer value) {
            addCriterion("ENT_NO >", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENT_NO >=", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoLessThan(Integer value) {
            addCriterion("ENT_NO <", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoLessThanOrEqualTo(Integer value) {
            addCriterion("ENT_NO <=", value, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoIn(List<Integer> values) {
            addCriterion("ENT_NO in", values, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoNotIn(List<Integer> values) {
            addCriterion("ENT_NO not in", values, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoBetween(Integer value1, Integer value2) {
            addCriterion("ENT_NO between", value1, value2, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ENT_NO not between", value1, value2, "entNo");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNull() {
            addCriterion("ENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNotNull() {
            addCriterion("ENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntNameEqualTo(String value) {
            addCriterion("ENT_NAME =", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotEqualTo(String value) {
            addCriterion("ENT_NAME <>", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThan(String value) {
            addCriterion("ENT_NAME >", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_NAME >=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThan(String value) {
            addCriterion("ENT_NAME <", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThanOrEqualTo(String value) {
            addCriterion("ENT_NAME <=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLike(String value) {
            addCriterion("ENT_NAME like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotLike(String value) {
            addCriterion("ENT_NAME not like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameIn(List<String> values) {
            addCriterion("ENT_NAME in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotIn(List<String> values) {
            addCriterion("ENT_NAME not in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameBetween(String value1, String value2) {
            addCriterion("ENT_NAME between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotBetween(String value1, String value2) {
            addCriterion("ENT_NAME not between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntAddressIsNull() {
            addCriterion("ENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEntAddressIsNotNull() {
            addCriterion("ENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEntAddressEqualTo(String value) {
            addCriterion("ENT_ADDRESS =", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressNotEqualTo(String value) {
            addCriterion("ENT_ADDRESS <>", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressGreaterThan(String value) {
            addCriterion("ENT_ADDRESS >", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_ADDRESS >=", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressLessThan(String value) {
            addCriterion("ENT_ADDRESS <", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressLessThanOrEqualTo(String value) {
            addCriterion("ENT_ADDRESS <=", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressLike(String value) {
            addCriterion("ENT_ADDRESS like", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressNotLike(String value) {
            addCriterion("ENT_ADDRESS not like", value, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressIn(List<String> values) {
            addCriterion("ENT_ADDRESS in", values, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressNotIn(List<String> values) {
            addCriterion("ENT_ADDRESS not in", values, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressBetween(String value1, String value2) {
            addCriterion("ENT_ADDRESS between", value1, value2, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntAddressNotBetween(String value1, String value2) {
            addCriterion("ENT_ADDRESS not between", value1, value2, "entAddress");
            return (Criteria) this;
        }

        public Criteria andEntPersonIsNull() {
            addCriterion("ENT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andEntPersonIsNotNull() {
            addCriterion("ENT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andEntPersonEqualTo(String value) {
            addCriterion("ENT_PERSON =", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonNotEqualTo(String value) {
            addCriterion("ENT_PERSON <>", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonGreaterThan(String value) {
            addCriterion("ENT_PERSON >", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_PERSON >=", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonLessThan(String value) {
            addCriterion("ENT_PERSON <", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonLessThanOrEqualTo(String value) {
            addCriterion("ENT_PERSON <=", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonLike(String value) {
            addCriterion("ENT_PERSON like", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonNotLike(String value) {
            addCriterion("ENT_PERSON not like", value, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonIn(List<String> values) {
            addCriterion("ENT_PERSON in", values, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonNotIn(List<String> values) {
            addCriterion("ENT_PERSON not in", values, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonBetween(String value1, String value2) {
            addCriterion("ENT_PERSON between", value1, value2, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPersonNotBetween(String value1, String value2) {
            addCriterion("ENT_PERSON not between", value1, value2, "entPerson");
            return (Criteria) this;
        }

        public Criteria andEntPhoneIsNull() {
            addCriterion("ENT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEntPhoneIsNotNull() {
            addCriterion("ENT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEntPhoneEqualTo(String value) {
            addCriterion("ENT_PHONE =", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneNotEqualTo(String value) {
            addCriterion("ENT_PHONE <>", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneGreaterThan(String value) {
            addCriterion("ENT_PHONE >", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_PHONE >=", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneLessThan(String value) {
            addCriterion("ENT_PHONE <", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneLessThanOrEqualTo(String value) {
            addCriterion("ENT_PHONE <=", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneLike(String value) {
            addCriterion("ENT_PHONE like", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneNotLike(String value) {
            addCriterion("ENT_PHONE not like", value, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneIn(List<String> values) {
            addCriterion("ENT_PHONE in", values, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneNotIn(List<String> values) {
            addCriterion("ENT_PHONE not in", values, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneBetween(String value1, String value2) {
            addCriterion("ENT_PHONE between", value1, value2, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntPhoneNotBetween(String value1, String value2) {
            addCriterion("ENT_PHONE not between", value1, value2, "entPhone");
            return (Criteria) this;
        }

        public Criteria andEntEmailIsNull() {
            addCriterion("ENT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEntEmailIsNotNull() {
            addCriterion("ENT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEntEmailEqualTo(String value) {
            addCriterion("ENT_EMAIL =", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailNotEqualTo(String value) {
            addCriterion("ENT_EMAIL <>", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailGreaterThan(String value) {
            addCriterion("ENT_EMAIL >", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ENT_EMAIL >=", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailLessThan(String value) {
            addCriterion("ENT_EMAIL <", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailLessThanOrEqualTo(String value) {
            addCriterion("ENT_EMAIL <=", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailLike(String value) {
            addCriterion("ENT_EMAIL like", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailNotLike(String value) {
            addCriterion("ENT_EMAIL not like", value, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailIn(List<String> values) {
            addCriterion("ENT_EMAIL in", values, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailNotIn(List<String> values) {
            addCriterion("ENT_EMAIL not in", values, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailBetween(String value1, String value2) {
            addCriterion("ENT_EMAIL between", value1, value2, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntEmailNotBetween(String value1, String value2) {
            addCriterion("ENT_EMAIL not between", value1, value2, "entEmail");
            return (Criteria) this;
        }

        public Criteria andEntDateIsNull() {
            addCriterion("ENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEntDateIsNotNull() {
            addCriterion("ENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntDateEqualTo(Date value) {
            addCriterionForJDBCDate("ENT_DATE =", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENT_DATE <>", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ENT_DATE >", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENT_DATE >=", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateLessThan(Date value) {
            addCriterionForJDBCDate("ENT_DATE <", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENT_DATE <=", value, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateIn(List<Date> values) {
            addCriterionForJDBCDate("ENT_DATE in", values, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENT_DATE not in", values, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENT_DATE between", value1, value2, "entDate");
            return (Criteria) this;
        }

        public Criteria andEntDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENT_DATE not between", value1, value2, "entDate");
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