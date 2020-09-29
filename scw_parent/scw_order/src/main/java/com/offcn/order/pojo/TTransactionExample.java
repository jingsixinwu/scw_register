package com.offcn.order.pojo;

import java.util.ArrayList;
import java.util.List;

public class TTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransactionExample() {
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

        public Criteria andOrdersnIsNull() {
            addCriterion("ordersn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersnIsNotNull() {
            addCriterion("ordersn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersnEqualTo(String value) {
            addCriterion("ordersn =", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotEqualTo(String value) {
            addCriterion("ordersn <>", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThan(String value) {
            addCriterion("ordersn >", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThanOrEqualTo(String value) {
            addCriterion("ordersn >=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThan(String value) {
            addCriterion("ordersn <", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThanOrEqualTo(String value) {
            addCriterion("ordersn <=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLike(String value) {
            addCriterion("ordersn like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotLike(String value) {
            addCriterion("ordersn not like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnIn(List<String> values) {
            addCriterion("ordersn in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotIn(List<String> values) {
            addCriterion("ordersn not in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnBetween(String value1, String value2) {
            addCriterion("ordersn between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotBetween(String value1, String value2) {
            addCriterion("ordersn not between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andPaysnIsNull() {
            addCriterion("paysn is null");
            return (Criteria) this;
        }

        public Criteria andPaysnIsNotNull() {
            addCriterion("paysn is not null");
            return (Criteria) this;
        }

        public Criteria andPaysnEqualTo(String value) {
            addCriterion("paysn =", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnNotEqualTo(String value) {
            addCriterion("paysn <>", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnGreaterThan(String value) {
            addCriterion("paysn >", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnGreaterThanOrEqualTo(String value) {
            addCriterion("paysn >=", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnLessThan(String value) {
            addCriterion("paysn <", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnLessThanOrEqualTo(String value) {
            addCriterion("paysn <=", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnLike(String value) {
            addCriterion("paysn like", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnNotLike(String value) {
            addCriterion("paysn not like", value, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnIn(List<String> values) {
            addCriterion("paysn in", values, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnNotIn(List<String> values) {
            addCriterion("paysn not in", values, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnBetween(String value1, String value2) {
            addCriterion("paysn between", value1, value2, "paysn");
            return (Criteria) this;
        }

        public Criteria andPaysnNotBetween(String value1, String value2) {
            addCriterion("paysn not between", value1, value2, "paysn");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNull() {
            addCriterion("paystate is null");
            return (Criteria) this;
        }

        public Criteria andPaystateIsNotNull() {
            addCriterion("paystate is not null");
            return (Criteria) this;
        }

        public Criteria andPaystateEqualTo(Byte value) {
            addCriterion("paystate =", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotEqualTo(Byte value) {
            addCriterion("paystate <>", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThan(Byte value) {
            addCriterion("paystate >", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateGreaterThanOrEqualTo(Byte value) {
            addCriterion("paystate >=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThan(Byte value) {
            addCriterion("paystate <", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateLessThanOrEqualTo(Byte value) {
            addCriterion("paystate <=", value, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateIn(List<Byte> values) {
            addCriterion("paystate in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotIn(List<Byte> values) {
            addCriterion("paystate not in", values, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateBetween(Byte value1, Byte value2) {
            addCriterion("paystate between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andPaystateNotBetween(Byte value1, Byte value2) {
            addCriterion("paystate not between", value1, value2, "paystate");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIsNull() {
            addCriterion("completiontime is null");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIsNotNull() {
            addCriterion("completiontime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeEqualTo(String value) {
            addCriterion("completiontime =", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotEqualTo(String value) {
            addCriterion("completiontime <>", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeGreaterThan(String value) {
            addCriterion("completiontime >", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("completiontime >=", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeLessThan(String value) {
            addCriterion("completiontime <", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeLessThanOrEqualTo(String value) {
            addCriterion("completiontime <=", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeLike(String value) {
            addCriterion("completiontime like", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotLike(String value) {
            addCriterion("completiontime not like", value, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeIn(List<String> values) {
            addCriterion("completiontime in", values, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotIn(List<String> values) {
            addCriterion("completiontime not in", values, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeBetween(String value1, String value2) {
            addCriterion("completiontime between", value1, value2, "completiontime");
            return (Criteria) this;
        }

        public Criteria andCompletiontimeNotBetween(String value1, String value2) {
            addCriterion("completiontime not between", value1, value2, "completiontime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createat is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(String value) {
            addCriterion("createat =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(String value) {
            addCriterion("createat <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(String value) {
            addCriterion("createat >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(String value) {
            addCriterion("createat >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(String value) {
            addCriterion("createat <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(String value) {
            addCriterion("createat <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLike(String value) {
            addCriterion("createat like", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotLike(String value) {
            addCriterion("createat not like", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<String> values) {
            addCriterion("createat in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<String> values) {
            addCriterion("createat not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(String value1, String value2) {
            addCriterion("createat between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(String value1, String value2) {
            addCriterion("createat not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("updateat is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("updateat is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(String value) {
            addCriterion("updateat =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(String value) {
            addCriterion("updateat <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(String value) {
            addCriterion("updateat >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(String value) {
            addCriterion("updateat >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(String value) {
            addCriterion("updateat <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(String value) {
            addCriterion("updateat <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLike(String value) {
            addCriterion("updateat like", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotLike(String value) {
            addCriterion("updateat not like", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<String> values) {
            addCriterion("updateat in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<String> values) {
            addCriterion("updateat not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(String value1, String value2) {
            addCriterion("updateat between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(String value1, String value2) {
            addCriterion("updateat not between", value1, value2, "updateat");
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