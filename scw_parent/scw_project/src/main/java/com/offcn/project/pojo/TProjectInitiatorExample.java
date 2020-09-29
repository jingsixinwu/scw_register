package com.offcn.project.pojo;

import java.util.ArrayList;
import java.util.List;

public class TProjectInitiatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProjectInitiatorExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionIsNull() {
            addCriterion("selfintroduction is null");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionIsNotNull() {
            addCriterion("selfintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionEqualTo(String value) {
            addCriterion("selfintroduction =", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionNotEqualTo(String value) {
            addCriterion("selfintroduction <>", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionGreaterThan(String value) {
            addCriterion("selfintroduction >", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("selfintroduction >=", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionLessThan(String value) {
            addCriterion("selfintroduction <", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionLessThanOrEqualTo(String value) {
            addCriterion("selfintroduction <=", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionLike(String value) {
            addCriterion("selfintroduction like", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionNotLike(String value) {
            addCriterion("selfintroduction not like", value, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionIn(List<String> values) {
            addCriterion("selfintroduction in", values, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionNotIn(List<String> values) {
            addCriterion("selfintroduction not in", values, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionBetween(String value1, String value2) {
            addCriterion("selfintroduction between", value1, value2, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andSelfintroductionNotBetween(String value1, String value2) {
            addCriterion("selfintroduction not between", value1, value2, "selfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionIsNull() {
            addCriterion("detailselfintroduction is null");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionIsNotNull() {
            addCriterion("detailselfintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionEqualTo(String value) {
            addCriterion("detailselfintroduction =", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionNotEqualTo(String value) {
            addCriterion("detailselfintroduction <>", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionGreaterThan(String value) {
            addCriterion("detailselfintroduction >", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("detailselfintroduction >=", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionLessThan(String value) {
            addCriterion("detailselfintroduction <", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionLessThanOrEqualTo(String value) {
            addCriterion("detailselfintroduction <=", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionLike(String value) {
            addCriterion("detailselfintroduction like", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionNotLike(String value) {
            addCriterion("detailselfintroduction not like", value, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionIn(List<String> values) {
            addCriterion("detailselfintroduction in", values, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionNotIn(List<String> values) {
            addCriterion("detailselfintroduction not in", values, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionBetween(String value1, String value2) {
            addCriterion("detailselfintroduction between", value1, value2, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andDetailselfintroductionNotBetween(String value1, String value2) {
            addCriterion("detailselfintroduction not between", value1, value2, "detailselfintroduction");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNull() {
            addCriterion("hotline is null");
            return (Criteria) this;
        }

        public Criteria andHotlineIsNotNull() {
            addCriterion("hotline is not null");
            return (Criteria) this;
        }

        public Criteria andHotlineEqualTo(String value) {
            addCriterion("hotline =", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotEqualTo(String value) {
            addCriterion("hotline <>", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThan(String value) {
            addCriterion("hotline >", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineGreaterThanOrEqualTo(String value) {
            addCriterion("hotline >=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThan(String value) {
            addCriterion("hotline <", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLessThanOrEqualTo(String value) {
            addCriterion("hotline <=", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineLike(String value) {
            addCriterion("hotline like", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotLike(String value) {
            addCriterion("hotline not like", value, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineIn(List<String> values) {
            addCriterion("hotline in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotIn(List<String> values) {
            addCriterion("hotline not in", values, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineBetween(String value1, String value2) {
            addCriterion("hotline between", value1, value2, "hotline");
            return (Criteria) this;
        }

        public Criteria andHotlineNotBetween(String value1, String value2) {
            addCriterion("hotline not between", value1, value2, "hotline");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
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