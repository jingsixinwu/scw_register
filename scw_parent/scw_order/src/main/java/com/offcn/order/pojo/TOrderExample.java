package com.offcn.order.pojo;

import java.util.ArrayList;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
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

        public Criteria andReturnidIsNull() {
            addCriterion("returnid is null");
            return (Criteria) this;
        }

        public Criteria andReturnidIsNotNull() {
            addCriterion("returnid is not null");
            return (Criteria) this;
        }

        public Criteria andReturnidEqualTo(Integer value) {
            addCriterion("returnid =", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotEqualTo(Integer value) {
            addCriterion("returnid <>", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThan(Integer value) {
            addCriterion("returnid >", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnid >=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThan(Integer value) {
            addCriterion("returnid <", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThanOrEqualTo(Integer value) {
            addCriterion("returnid <=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidIn(List<Integer> values) {
            addCriterion("returnid in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotIn(List<Integer> values) {
            addCriterion("returnid not in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidBetween(Integer value1, Integer value2) {
            addCriterion("returnid between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotBetween(Integer value1, Integer value2) {
            addCriterion("returnid not between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ordernum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("ordernum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("ordernum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("ordernum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("ordernum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("ordernum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("ordernum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("ordernum like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("ordernum not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("ordernum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("ordernum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("ordernum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("ordernum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("createdate like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("createdate not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRtncountIsNull() {
            addCriterion("rtncount is null");
            return (Criteria) this;
        }

        public Criteria andRtncountIsNotNull() {
            addCriterion("rtncount is not null");
            return (Criteria) this;
        }

        public Criteria andRtncountEqualTo(Integer value) {
            addCriterion("rtncount =", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountNotEqualTo(Integer value) {
            addCriterion("rtncount <>", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountGreaterThan(Integer value) {
            addCriterion("rtncount >", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtncount >=", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountLessThan(Integer value) {
            addCriterion("rtncount <", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountLessThanOrEqualTo(Integer value) {
            addCriterion("rtncount <=", value, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountIn(List<Integer> values) {
            addCriterion("rtncount in", values, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountNotIn(List<Integer> values) {
            addCriterion("rtncount not in", values, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountBetween(Integer value1, Integer value2) {
            addCriterion("rtncount between", value1, value2, "rtncount");
            return (Criteria) this;
        }

        public Criteria andRtncountNotBetween(Integer value1, Integer value2) {
            addCriterion("rtncount not between", value1, value2, "rtncount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoictitleIsNull() {
            addCriterion("invoictitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoictitleIsNotNull() {
            addCriterion("invoictitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoictitleEqualTo(String value) {
            addCriterion("invoictitle =", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleNotEqualTo(String value) {
            addCriterion("invoictitle <>", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleGreaterThan(String value) {
            addCriterion("invoictitle >", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoictitle >=", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleLessThan(String value) {
            addCriterion("invoictitle <", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleLessThanOrEqualTo(String value) {
            addCriterion("invoictitle <=", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleLike(String value) {
            addCriterion("invoictitle like", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleNotLike(String value) {
            addCriterion("invoictitle not like", value, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleIn(List<String> values) {
            addCriterion("invoictitle in", values, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleNotIn(List<String> values) {
            addCriterion("invoictitle not in", values, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleBetween(String value1, String value2) {
            addCriterion("invoictitle between", value1, value2, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andInvoictitleNotBetween(String value1, String value2) {
            addCriterion("invoictitle not between", value1, value2, "invoictitle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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