package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class GrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrantExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(String value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(String value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(String value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(String value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(String value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLike(String value) {
            addCriterion("g_id like", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotLike(String value) {
            addCriterion("g_id not like", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<String> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<String> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(String value1, String value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(String value1, String value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGRecordIsNull() {
            addCriterion("g_record is null");
            return (Criteria) this;
        }

        public Criteria andGRecordIsNotNull() {
            addCriterion("g_record is not null");
            return (Criteria) this;
        }

        public Criteria andGRecordEqualTo(String value) {
            addCriterion("g_record =", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordNotEqualTo(String value) {
            addCriterion("g_record <>", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordGreaterThan(String value) {
            addCriterion("g_record >", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordGreaterThanOrEqualTo(String value) {
            addCriterion("g_record >=", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordLessThan(String value) {
            addCriterion("g_record <", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordLessThanOrEqualTo(String value) {
            addCriterion("g_record <=", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordLike(String value) {
            addCriterion("g_record like", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordNotLike(String value) {
            addCriterion("g_record not like", value, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordIn(List<String> values) {
            addCriterion("g_record in", values, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordNotIn(List<String> values) {
            addCriterion("g_record not in", values, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordBetween(String value1, String value2) {
            addCriterion("g_record between", value1, value2, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGRecordNotBetween(String value1, String value2) {
            addCriterion("g_record not between", value1, value2, "gRecord");
            return (Criteria) this;
        }

        public Criteria andGTimeIsNull() {
            addCriterion("g_time is null");
            return (Criteria) this;
        }

        public Criteria andGTimeIsNotNull() {
            addCriterion("g_time is not null");
            return (Criteria) this;
        }

        public Criteria andGTimeEqualTo(Long value) {
            addCriterion("g_time =", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeNotEqualTo(Long value) {
            addCriterion("g_time <>", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeGreaterThan(Long value) {
            addCriterion("g_time >", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("g_time >=", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeLessThan(Long value) {
            addCriterion("g_time <", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeLessThanOrEqualTo(Long value) {
            addCriterion("g_time <=", value, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeIn(List<Long> values) {
            addCriterion("g_time in", values, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeNotIn(List<Long> values) {
            addCriterion("g_time not in", values, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeBetween(Long value1, Long value2) {
            addCriterion("g_time between", value1, value2, "gTime");
            return (Criteria) this;
        }

        public Criteria andGTimeNotBetween(Long value1, Long value2) {
            addCriterion("g_time not between", value1, value2, "gTime");
            return (Criteria) this;
        }

        public Criteria andGUrlIsNull() {
            addCriterion("g_url is null");
            return (Criteria) this;
        }

        public Criteria andGUrlIsNotNull() {
            addCriterion("g_url is not null");
            return (Criteria) this;
        }

        public Criteria andGUrlEqualTo(String value) {
            addCriterion("g_url =", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotEqualTo(String value) {
            addCriterion("g_url <>", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlGreaterThan(String value) {
            addCriterion("g_url >", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlGreaterThanOrEqualTo(String value) {
            addCriterion("g_url >=", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLessThan(String value) {
            addCriterion("g_url <", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLessThanOrEqualTo(String value) {
            addCriterion("g_url <=", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLike(String value) {
            addCriterion("g_url like", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotLike(String value) {
            addCriterion("g_url not like", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlIn(List<String> values) {
            addCriterion("g_url in", values, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotIn(List<String> values) {
            addCriterion("g_url not in", values, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlBetween(String value1, String value2) {
            addCriterion("g_url between", value1, value2, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotBetween(String value1, String value2) {
            addCriterion("g_url not between", value1, value2, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGRemarkIsNull() {
            addCriterion("g_remark is null");
            return (Criteria) this;
        }

        public Criteria andGRemarkIsNotNull() {
            addCriterion("g_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGRemarkEqualTo(String value) {
            addCriterion("g_remark =", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkNotEqualTo(String value) {
            addCriterion("g_remark <>", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkGreaterThan(String value) {
            addCriterion("g_remark >", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("g_remark >=", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkLessThan(String value) {
            addCriterion("g_remark <", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkLessThanOrEqualTo(String value) {
            addCriterion("g_remark <=", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkLike(String value) {
            addCriterion("g_remark like", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkNotLike(String value) {
            addCriterion("g_remark not like", value, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkIn(List<String> values) {
            addCriterion("g_remark in", values, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkNotIn(List<String> values) {
            addCriterion("g_remark not in", values, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkBetween(String value1, String value2) {
            addCriterion("g_remark between", value1, value2, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGRemarkNotBetween(String value1, String value2) {
            addCriterion("g_remark not between", value1, value2, "gRemark");
            return (Criteria) this;
        }

        public Criteria andGDidIdIsNull() {
            addCriterion("g_did_id is null");
            return (Criteria) this;
        }

        public Criteria andGDidIdIsNotNull() {
            addCriterion("g_did_id is not null");
            return (Criteria) this;
        }

        public Criteria andGDidIdEqualTo(String value) {
            addCriterion("g_did_id =", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdNotEqualTo(String value) {
            addCriterion("g_did_id <>", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdGreaterThan(String value) {
            addCriterion("g_did_id >", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_did_id >=", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdLessThan(String value) {
            addCriterion("g_did_id <", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdLessThanOrEqualTo(String value) {
            addCriterion("g_did_id <=", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdLike(String value) {
            addCriterion("g_did_id like", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdNotLike(String value) {
            addCriterion("g_did_id not like", value, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdIn(List<String> values) {
            addCriterion("g_did_id in", values, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdNotIn(List<String> values) {
            addCriterion("g_did_id not in", values, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdBetween(String value1, String value2) {
            addCriterion("g_did_id between", value1, value2, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGDidIdNotBetween(String value1, String value2) {
            addCriterion("g_did_id not between", value1, value2, "gDidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdIsNull() {
            addCriterion("g_sid_id is null");
            return (Criteria) this;
        }

        public Criteria andGSidIdIsNotNull() {
            addCriterion("g_sid_id is not null");
            return (Criteria) this;
        }

        public Criteria andGSidIdEqualTo(String value) {
            addCriterion("g_sid_id =", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdNotEqualTo(String value) {
            addCriterion("g_sid_id <>", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdGreaterThan(String value) {
            addCriterion("g_sid_id >", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_sid_id >=", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdLessThan(String value) {
            addCriterion("g_sid_id <", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdLessThanOrEqualTo(String value) {
            addCriterion("g_sid_id <=", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdLike(String value) {
            addCriterion("g_sid_id like", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdNotLike(String value) {
            addCriterion("g_sid_id not like", value, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdIn(List<String> values) {
            addCriterion("g_sid_id in", values, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdNotIn(List<String> values) {
            addCriterion("g_sid_id not in", values, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdBetween(String value1, String value2) {
            addCriterion("g_sid_id between", value1, value2, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGSidIdNotBetween(String value1, String value2) {
            addCriterion("g_sid_id not between", value1, value2, "gSidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdIsNull() {
            addCriterion("g_tid_id is null");
            return (Criteria) this;
        }

        public Criteria andGTidIdIsNotNull() {
            addCriterion("g_tid_id is not null");
            return (Criteria) this;
        }

        public Criteria andGTidIdEqualTo(String value) {
            addCriterion("g_tid_id =", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdNotEqualTo(String value) {
            addCriterion("g_tid_id <>", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdGreaterThan(String value) {
            addCriterion("g_tid_id >", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_tid_id >=", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdLessThan(String value) {
            addCriterion("g_tid_id <", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdLessThanOrEqualTo(String value) {
            addCriterion("g_tid_id <=", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdLike(String value) {
            addCriterion("g_tid_id like", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdNotLike(String value) {
            addCriterion("g_tid_id not like", value, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdIn(List<String> values) {
            addCriterion("g_tid_id in", values, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdNotIn(List<String> values) {
            addCriterion("g_tid_id not in", values, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdBetween(String value1, String value2) {
            addCriterion("g_tid_id between", value1, value2, "gTidId");
            return (Criteria) this;
        }

        public Criteria andGTidIdNotBetween(String value1, String value2) {
            addCriterion("g_tid_id not between", value1, value2, "gTidId");
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