package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("d_id like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("d_id not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNull() {
            addCriterion("d_number is null");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNotNull() {
            addCriterion("d_number is not null");
            return (Criteria) this;
        }

        public Criteria andDNumberEqualTo(Integer value) {
            addCriterion("d_number =", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotEqualTo(Integer value) {
            addCriterion("d_number <>", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThan(Integer value) {
            addCriterion("d_number >", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_number >=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThan(Integer value) {
            addCriterion("d_number <", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThanOrEqualTo(Integer value) {
            addCriterion("d_number <=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberIn(List<Integer> values) {
            addCriterion("d_number in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotIn(List<Integer> values) {
            addCriterion("d_number not in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberBetween(Integer value1, Integer value2) {
            addCriterion("d_number between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("d_number not between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthIsNull() {
            addCriterion("d_time_length is null");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthIsNotNull() {
            addCriterion("d_time_length is not null");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthEqualTo(Integer value) {
            addCriterion("d_time_length =", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthNotEqualTo(Integer value) {
            addCriterion("d_time_length <>", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthGreaterThan(Integer value) {
            addCriterion("d_time_length >", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_time_length >=", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthLessThan(Integer value) {
            addCriterion("d_time_length <", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthLessThanOrEqualTo(Integer value) {
            addCriterion("d_time_length <=", value, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthIn(List<Integer> values) {
            addCriterion("d_time_length in", values, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthNotIn(List<Integer> values) {
            addCriterion("d_time_length not in", values, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthBetween(Integer value1, Integer value2) {
            addCriterion("d_time_length between", value1, value2, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDTimeLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("d_time_length not between", value1, value2, "dTimeLength");
            return (Criteria) this;
        }

        public Criteria andDDetailIsNull() {
            addCriterion("d_detail is null");
            return (Criteria) this;
        }

        public Criteria andDDetailIsNotNull() {
            addCriterion("d_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDDetailEqualTo(String value) {
            addCriterion("d_detail =", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotEqualTo(String value) {
            addCriterion("d_detail <>", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThan(String value) {
            addCriterion("d_detail >", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailGreaterThanOrEqualTo(String value) {
            addCriterion("d_detail >=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThan(String value) {
            addCriterion("d_detail <", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLessThanOrEqualTo(String value) {
            addCriterion("d_detail <=", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailLike(String value) {
            addCriterion("d_detail like", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotLike(String value) {
            addCriterion("d_detail not like", value, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailIn(List<String> values) {
            addCriterion("d_detail in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotIn(List<String> values) {
            addCriterion("d_detail not in", values, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailBetween(String value1, String value2) {
            addCriterion("d_detail between", value1, value2, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDDetailNotBetween(String value1, String value2) {
            addCriterion("d_detail not between", value1, value2, "dDetail");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeEqualTo(Long value) {
            addCriterion("d_create_time =", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotEqualTo(Long value) {
            addCriterion("d_create_time <>", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThan(Long value) {
            addCriterion("d_create_time >", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("d_create_time >=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThan(Long value) {
            addCriterion("d_create_time <", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("d_create_time <=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIn(List<Long> values) {
            addCriterion("d_create_time in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotIn(List<Long> values) {
            addCriterion("d_create_time not in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeBetween(Long value1, Long value2) {
            addCriterion("d_create_time between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("d_create_time not between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDRemarkIsNull() {
            addCriterion("d_remark is null");
            return (Criteria) this;
        }

        public Criteria andDRemarkIsNotNull() {
            addCriterion("d_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDRemarkEqualTo(String value) {
            addCriterion("d_remark =", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotEqualTo(String value) {
            addCriterion("d_remark <>", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkGreaterThan(String value) {
            addCriterion("d_remark >", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("d_remark >=", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLessThan(String value) {
            addCriterion("d_remark <", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLessThanOrEqualTo(String value) {
            addCriterion("d_remark <=", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkLike(String value) {
            addCriterion("d_remark like", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotLike(String value) {
            addCriterion("d_remark not like", value, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkIn(List<String> values) {
            addCriterion("d_remark in", values, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotIn(List<String> values) {
            addCriterion("d_remark not in", values, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkBetween(String value1, String value2) {
            addCriterion("d_remark between", value1, value2, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDRemarkNotBetween(String value1, String value2) {
            addCriterion("d_remark not between", value1, value2, "dRemark");
            return (Criteria) this;
        }

        public Criteria andDCidIdIsNull() {
            addCriterion("d_cid_id is null");
            return (Criteria) this;
        }

        public Criteria andDCidIdIsNotNull() {
            addCriterion("d_cid_id is not null");
            return (Criteria) this;
        }

        public Criteria andDCidIdEqualTo(String value) {
            addCriterion("d_cid_id =", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdNotEqualTo(String value) {
            addCriterion("d_cid_id <>", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdGreaterThan(String value) {
            addCriterion("d_cid_id >", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_cid_id >=", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdLessThan(String value) {
            addCriterion("d_cid_id <", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdLessThanOrEqualTo(String value) {
            addCriterion("d_cid_id <=", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdLike(String value) {
            addCriterion("d_cid_id like", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdNotLike(String value) {
            addCriterion("d_cid_id not like", value, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdIn(List<String> values) {
            addCriterion("d_cid_id in", values, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdNotIn(List<String> values) {
            addCriterion("d_cid_id not in", values, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdBetween(String value1, String value2) {
            addCriterion("d_cid_id between", value1, value2, "dCidId");
            return (Criteria) this;
        }

        public Criteria andDCidIdNotBetween(String value1, String value2) {
            addCriterion("d_cid_id not between", value1, value2, "dCidId");
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