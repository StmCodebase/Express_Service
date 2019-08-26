package com.hp.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andCnoStarIsNull() {
            addCriterion("CNO_STAR is null");
            return (Criteria) this;
        }

        public Criteria andCnoStarIsNotNull() {
            addCriterion("CNO_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andCnoStarEqualTo(Integer value) {
            addCriterion("CNO_STAR =", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarNotEqualTo(Integer value) {
            addCriterion("CNO_STAR <>", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarGreaterThan(Integer value) {
            addCriterion("CNO_STAR >", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNO_STAR >=", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarLessThan(Integer value) {
            addCriterion("CNO_STAR <", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarLessThanOrEqualTo(Integer value) {
            addCriterion("CNO_STAR <=", value, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarIn(List<Integer> values) {
            addCriterion("CNO_STAR in", values, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarNotIn(List<Integer> values) {
            addCriterion("CNO_STAR not in", values, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarBetween(Integer value1, Integer value2) {
            addCriterion("CNO_STAR between", value1, value2, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andCnoStarNotBetween(Integer value1, Integer value2) {
            addCriterion("CNO_STAR not between", value1, value2, "cnoStar");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressIsNull() {
            addCriterion("PO_STAR_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressIsNotNull() {
            addCriterion("PO_STAR_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressEqualTo(String value) {
            addCriterion("PO_STAR_ADDRESS =", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressNotEqualTo(String value) {
            addCriterion("PO_STAR_ADDRESS <>", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressGreaterThan(String value) {
            addCriterion("PO_STAR_ADDRESS >", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PO_STAR_ADDRESS >=", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressLessThan(String value) {
            addCriterion("PO_STAR_ADDRESS <", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressLessThanOrEqualTo(String value) {
            addCriterion("PO_STAR_ADDRESS <=", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressLike(String value) {
            addCriterion("PO_STAR_ADDRESS like", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressNotLike(String value) {
            addCriterion("PO_STAR_ADDRESS not like", value, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressIn(List<String> values) {
            addCriterion("PO_STAR_ADDRESS in", values, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressNotIn(List<String> values) {
            addCriterion("PO_STAR_ADDRESS not in", values, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressBetween(String value1, String value2) {
            addCriterion("PO_STAR_ADDRESS between", value1, value2, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoStarAddressNotBetween(String value1, String value2) {
            addCriterion("PO_STAR_ADDRESS not between", value1, value2, "poStarAddress");
            return (Criteria) this;
        }

        public Criteria andPoSenderIsNull() {
            addCriterion("PO_SENDER is null");
            return (Criteria) this;
        }

        public Criteria andPoSenderIsNotNull() {
            addCriterion("PO_SENDER is not null");
            return (Criteria) this;
        }

        public Criteria andPoSenderEqualTo(String value) {
            addCriterion("PO_SENDER =", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderNotEqualTo(String value) {
            addCriterion("PO_SENDER <>", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderGreaterThan(String value) {
            addCriterion("PO_SENDER >", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderGreaterThanOrEqualTo(String value) {
            addCriterion("PO_SENDER >=", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderLessThan(String value) {
            addCriterion("PO_SENDER <", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderLessThanOrEqualTo(String value) {
            addCriterion("PO_SENDER <=", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderLike(String value) {
            addCriterion("PO_SENDER like", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderNotLike(String value) {
            addCriterion("PO_SENDER not like", value, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderIn(List<String> values) {
            addCriterion("PO_SENDER in", values, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderNotIn(List<String> values) {
            addCriterion("PO_SENDER not in", values, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderBetween(String value1, String value2) {
            addCriterion("PO_SENDER between", value1, value2, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderNotBetween(String value1, String value2) {
            addCriterion("PO_SENDER not between", value1, value2, "poSender");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneIsNull() {
            addCriterion("PO_SENDER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneIsNotNull() {
            addCriterion("PO_SENDER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneEqualTo(String value) {
            addCriterion("PO_SENDER_PHONE =", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneNotEqualTo(String value) {
            addCriterion("PO_SENDER_PHONE <>", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneGreaterThan(String value) {
            addCriterion("PO_SENDER_PHONE >", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PO_SENDER_PHONE >=", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneLessThan(String value) {
            addCriterion("PO_SENDER_PHONE <", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneLessThanOrEqualTo(String value) {
            addCriterion("PO_SENDER_PHONE <=", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneLike(String value) {
            addCriterion("PO_SENDER_PHONE like", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneNotLike(String value) {
            addCriterion("PO_SENDER_PHONE not like", value, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneIn(List<String> values) {
            addCriterion("PO_SENDER_PHONE in", values, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneNotIn(List<String> values) {
            addCriterion("PO_SENDER_PHONE not in", values, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneBetween(String value1, String value2) {
            addCriterion("PO_SENDER_PHONE between", value1, value2, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andPoSenderPhoneNotBetween(String value1, String value2) {
            addCriterion("PO_SENDER_PHONE not between", value1, value2, "poSenderPhone");
            return (Criteria) this;
        }

        public Criteria andCourierStarIsNull() {
            addCriterion("COURIER_STAR is null");
            return (Criteria) this;
        }

        public Criteria andCourierStarIsNotNull() {
            addCriterion("COURIER_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andCourierStarEqualTo(Integer value) {
            addCriterion("COURIER_STAR =", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotEqualTo(Integer value) {
            addCriterion("COURIER_STAR <>", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarGreaterThan(Integer value) {
            addCriterion("COURIER_STAR >", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURIER_STAR >=", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarLessThan(Integer value) {
            addCriterion("COURIER_STAR <", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarLessThanOrEqualTo(Integer value) {
            addCriterion("COURIER_STAR <=", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarIn(List<Integer> values) {
            addCriterion("COURIER_STAR in", values, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotIn(List<Integer> values) {
            addCriterion("COURIER_STAR not in", values, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_STAR between", value1, value2, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_STAR not between", value1, value2, "courierStar");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeIsNull() {
            addCriterion("PO_STAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeIsNotNull() {
            addCriterion("PO_STAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeEqualTo(Date value) {
            addCriterion("PO_STAR_TIME =", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeNotEqualTo(Date value) {
            addCriterion("PO_STAR_TIME <>", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeGreaterThan(Date value) {
            addCriterion("PO_STAR_TIME >", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PO_STAR_TIME >=", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeLessThan(Date value) {
            addCriterion("PO_STAR_TIME <", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeLessThanOrEqualTo(Date value) {
            addCriterion("PO_STAR_TIME <=", value, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeIn(List<Date> values) {
            addCriterion("PO_STAR_TIME in", values, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeNotIn(List<Date> values) {
            addCriterion("PO_STAR_TIME not in", values, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeBetween(Date value1, Date value2) {
            addCriterion("PO_STAR_TIME between", value1, value2, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoStarTimeNotBetween(Date value1, Date value2) {
            addCriterion("PO_STAR_TIME not between", value1, value2, "poStarTime");
            return (Criteria) this;
        }

        public Criteria andPoPriceIsNull() {
            addCriterion("PO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPoPriceIsNotNull() {
            addCriterion("PO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPoPriceEqualTo(String value) {
            addCriterion("PO_PRICE =", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotEqualTo(String value) {
            addCriterion("PO_PRICE <>", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceGreaterThan(String value) {
            addCriterion("PO_PRICE >", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PO_PRICE >=", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceLessThan(String value) {
            addCriterion("PO_PRICE <", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceLessThanOrEqualTo(String value) {
            addCriterion("PO_PRICE <=", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceLike(String value) {
            addCriterion("PO_PRICE like", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotLike(String value) {
            addCriterion("PO_PRICE not like", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceIn(List<String> values) {
            addCriterion("PO_PRICE in", values, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotIn(List<String> values) {
            addCriterion("PO_PRICE not in", values, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceBetween(String value1, String value2) {
            addCriterion("PO_PRICE between", value1, value2, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotBetween(String value1, String value2) {
            addCriterion("PO_PRICE not between", value1, value2, "poPrice");
            return (Criteria) this;
        }

        public Criteria andCnoEndIsNull() {
            addCriterion("CNO_END is null");
            return (Criteria) this;
        }

        public Criteria andCnoEndIsNotNull() {
            addCriterion("CNO_END is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEndEqualTo(Integer value) {
            addCriterion("CNO_END =", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndNotEqualTo(Integer value) {
            addCriterion("CNO_END <>", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndGreaterThan(Integer value) {
            addCriterion("CNO_END >", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNO_END >=", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndLessThan(Integer value) {
            addCriterion("CNO_END <", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndLessThanOrEqualTo(Integer value) {
            addCriterion("CNO_END <=", value, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndIn(List<Integer> values) {
            addCriterion("CNO_END in", values, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndNotIn(List<Integer> values) {
            addCriterion("CNO_END not in", values, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndBetween(Integer value1, Integer value2) {
            addCriterion("CNO_END between", value1, value2, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andCnoEndNotBetween(Integer value1, Integer value2) {
            addCriterion("CNO_END not between", value1, value2, "cnoEnd");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressIsNull() {
            addCriterion("PO_END_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressIsNotNull() {
            addCriterion("PO_END_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressEqualTo(String value) {
            addCriterion("PO_END_ADDRESS =", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressNotEqualTo(String value) {
            addCriterion("PO_END_ADDRESS <>", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressGreaterThan(String value) {
            addCriterion("PO_END_ADDRESS >", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PO_END_ADDRESS >=", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressLessThan(String value) {
            addCriterion("PO_END_ADDRESS <", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressLessThanOrEqualTo(String value) {
            addCriterion("PO_END_ADDRESS <=", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressLike(String value) {
            addCriterion("PO_END_ADDRESS like", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressNotLike(String value) {
            addCriterion("PO_END_ADDRESS not like", value, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressIn(List<String> values) {
            addCriterion("PO_END_ADDRESS in", values, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressNotIn(List<String> values) {
            addCriterion("PO_END_ADDRESS not in", values, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressBetween(String value1, String value2) {
            addCriterion("PO_END_ADDRESS between", value1, value2, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoEndAddressNotBetween(String value1, String value2) {
            addCriterion("PO_END_ADDRESS not between", value1, value2, "poEndAddress");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeIsNull() {
            addCriterion("PO_ADDRESSEE is null");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeIsNotNull() {
            addCriterion("PO_ADDRESSEE is not null");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeEqualTo(String value) {
            addCriterion("PO_ADDRESSEE =", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeNotEqualTo(String value) {
            addCriterion("PO_ADDRESSEE <>", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeGreaterThan(String value) {
            addCriterion("PO_ADDRESSEE >", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("PO_ADDRESSEE >=", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeLessThan(String value) {
            addCriterion("PO_ADDRESSEE <", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeLessThanOrEqualTo(String value) {
            addCriterion("PO_ADDRESSEE <=", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeLike(String value) {
            addCriterion("PO_ADDRESSEE like", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeNotLike(String value) {
            addCriterion("PO_ADDRESSEE not like", value, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeIn(List<String> values) {
            addCriterion("PO_ADDRESSEE in", values, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeNotIn(List<String> values) {
            addCriterion("PO_ADDRESSEE not in", values, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeBetween(String value1, String value2) {
            addCriterion("PO_ADDRESSEE between", value1, value2, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseeNotBetween(String value1, String value2) {
            addCriterion("PO_ADDRESSEE not between", value1, value2, "poAddressee");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneIsNull() {
            addCriterion("PO_ADDRESSEE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneIsNotNull() {
            addCriterion("PO_ADDRESSEE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneEqualTo(String value) {
            addCriterion("PO_ADDRESSEE_PHONE =", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneNotEqualTo(String value) {
            addCriterion("PO_ADDRESSEE_PHONE <>", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneGreaterThan(String value) {
            addCriterion("PO_ADDRESSEE_PHONE >", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PO_ADDRESSEE_PHONE >=", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneLessThan(String value) {
            addCriterion("PO_ADDRESSEE_PHONE <", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneLessThanOrEqualTo(String value) {
            addCriterion("PO_ADDRESSEE_PHONE <=", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneLike(String value) {
            addCriterion("PO_ADDRESSEE_PHONE like", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneNotLike(String value) {
            addCriterion("PO_ADDRESSEE_PHONE not like", value, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneIn(List<String> values) {
            addCriterion("PO_ADDRESSEE_PHONE in", values, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneNotIn(List<String> values) {
            addCriterion("PO_ADDRESSEE_PHONE not in", values, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneBetween(String value1, String value2) {
            addCriterion("PO_ADDRESSEE_PHONE between", value1, value2, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andPoAddresseePhoneNotBetween(String value1, String value2) {
            addCriterion("PO_ADDRESSEE_PHONE not between", value1, value2, "poAddresseePhone");
            return (Criteria) this;
        }

        public Criteria andCourierEndIsNull() {
            addCriterion("COURIER_END is null");
            return (Criteria) this;
        }

        public Criteria andCourierEndIsNotNull() {
            addCriterion("COURIER_END is not null");
            return (Criteria) this;
        }

        public Criteria andCourierEndEqualTo(Integer value) {
            addCriterion("COURIER_END =", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndNotEqualTo(Integer value) {
            addCriterion("COURIER_END <>", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndGreaterThan(Integer value) {
            addCriterion("COURIER_END >", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURIER_END >=", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndLessThan(Integer value) {
            addCriterion("COURIER_END <", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndLessThanOrEqualTo(Integer value) {
            addCriterion("COURIER_END <=", value, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndIn(List<Integer> values) {
            addCriterion("COURIER_END in", values, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndNotIn(List<Integer> values) {
            addCriterion("COURIER_END not in", values, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_END between", value1, value2, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andCourierEndNotBetween(Integer value1, Integer value2) {
            addCriterion("COURIER_END not between", value1, value2, "courierEnd");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIsNull() {
            addCriterion("PO_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIsNotNull() {
            addCriterion("PO_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeEqualTo(Date value) {
            addCriterion("PO_END_TIME =", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotEqualTo(Date value) {
            addCriterion("PO_END_TIME <>", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeGreaterThan(Date value) {
            addCriterion("PO_END_TIME >", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PO_END_TIME >=", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeLessThan(Date value) {
            addCriterion("PO_END_TIME <", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("PO_END_TIME <=", value, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeIn(List<Date> values) {
            addCriterion("PO_END_TIME in", values, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotIn(List<Date> values) {
            addCriterion("PO_END_TIME not in", values, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeBetween(Date value1, Date value2) {
            addCriterion("PO_END_TIME between", value1, value2, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("PO_END_TIME not between", value1, value2, "poEndTime");
            return (Criteria) this;
        }

        public Criteria andPoWeightIsNull() {
            addCriterion("PO_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPoWeightIsNotNull() {
            addCriterion("PO_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPoWeightEqualTo(Float value) {
            addCriterion("PO_WEIGHT =", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightNotEqualTo(Float value) {
            addCriterion("PO_WEIGHT <>", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightGreaterThan(Float value) {
            addCriterion("PO_WEIGHT >", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("PO_WEIGHT >=", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightLessThan(Float value) {
            addCriterion("PO_WEIGHT <", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightLessThanOrEqualTo(Float value) {
            addCriterion("PO_WEIGHT <=", value, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightIn(List<Float> values) {
            addCriterion("PO_WEIGHT in", values, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightNotIn(List<Float> values) {
            addCriterion("PO_WEIGHT not in", values, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightBetween(Float value1, Float value2) {
            addCriterion("PO_WEIGHT between", value1, value2, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoWeightNotBetween(Float value1, Float value2) {
            addCriterion("PO_WEIGHT not between", value1, value2, "poWeight");
            return (Criteria) this;
        }

        public Criteria andPoPayIsNull() {
            addCriterion("PO_PAY is null");
            return (Criteria) this;
        }

        public Criteria andPoPayIsNotNull() {
            addCriterion("PO_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andPoPayEqualTo(String value) {
            addCriterion("PO_PAY =", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayNotEqualTo(String value) {
            addCriterion("PO_PAY <>", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayGreaterThan(String value) {
            addCriterion("PO_PAY >", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayGreaterThanOrEqualTo(String value) {
            addCriterion("PO_PAY >=", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayLessThan(String value) {
            addCriterion("PO_PAY <", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayLessThanOrEqualTo(String value) {
            addCriterion("PO_PAY <=", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayLike(String value) {
            addCriterion("PO_PAY like", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayNotLike(String value) {
            addCriterion("PO_PAY not like", value, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayIn(List<String> values) {
            addCriterion("PO_PAY in", values, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayNotIn(List<String> values) {
            addCriterion("PO_PAY not in", values, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayBetween(String value1, String value2) {
            addCriterion("PO_PAY between", value1, value2, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoPayNotBetween(String value1, String value2) {
            addCriterion("PO_PAY not between", value1, value2, "poPay");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseIsNull() {
            addCriterion("PO_APPRAISE is null");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseIsNotNull() {
            addCriterion("PO_APPRAISE is not null");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseEqualTo(String value) {
            addCriterion("PO_APPRAISE =", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseNotEqualTo(String value) {
            addCriterion("PO_APPRAISE <>", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseGreaterThan(String value) {
            addCriterion("PO_APPRAISE >", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseGreaterThanOrEqualTo(String value) {
            addCriterion("PO_APPRAISE >=", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseLessThan(String value) {
            addCriterion("PO_APPRAISE <", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseLessThanOrEqualTo(String value) {
            addCriterion("PO_APPRAISE <=", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseLike(String value) {
            addCriterion("PO_APPRAISE like", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseNotLike(String value) {
            addCriterion("PO_APPRAISE not like", value, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseIn(List<String> values) {
            addCriterion("PO_APPRAISE in", values, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseNotIn(List<String> values) {
            addCriterion("PO_APPRAISE not in", values, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseBetween(String value1, String value2) {
            addCriterion("PO_APPRAISE between", value1, value2, "poAppraise");
            return (Criteria) this;
        }

        public Criteria andPoAppraiseNotBetween(String value1, String value2) {
            addCriterion("PO_APPRAISE not between", value1, value2, "poAppraise");
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