package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNull() {
            addCriterion("s_account is null");
            return (Criteria) this;
        }

        public Criteria andSAccountIsNotNull() {
            addCriterion("s_account is not null");
            return (Criteria) this;
        }

        public Criteria andSAccountEqualTo(Integer value) {
            addCriterion("s_account =", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotEqualTo(Integer value) {
            addCriterion("s_account <>", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThan(Integer value) {
            addCriterion("s_account >", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_account >=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThan(Integer value) {
            addCriterion("s_account <", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountLessThanOrEqualTo(Integer value) {
            addCriterion("s_account <=", value, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountIn(List<Integer> values) {
            addCriterion("s_account in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotIn(List<Integer> values) {
            addCriterion("s_account not in", values, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountBetween(Integer value1, Integer value2) {
            addCriterion("s_account between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("s_account not between", value1, value2, "sAccount");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("s_password =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("s_password >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("s_password <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("s_password like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("s_password not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("s_password in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(Boolean value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(Boolean value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(Boolean value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(Boolean value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(Boolean value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<Boolean> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<Boolean> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(Boolean value1, Boolean value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSStateIsNull() {
            addCriterion("s_state is null");
            return (Criteria) this;
        }

        public Criteria andSStateIsNotNull() {
            addCriterion("s_state is not null");
            return (Criteria) this;
        }

        public Criteria andSStateEqualTo(Boolean value) {
            addCriterion("s_state =", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotEqualTo(Boolean value) {
            addCriterion("s_state <>", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThan(Boolean value) {
            addCriterion("s_state >", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("s_state >=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThan(Boolean value) {
            addCriterion("s_state <", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThanOrEqualTo(Boolean value) {
            addCriterion("s_state <=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateIn(List<Boolean> values) {
            addCriterion("s_state in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotIn(List<Boolean> values) {
            addCriterion("s_state not in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateBetween(Boolean value1, Boolean value2) {
            addCriterion("s_state between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("s_state not between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNull() {
            addCriterion("s_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNotNull() {
            addCriterion("s_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeEqualTo(Long value) {
            addCriterion("s_create_time =", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotEqualTo(Long value) {
            addCriterion("s_create_time <>", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThan(Long value) {
            addCriterion("s_create_time >", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("s_create_time >=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThan(Long value) {
            addCriterion("s_create_time <", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("s_create_time <=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIn(List<Long> values) {
            addCriterion("s_create_time in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotIn(List<Long> values) {
            addCriterion("s_create_time not in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeBetween(Long value1, Long value2) {
            addCriterion("s_create_time between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("s_create_time not between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSGradeIsNull() {
            addCriterion("s_grade is null");
            return (Criteria) this;
        }

        public Criteria andSGradeIsNotNull() {
            addCriterion("s_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSGradeEqualTo(String value) {
            addCriterion("s_grade =", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotEqualTo(String value) {
            addCriterion("s_grade <>", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeGreaterThan(String value) {
            addCriterion("s_grade >", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeGreaterThanOrEqualTo(String value) {
            addCriterion("s_grade >=", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLessThan(String value) {
            addCriterion("s_grade <", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLessThanOrEqualTo(String value) {
            addCriterion("s_grade <=", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeLike(String value) {
            addCriterion("s_grade like", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotLike(String value) {
            addCriterion("s_grade not like", value, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeIn(List<String> values) {
            addCriterion("s_grade in", values, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotIn(List<String> values) {
            addCriterion("s_grade not in", values, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeBetween(String value1, String value2) {
            addCriterion("s_grade between", value1, value2, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSGradeNotBetween(String value1, String value2) {
            addCriterion("s_grade not between", value1, value2, "sGrade");
            return (Criteria) this;
        }

        public Criteria andSHeadImageIsNull() {
            addCriterion("s_head_image is null");
            return (Criteria) this;
        }

        public Criteria andSHeadImageIsNotNull() {
            addCriterion("s_head_image is not null");
            return (Criteria) this;
        }

        public Criteria andSHeadImageEqualTo(String value) {
            addCriterion("s_head_image =", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageNotEqualTo(String value) {
            addCriterion("s_head_image <>", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageGreaterThan(String value) {
            addCriterion("s_head_image >", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageGreaterThanOrEqualTo(String value) {
            addCriterion("s_head_image >=", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageLessThan(String value) {
            addCriterion("s_head_image <", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageLessThanOrEqualTo(String value) {
            addCriterion("s_head_image <=", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageLike(String value) {
            addCriterion("s_head_image like", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageNotLike(String value) {
            addCriterion("s_head_image not like", value, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageIn(List<String> values) {
            addCriterion("s_head_image in", values, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageNotIn(List<String> values) {
            addCriterion("s_head_image not in", values, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageBetween(String value1, String value2) {
            addCriterion("s_head_image between", value1, value2, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSHeadImageNotBetween(String value1, String value2) {
            addCriterion("s_head_image not between", value1, value2, "sHeadImage");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNull() {
            addCriterion("s_remark is null");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNotNull() {
            addCriterion("s_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSRemarkEqualTo(String value) {
            addCriterion("s_remark =", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotEqualTo(String value) {
            addCriterion("s_remark <>", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThan(String value) {
            addCriterion("s_remark >", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("s_remark >=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThan(String value) {
            addCriterion("s_remark <", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThanOrEqualTo(String value) {
            addCriterion("s_remark <=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLike(String value) {
            addCriterion("s_remark like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotLike(String value) {
            addCriterion("s_remark not like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkIn(List<String> values) {
            addCriterion("s_remark in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotIn(List<String> values) {
            addCriterion("s_remark not in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkBetween(String value1, String value2) {
            addCriterion("s_remark between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotBetween(String value1, String value2) {
            addCriterion("s_remark not between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
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