package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(String value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(String value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(String value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(String value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(String value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLike(String value) {
            addCriterion("e_id like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotLike(String value) {
            addCriterion("e_id not like", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<String> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<String> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(String value1, String value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(String value1, String value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateIsNull() {
            addCriterion("e_ttos_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateIsNotNull() {
            addCriterion("e_ttos_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateEqualTo(String value) {
            addCriterion("e_ttos_evaluate =", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateNotEqualTo(String value) {
            addCriterion("e_ttos_evaluate <>", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateGreaterThan(String value) {
            addCriterion("e_ttos_evaluate >", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("e_ttos_evaluate >=", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateLessThan(String value) {
            addCriterion("e_ttos_evaluate <", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateLessThanOrEqualTo(String value) {
            addCriterion("e_ttos_evaluate <=", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateLike(String value) {
            addCriterion("e_ttos_evaluate like", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateNotLike(String value) {
            addCriterion("e_ttos_evaluate not like", value, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateIn(List<String> values) {
            addCriterion("e_ttos_evaluate in", values, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateNotIn(List<String> values) {
            addCriterion("e_ttos_evaluate not in", values, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateBetween(String value1, String value2) {
            addCriterion("e_ttos_evaluate between", value1, value2, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosEvaluateNotBetween(String value1, String value2) {
            addCriterion("e_ttos_evaluate not between", value1, value2, "eTtosEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateIsNull() {
            addCriterion("e_stot_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateIsNotNull() {
            addCriterion("e_stot_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateEqualTo(String value) {
            addCriterion("e_stot_evaluate =", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateNotEqualTo(String value) {
            addCriterion("e_stot_evaluate <>", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateGreaterThan(String value) {
            addCriterion("e_stot_evaluate >", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("e_stot_evaluate >=", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateLessThan(String value) {
            addCriterion("e_stot_evaluate <", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateLessThanOrEqualTo(String value) {
            addCriterion("e_stot_evaluate <=", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateLike(String value) {
            addCriterion("e_stot_evaluate like", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateNotLike(String value) {
            addCriterion("e_stot_evaluate not like", value, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateIn(List<String> values) {
            addCriterion("e_stot_evaluate in", values, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateNotIn(List<String> values) {
            addCriterion("e_stot_evaluate not in", values, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateBetween(String value1, String value2) {
            addCriterion("e_stot_evaluate between", value1, value2, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andEStotEvaluateNotBetween(String value1, String value2) {
            addCriterion("e_stot_evaluate not between", value1, value2, "eStotEvaluate");
            return (Criteria) this;
        }

        public Criteria andETtosScoreIsNull() {
            addCriterion("e_ttos_score is null");
            return (Criteria) this;
        }

        public Criteria andETtosScoreIsNotNull() {
            addCriterion("e_ttos_score is not null");
            return (Criteria) this;
        }

        public Criteria andETtosScoreEqualTo(Integer value) {
            addCriterion("e_ttos_score =", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreNotEqualTo(Integer value) {
            addCriterion("e_ttos_score <>", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreGreaterThan(Integer value) {
            addCriterion("e_ttos_score >", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_ttos_score >=", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreLessThan(Integer value) {
            addCriterion("e_ttos_score <", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreLessThanOrEqualTo(Integer value) {
            addCriterion("e_ttos_score <=", value, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreIn(List<Integer> values) {
            addCriterion("e_ttos_score in", values, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreNotIn(List<Integer> values) {
            addCriterion("e_ttos_score not in", values, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreBetween(Integer value1, Integer value2) {
            addCriterion("e_ttos_score between", value1, value2, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andETtosScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("e_ttos_score not between", value1, value2, "eTtosScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreIsNull() {
            addCriterion("e_stot_score is null");
            return (Criteria) this;
        }

        public Criteria andEStotScoreIsNotNull() {
            addCriterion("e_stot_score is not null");
            return (Criteria) this;
        }

        public Criteria andEStotScoreEqualTo(Integer value) {
            addCriterion("e_stot_score =", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreNotEqualTo(Integer value) {
            addCriterion("e_stot_score <>", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreGreaterThan(Integer value) {
            addCriterion("e_stot_score >", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_stot_score >=", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreLessThan(Integer value) {
            addCriterion("e_stot_score <", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreLessThanOrEqualTo(Integer value) {
            addCriterion("e_stot_score <=", value, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreIn(List<Integer> values) {
            addCriterion("e_stot_score in", values, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreNotIn(List<Integer> values) {
            addCriterion("e_stot_score not in", values, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreBetween(Integer value1, Integer value2) {
            addCriterion("e_stot_score between", value1, value2, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andEStotScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("e_stot_score not between", value1, value2, "eStotScore");
            return (Criteria) this;
        }

        public Criteria andERemarkIsNull() {
            addCriterion("e_remark is null");
            return (Criteria) this;
        }

        public Criteria andERemarkIsNotNull() {
            addCriterion("e_remark is not null");
            return (Criteria) this;
        }

        public Criteria andERemarkEqualTo(String value) {
            addCriterion("e_remark =", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotEqualTo(String value) {
            addCriterion("e_remark <>", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkGreaterThan(String value) {
            addCriterion("e_remark >", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkGreaterThanOrEqualTo(String value) {
            addCriterion("e_remark >=", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLessThan(String value) {
            addCriterion("e_remark <", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLessThanOrEqualTo(String value) {
            addCriterion("e_remark <=", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLike(String value) {
            addCriterion("e_remark like", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotLike(String value) {
            addCriterion("e_remark not like", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkIn(List<String> values) {
            addCriterion("e_remark in", values, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotIn(List<String> values) {
            addCriterion("e_remark not in", values, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkBetween(String value1, String value2) {
            addCriterion("e_remark between", value1, value2, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotBetween(String value1, String value2) {
            addCriterion("e_remark not between", value1, value2, "eRemark");
            return (Criteria) this;
        }

        public Criteria andECreateTimeIsNull() {
            addCriterion("e_create_time is null");
            return (Criteria) this;
        }

        public Criteria andECreateTimeIsNotNull() {
            addCriterion("e_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andECreateTimeEqualTo(Long value) {
            addCriterion("e_create_time =", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeNotEqualTo(Long value) {
            addCriterion("e_create_time <>", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeGreaterThan(Long value) {
            addCriterion("e_create_time >", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("e_create_time >=", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeLessThan(Long value) {
            addCriterion("e_create_time <", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("e_create_time <=", value, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeIn(List<Long> values) {
            addCriterion("e_create_time in", values, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeNotIn(List<Long> values) {
            addCriterion("e_create_time not in", values, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeBetween(Long value1, Long value2) {
            addCriterion("e_create_time between", value1, value2, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andECreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("e_create_time not between", value1, value2, "eCreateTime");
            return (Criteria) this;
        }

        public Criteria andEDidIdIsNull() {
            addCriterion("e_did_id is null");
            return (Criteria) this;
        }

        public Criteria andEDidIdIsNotNull() {
            addCriterion("e_did_id is not null");
            return (Criteria) this;
        }

        public Criteria andEDidIdEqualTo(String value) {
            addCriterion("e_did_id =", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdNotEqualTo(String value) {
            addCriterion("e_did_id <>", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdGreaterThan(String value) {
            addCriterion("e_did_id >", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_did_id >=", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdLessThan(String value) {
            addCriterion("e_did_id <", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdLessThanOrEqualTo(String value) {
            addCriterion("e_did_id <=", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdLike(String value) {
            addCriterion("e_did_id like", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdNotLike(String value) {
            addCriterion("e_did_id not like", value, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdIn(List<String> values) {
            addCriterion("e_did_id in", values, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdNotIn(List<String> values) {
            addCriterion("e_did_id not in", values, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdBetween(String value1, String value2) {
            addCriterion("e_did_id between", value1, value2, "eDidId");
            return (Criteria) this;
        }

        public Criteria andEDidIdNotBetween(String value1, String value2) {
            addCriterion("e_did_id not between", value1, value2, "eDidId");
            return (Criteria) this;
        }

        public Criteria andESidIdIsNull() {
            addCriterion("e_sid_id is null");
            return (Criteria) this;
        }

        public Criteria andESidIdIsNotNull() {
            addCriterion("e_sid_id is not null");
            return (Criteria) this;
        }

        public Criteria andESidIdEqualTo(String value) {
            addCriterion("e_sid_id =", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdNotEqualTo(String value) {
            addCriterion("e_sid_id <>", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdGreaterThan(String value) {
            addCriterion("e_sid_id >", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_sid_id >=", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdLessThan(String value) {
            addCriterion("e_sid_id <", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdLessThanOrEqualTo(String value) {
            addCriterion("e_sid_id <=", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdLike(String value) {
            addCriterion("e_sid_id like", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdNotLike(String value) {
            addCriterion("e_sid_id not like", value, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdIn(List<String> values) {
            addCriterion("e_sid_id in", values, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdNotIn(List<String> values) {
            addCriterion("e_sid_id not in", values, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdBetween(String value1, String value2) {
            addCriterion("e_sid_id between", value1, value2, "eSidId");
            return (Criteria) this;
        }

        public Criteria andESidIdNotBetween(String value1, String value2) {
            addCriterion("e_sid_id not between", value1, value2, "eSidId");
            return (Criteria) this;
        }

        public Criteria andETidIdIsNull() {
            addCriterion("e_tid_id is null");
            return (Criteria) this;
        }

        public Criteria andETidIdIsNotNull() {
            addCriterion("e_tid_id is not null");
            return (Criteria) this;
        }

        public Criteria andETidIdEqualTo(String value) {
            addCriterion("e_tid_id =", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdNotEqualTo(String value) {
            addCriterion("e_tid_id <>", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdGreaterThan(String value) {
            addCriterion("e_tid_id >", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdGreaterThanOrEqualTo(String value) {
            addCriterion("e_tid_id >=", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdLessThan(String value) {
            addCriterion("e_tid_id <", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdLessThanOrEqualTo(String value) {
            addCriterion("e_tid_id <=", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdLike(String value) {
            addCriterion("e_tid_id like", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdNotLike(String value) {
            addCriterion("e_tid_id not like", value, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdIn(List<String> values) {
            addCriterion("e_tid_id in", values, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdNotIn(List<String> values) {
            addCriterion("e_tid_id not in", values, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdBetween(String value1, String value2) {
            addCriterion("e_tid_id between", value1, value2, "eTidId");
            return (Criteria) this;
        }

        public Criteria andETidIdNotBetween(String value1, String value2) {
            addCriterion("e_tid_id not between", value1, value2, "eTidId");
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