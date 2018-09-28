package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(String value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(String value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(String value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(String value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(String value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(String value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLike(String value) {
            addCriterion("l_id like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotLike(String value) {
            addCriterion("l_id not like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<String> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<String> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(String value1, String value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(String value1, String value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLActionIsNull() {
            addCriterion("l_action is null");
            return (Criteria) this;
        }

        public Criteria andLActionIsNotNull() {
            addCriterion("l_action is not null");
            return (Criteria) this;
        }

        public Criteria andLActionEqualTo(String value) {
            addCriterion("l_action =", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionNotEqualTo(String value) {
            addCriterion("l_action <>", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionGreaterThan(String value) {
            addCriterion("l_action >", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionGreaterThanOrEqualTo(String value) {
            addCriterion("l_action >=", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionLessThan(String value) {
            addCriterion("l_action <", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionLessThanOrEqualTo(String value) {
            addCriterion("l_action <=", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionLike(String value) {
            addCriterion("l_action like", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionNotLike(String value) {
            addCriterion("l_action not like", value, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionIn(List<String> values) {
            addCriterion("l_action in", values, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionNotIn(List<String> values) {
            addCriterion("l_action not in", values, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionBetween(String value1, String value2) {
            addCriterion("l_action between", value1, value2, "lAction");
            return (Criteria) this;
        }

        public Criteria andLActionNotBetween(String value1, String value2) {
            addCriterion("l_action not between", value1, value2, "lAction");
            return (Criteria) this;
        }

        public Criteria andLUserIdIsNull() {
            addCriterion("l_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLUserIdIsNotNull() {
            addCriterion("l_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLUserIdEqualTo(String value) {
            addCriterion("l_user_id =", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdNotEqualTo(String value) {
            addCriterion("l_user_id <>", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdGreaterThan(String value) {
            addCriterion("l_user_id >", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("l_user_id >=", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdLessThan(String value) {
            addCriterion("l_user_id <", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdLessThanOrEqualTo(String value) {
            addCriterion("l_user_id <=", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdLike(String value) {
            addCriterion("l_user_id like", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdNotLike(String value) {
            addCriterion("l_user_id not like", value, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdIn(List<String> values) {
            addCriterion("l_user_id in", values, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdNotIn(List<String> values) {
            addCriterion("l_user_id not in", values, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdBetween(String value1, String value2) {
            addCriterion("l_user_id between", value1, value2, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLUserIdNotBetween(String value1, String value2) {
            addCriterion("l_user_id not between", value1, value2, "lUserId");
            return (Criteria) this;
        }

        public Criteria andLIpIsNull() {
            addCriterion("l_ip is null");
            return (Criteria) this;
        }

        public Criteria andLIpIsNotNull() {
            addCriterion("l_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLIpEqualTo(String value) {
            addCriterion("l_ip =", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpNotEqualTo(String value) {
            addCriterion("l_ip <>", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpGreaterThan(String value) {
            addCriterion("l_ip >", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpGreaterThanOrEqualTo(String value) {
            addCriterion("l_ip >=", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpLessThan(String value) {
            addCriterion("l_ip <", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpLessThanOrEqualTo(String value) {
            addCriterion("l_ip <=", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpLike(String value) {
            addCriterion("l_ip like", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpNotLike(String value) {
            addCriterion("l_ip not like", value, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpIn(List<String> values) {
            addCriterion("l_ip in", values, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpNotIn(List<String> values) {
            addCriterion("l_ip not in", values, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpBetween(String value1, String value2) {
            addCriterion("l_ip between", value1, value2, "lIp");
            return (Criteria) this;
        }

        public Criteria andLIpNotBetween(String value1, String value2) {
            addCriterion("l_ip not between", value1, value2, "lIp");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeIsNull() {
            addCriterion("l_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeIsNotNull() {
            addCriterion("l_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeEqualTo(Long value) {
            addCriterion("l_create_time =", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeNotEqualTo(Long value) {
            addCriterion("l_create_time <>", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeGreaterThan(Long value) {
            addCriterion("l_create_time >", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("l_create_time >=", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeLessThan(Long value) {
            addCriterion("l_create_time <", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("l_create_time <=", value, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeIn(List<Long> values) {
            addCriterion("l_create_time in", values, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeNotIn(List<Long> values) {
            addCriterion("l_create_time not in", values, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeBetween(Long value1, Long value2) {
            addCriterion("l_create_time between", value1, value2, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("l_create_time not between", value1, value2, "lCreateTime");
            return (Criteria) this;
        }

        public Criteria andLStateIsNull() {
            addCriterion("l_state is null");
            return (Criteria) this;
        }

        public Criteria andLStateIsNotNull() {
            addCriterion("l_state is not null");
            return (Criteria) this;
        }

        public Criteria andLStateEqualTo(String value) {
            addCriterion("l_state =", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateNotEqualTo(String value) {
            addCriterion("l_state <>", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateGreaterThan(String value) {
            addCriterion("l_state >", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateGreaterThanOrEqualTo(String value) {
            addCriterion("l_state >=", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateLessThan(String value) {
            addCriterion("l_state <", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateLessThanOrEqualTo(String value) {
            addCriterion("l_state <=", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateLike(String value) {
            addCriterion("l_state like", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateNotLike(String value) {
            addCriterion("l_state not like", value, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateIn(List<String> values) {
            addCriterion("l_state in", values, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateNotIn(List<String> values) {
            addCriterion("l_state not in", values, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateBetween(String value1, String value2) {
            addCriterion("l_state between", value1, value2, "lState");
            return (Criteria) this;
        }

        public Criteria andLStateNotBetween(String value1, String value2) {
            addCriterion("l_state not between", value1, value2, "lState");
            return (Criteria) this;
        }

        public Criteria andLRemarkIsNull() {
            addCriterion("l_remark is null");
            return (Criteria) this;
        }

        public Criteria andLRemarkIsNotNull() {
            addCriterion("l_remark is not null");
            return (Criteria) this;
        }

        public Criteria andLRemarkEqualTo(String value) {
            addCriterion("l_remark =", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkNotEqualTo(String value) {
            addCriterion("l_remark <>", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkGreaterThan(String value) {
            addCriterion("l_remark >", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("l_remark >=", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkLessThan(String value) {
            addCriterion("l_remark <", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkLessThanOrEqualTo(String value) {
            addCriterion("l_remark <=", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkLike(String value) {
            addCriterion("l_remark like", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkNotLike(String value) {
            addCriterion("l_remark not like", value, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkIn(List<String> values) {
            addCriterion("l_remark in", values, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkNotIn(List<String> values) {
            addCriterion("l_remark not in", values, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkBetween(String value1, String value2) {
            addCriterion("l_remark between", value1, value2, "lRemark");
            return (Criteria) this;
        }

        public Criteria andLRemarkNotBetween(String value1, String value2) {
            addCriterion("l_remark not between", value1, value2, "lRemark");
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