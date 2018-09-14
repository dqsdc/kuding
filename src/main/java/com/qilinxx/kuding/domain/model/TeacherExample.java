package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNull() {
            addCriterion("t_account is null");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNotNull() {
            addCriterion("t_account is not null");
            return (Criteria) this;
        }

        public Criteria andTAccountEqualTo(Integer value) {
            addCriterion("t_account =", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotEqualTo(Integer value) {
            addCriterion("t_account <>", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThan(Integer value) {
            addCriterion("t_account >", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_account >=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThan(Integer value) {
            addCriterion("t_account <", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThanOrEqualTo(Integer value) {
            addCriterion("t_account <=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountIn(List<Integer> values) {
            addCriterion("t_account in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotIn(List<Integer> values) {
            addCriterion("t_account not in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountBetween(Integer value1, Integer value2) {
            addCriterion("t_account between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("t_account not between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNull() {
            addCriterion("t_password is null");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNotNull() {
            addCriterion("t_password is not null");
            return (Criteria) this;
        }

        public Criteria andTPasswordEqualTo(String value) {
            addCriterion("t_password =", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotEqualTo(String value) {
            addCriterion("t_password <>", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThan(String value) {
            addCriterion("t_password >", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("t_password >=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThan(String value) {
            addCriterion("t_password <", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThanOrEqualTo(String value) {
            addCriterion("t_password <=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLike(String value) {
            addCriterion("t_password like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotLike(String value) {
            addCriterion("t_password not like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordIn(List<String> values) {
            addCriterion("t_password in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotIn(List<String> values) {
            addCriterion("t_password not in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordBetween(String value1, String value2) {
            addCriterion("t_password between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotBetween(String value1, String value2) {
            addCriterion("t_password not between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Integer value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Integer value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Integer value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Integer value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Integer value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Integer> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Integer> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Integer value1, Integer value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(Boolean value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(Boolean value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(Boolean value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(Boolean value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(Boolean value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<Boolean> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<Boolean> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(Boolean value1, Boolean value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTStateIsNull() {
            addCriterion("t_state is null");
            return (Criteria) this;
        }

        public Criteria andTStateIsNotNull() {
            addCriterion("t_state is not null");
            return (Criteria) this;
        }

        public Criteria andTStateEqualTo(Boolean value) {
            addCriterion("t_state =", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotEqualTo(Boolean value) {
            addCriterion("t_state <>", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThan(Boolean value) {
            addCriterion("t_state >", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_state >=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThan(Boolean value) {
            addCriterion("t_state <", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThanOrEqualTo(Boolean value) {
            addCriterion("t_state <=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateIn(List<Boolean> values) {
            addCriterion("t_state in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotIn(List<Boolean> values) {
            addCriterion("t_state not in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state not between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNull() {
            addCriterion("t_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("t_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeEqualTo(Long value) {
            addCriterion("t_create_time =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(Long value) {
            addCriterion("t_create_time <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(Long value) {
            addCriterion("t_create_time >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("t_create_time >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(Long value) {
            addCriterion("t_create_time <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("t_create_time <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<Long> values) {
            addCriterion("t_create_time in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<Long> values) {
            addCriterion("t_create_time not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(Long value1, Long value2) {
            addCriterion("t_create_time between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("t_create_time not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTDegreeIsNull() {
            addCriterion("t_degree is null");
            return (Criteria) this;
        }

        public Criteria andTDegreeIsNotNull() {
            addCriterion("t_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTDegreeEqualTo(String value) {
            addCriterion("t_degree =", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotEqualTo(String value) {
            addCriterion("t_degree <>", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeGreaterThan(String value) {
            addCriterion("t_degree >", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("t_degree >=", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeLessThan(String value) {
            addCriterion("t_degree <", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeLessThanOrEqualTo(String value) {
            addCriterion("t_degree <=", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeLike(String value) {
            addCriterion("t_degree like", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotLike(String value) {
            addCriterion("t_degree not like", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeIn(List<String> values) {
            addCriterion("t_degree in", values, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotIn(List<String> values) {
            addCriterion("t_degree not in", values, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeBetween(String value1, String value2) {
            addCriterion("t_degree between", value1, value2, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotBetween(String value1, String value2) {
            addCriterion("t_degree not between", value1, value2, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDetailIsNull() {
            addCriterion("t_detail is null");
            return (Criteria) this;
        }

        public Criteria andTDetailIsNotNull() {
            addCriterion("t_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTDetailEqualTo(String value) {
            addCriterion("t_detail =", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotEqualTo(String value) {
            addCriterion("t_detail <>", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailGreaterThan(String value) {
            addCriterion("t_detail >", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailGreaterThanOrEqualTo(String value) {
            addCriterion("t_detail >=", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLessThan(String value) {
            addCriterion("t_detail <", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLessThanOrEqualTo(String value) {
            addCriterion("t_detail <=", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailLike(String value) {
            addCriterion("t_detail like", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotLike(String value) {
            addCriterion("t_detail not like", value, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailIn(List<String> values) {
            addCriterion("t_detail in", values, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotIn(List<String> values) {
            addCriterion("t_detail not in", values, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailBetween(String value1, String value2) {
            addCriterion("t_detail between", value1, value2, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTDetailNotBetween(String value1, String value2) {
            addCriterion("t_detail not between", value1, value2, "tDetail");
            return (Criteria) this;
        }

        public Criteria andTHeadImageIsNull() {
            addCriterion("t_head_image is null");
            return (Criteria) this;
        }

        public Criteria andTHeadImageIsNotNull() {
            addCriterion("t_head_image is not null");
            return (Criteria) this;
        }

        public Criteria andTHeadImageEqualTo(String value) {
            addCriterion("t_head_image =", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageNotEqualTo(String value) {
            addCriterion("t_head_image <>", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageGreaterThan(String value) {
            addCriterion("t_head_image >", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("t_head_image >=", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageLessThan(String value) {
            addCriterion("t_head_image <", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageLessThanOrEqualTo(String value) {
            addCriterion("t_head_image <=", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageLike(String value) {
            addCriterion("t_head_image like", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageNotLike(String value) {
            addCriterion("t_head_image not like", value, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageIn(List<String> values) {
            addCriterion("t_head_image in", values, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageNotIn(List<String> values) {
            addCriterion("t_head_image not in", values, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageBetween(String value1, String value2) {
            addCriterion("t_head_image between", value1, value2, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTHeadImageNotBetween(String value1, String value2) {
            addCriterion("t_head_image not between", value1, value2, "tHeadImage");
            return (Criteria) this;
        }

        public Criteria andTRemarkIsNull() {
            addCriterion("t_remark is null");
            return (Criteria) this;
        }

        public Criteria andTRemarkIsNotNull() {
            addCriterion("t_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTRemarkEqualTo(String value) {
            addCriterion("t_remark =", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotEqualTo(String value) {
            addCriterion("t_remark <>", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkGreaterThan(String value) {
            addCriterion("t_remark >", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("t_remark >=", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLessThan(String value) {
            addCriterion("t_remark <", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLessThanOrEqualTo(String value) {
            addCriterion("t_remark <=", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLike(String value) {
            addCriterion("t_remark like", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotLike(String value) {
            addCriterion("t_remark not like", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkIn(List<String> values) {
            addCriterion("t_remark in", values, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotIn(List<String> values) {
            addCriterion("t_remark not in", values, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkBetween(String value1, String value2) {
            addCriterion("t_remark between", value1, value2, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotBetween(String value1, String value2) {
            addCriterion("t_remark not between", value1, value2, "tRemark");
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