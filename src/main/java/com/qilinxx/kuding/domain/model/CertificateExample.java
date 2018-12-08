package com.qilinxx.kuding.domain.model;

import java.util.ArrayList;
import java.util.List;

public class CertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCFontStyleIsNull() {
            addCriterion("c_font_style is null");
            return (Criteria) this;
        }

        public Criteria andCFontStyleIsNotNull() {
            addCriterion("c_font_style is not null");
            return (Criteria) this;
        }

        public Criteria andCFontStyleEqualTo(String value) {
            addCriterion("c_font_style =", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleNotEqualTo(String value) {
            addCriterion("c_font_style <>", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleGreaterThan(String value) {
            addCriterion("c_font_style >", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleGreaterThanOrEqualTo(String value) {
            addCriterion("c_font_style >=", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleLessThan(String value) {
            addCriterion("c_font_style <", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleLessThanOrEqualTo(String value) {
            addCriterion("c_font_style <=", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleLike(String value) {
            addCriterion("c_font_style like", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleNotLike(String value) {
            addCriterion("c_font_style not like", value, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleIn(List<String> values) {
            addCriterion("c_font_style in", values, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleNotIn(List<String> values) {
            addCriterion("c_font_style not in", values, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleBetween(String value1, String value2) {
            addCriterion("c_font_style between", value1, value2, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCFontStyleNotBetween(String value1, String value2) {
            addCriterion("c_font_style not between", value1, value2, "cFontStyle");
            return (Criteria) this;
        }

        public Criteria andCCerUrlIsNull() {
            addCriterion("c_cer_url is null");
            return (Criteria) this;
        }

        public Criteria andCCerUrlIsNotNull() {
            addCriterion("c_cer_url is not null");
            return (Criteria) this;
        }

        public Criteria andCCerUrlEqualTo(String value) {
            addCriterion("c_cer_url =", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlNotEqualTo(String value) {
            addCriterion("c_cer_url <>", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlGreaterThan(String value) {
            addCriterion("c_cer_url >", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_cer_url >=", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlLessThan(String value) {
            addCriterion("c_cer_url <", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlLessThanOrEqualTo(String value) {
            addCriterion("c_cer_url <=", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlLike(String value) {
            addCriterion("c_cer_url like", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlNotLike(String value) {
            addCriterion("c_cer_url not like", value, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlIn(List<String> values) {
            addCriterion("c_cer_url in", values, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlNotIn(List<String> values) {
            addCriterion("c_cer_url not in", values, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlBetween(String value1, String value2) {
            addCriterion("c_cer_url between", value1, value2, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCerUrlNotBetween(String value1, String value2) {
            addCriterion("c_cer_url not between", value1, value2, "cCerUrl");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Long value) {
            addCriterion("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Long value) {
            addCriterion("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Long value) {
            addCriterion("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Long value) {
            addCriterion("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Long> values) {
            addCriterion("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Long> values) {
            addCriterion("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Long value1, Long value2) {
            addCriterion("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("c_create_time not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoIsNull() {
            addCriterion("c_certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoIsNotNull() {
            addCriterion("c_certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoEqualTo(String value) {
            addCriterion("c_certificate_no =", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoNotEqualTo(String value) {
            addCriterion("c_certificate_no <>", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoGreaterThan(String value) {
            addCriterion("c_certificate_no >", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_certificate_no >=", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoLessThan(String value) {
            addCriterion("c_certificate_no <", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("c_certificate_no <=", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoLike(String value) {
            addCriterion("c_certificate_no like", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoNotLike(String value) {
            addCriterion("c_certificate_no not like", value, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoIn(List<String> values) {
            addCriterion("c_certificate_no in", values, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoNotIn(List<String> values) {
            addCriterion("c_certificate_no not in", values, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoBetween(String value1, String value2) {
            addCriterion("c_certificate_no between", value1, value2, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCCertificateNoNotBetween(String value1, String value2) {
            addCriterion("c_certificate_no not between", value1, value2, "cCertificateNo");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNull() {
            addCriterion("c_remark is null");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNotNull() {
            addCriterion("c_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCRemarkEqualTo(String value) {
            addCriterion("c_remark =", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotEqualTo(String value) {
            addCriterion("c_remark <>", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThan(String value) {
            addCriterion("c_remark >", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("c_remark >=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThan(String value) {
            addCriterion("c_remark <", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThanOrEqualTo(String value) {
            addCriterion("c_remark <=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLike(String value) {
            addCriterion("c_remark like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotLike(String value) {
            addCriterion("c_remark not like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkIn(List<String> values) {
            addCriterion("c_remark in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotIn(List<String> values) {
            addCriterion("c_remark not in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkBetween(String value1, String value2) {
            addCriterion("c_remark between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotBetween(String value1, String value2) {
            addCriterion("c_remark not between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCNameUrlIsNull() {
            addCriterion("c_name_url is null");
            return (Criteria) this;
        }

        public Criteria andCNameUrlIsNotNull() {
            addCriterion("c_name_url is not null");
            return (Criteria) this;
        }

        public Criteria andCNameUrlEqualTo(String value) {
            addCriterion("c_name_url =", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlNotEqualTo(String value) {
            addCriterion("c_name_url <>", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlGreaterThan(String value) {
            addCriterion("c_name_url >", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_name_url >=", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlLessThan(String value) {
            addCriterion("c_name_url <", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlLessThanOrEqualTo(String value) {
            addCriterion("c_name_url <=", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlLike(String value) {
            addCriterion("c_name_url like", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlNotLike(String value) {
            addCriterion("c_name_url not like", value, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlIn(List<String> values) {
            addCriterion("c_name_url in", values, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlNotIn(List<String> values) {
            addCriterion("c_name_url not in", values, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlBetween(String value1, String value2) {
            addCriterion("c_name_url between", value1, value2, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCNameUrlNotBetween(String value1, String value2) {
            addCriterion("c_name_url not between", value1, value2, "cNameUrl");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("c_state is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("c_state is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(Integer value) {
            addCriterion("c_state =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(Integer value) {
            addCriterion("c_state <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(Integer value) {
            addCriterion("c_state >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_state >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(Integer value) {
            addCriterion("c_state <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(Integer value) {
            addCriterion("c_state <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<Integer> values) {
            addCriterion("c_state in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<Integer> values) {
            addCriterion("c_state not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(Integer value1, Integer value2) {
            addCriterion("c_state between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(Integer value1, Integer value2) {
            addCriterion("c_state not between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCDesIsNull() {
            addCriterion("c_des is null");
            return (Criteria) this;
        }

        public Criteria andCDesIsNotNull() {
            addCriterion("c_des is not null");
            return (Criteria) this;
        }

        public Criteria andCDesEqualTo(String value) {
            addCriterion("c_des =", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesNotEqualTo(String value) {
            addCriterion("c_des <>", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesGreaterThan(String value) {
            addCriterion("c_des >", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesGreaterThanOrEqualTo(String value) {
            addCriterion("c_des >=", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesLessThan(String value) {
            addCriterion("c_des <", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesLessThanOrEqualTo(String value) {
            addCriterion("c_des <=", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesLike(String value) {
            addCriterion("c_des like", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesNotLike(String value) {
            addCriterion("c_des not like", value, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesIn(List<String> values) {
            addCriterion("c_des in", values, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesNotIn(List<String> values) {
            addCriterion("c_des not in", values, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesBetween(String value1, String value2) {
            addCriterion("c_des between", value1, value2, "cDes");
            return (Criteria) this;
        }

        public Criteria andCDesNotBetween(String value1, String value2) {
            addCriterion("c_des not between", value1, value2, "cDes");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNull() {
            addCriterion("c_phone is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneIsNotNull() {
            addCriterion("c_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneEqualTo(String value) {
            addCriterion("c_phone =", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotEqualTo(String value) {
            addCriterion("c_phone <>", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThan(String value) {
            addCriterion("c_phone >", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_phone >=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThan(String value) {
            addCriterion("c_phone <", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLessThanOrEqualTo(String value) {
            addCriterion("c_phone <=", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneLike(String value) {
            addCriterion("c_phone like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotLike(String value) {
            addCriterion("c_phone not like", value, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneIn(List<String> values) {
            addCriterion("c_phone in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotIn(List<String> values) {
            addCriterion("c_phone not in", values, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneBetween(String value1, String value2) {
            addCriterion("c_phone between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCPhoneNotBetween(String value1, String value2) {
            addCriterion("c_phone not between", value1, value2, "cPhone");
            return (Criteria) this;
        }

        public Criteria andCQqIsNull() {
            addCriterion("c_qq is null");
            return (Criteria) this;
        }

        public Criteria andCQqIsNotNull() {
            addCriterion("c_qq is not null");
            return (Criteria) this;
        }

        public Criteria andCQqEqualTo(String value) {
            addCriterion("c_qq =", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotEqualTo(String value) {
            addCriterion("c_qq <>", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqGreaterThan(String value) {
            addCriterion("c_qq >", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqGreaterThanOrEqualTo(String value) {
            addCriterion("c_qq >=", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLessThan(String value) {
            addCriterion("c_qq <", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLessThanOrEqualTo(String value) {
            addCriterion("c_qq <=", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqLike(String value) {
            addCriterion("c_qq like", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotLike(String value) {
            addCriterion("c_qq not like", value, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqIn(List<String> values) {
            addCriterion("c_qq in", values, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotIn(List<String> values) {
            addCriterion("c_qq not in", values, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqBetween(String value1, String value2) {
            addCriterion("c_qq between", value1, value2, "cQq");
            return (Criteria) this;
        }

        public Criteria andCQqNotBetween(String value1, String value2) {
            addCriterion("c_qq not between", value1, value2, "cQq");
            return (Criteria) this;
        }

        public Criteria andCFromIsNull() {
            addCriterion("c_from is null");
            return (Criteria) this;
        }

        public Criteria andCFromIsNotNull() {
            addCriterion("c_from is not null");
            return (Criteria) this;
        }

        public Criteria andCFromEqualTo(String value) {
            addCriterion("c_from =", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromNotEqualTo(String value) {
            addCriterion("c_from <>", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromGreaterThan(String value) {
            addCriterion("c_from >", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromGreaterThanOrEqualTo(String value) {
            addCriterion("c_from >=", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromLessThan(String value) {
            addCriterion("c_from <", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromLessThanOrEqualTo(String value) {
            addCriterion("c_from <=", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromLike(String value) {
            addCriterion("c_from like", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromNotLike(String value) {
            addCriterion("c_from not like", value, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromIn(List<String> values) {
            addCriterion("c_from in", values, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromNotIn(List<String> values) {
            addCriterion("c_from not in", values, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromBetween(String value1, String value2) {
            addCriterion("c_from between", value1, value2, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCFromNotBetween(String value1, String value2) {
            addCriterion("c_from not between", value1, value2, "cFrom");
            return (Criteria) this;
        }

        public Criteria andCWechatIsNull() {
            addCriterion("c_wechat is null");
            return (Criteria) this;
        }

        public Criteria andCWechatIsNotNull() {
            addCriterion("c_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andCWechatEqualTo(String value) {
            addCriterion("c_wechat =", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatNotEqualTo(String value) {
            addCriterion("c_wechat <>", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatGreaterThan(String value) {
            addCriterion("c_wechat >", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatGreaterThanOrEqualTo(String value) {
            addCriterion("c_wechat >=", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatLessThan(String value) {
            addCriterion("c_wechat <", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatLessThanOrEqualTo(String value) {
            addCriterion("c_wechat <=", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatLike(String value) {
            addCriterion("c_wechat like", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatNotLike(String value) {
            addCriterion("c_wechat not like", value, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatIn(List<String> values) {
            addCriterion("c_wechat in", values, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatNotIn(List<String> values) {
            addCriterion("c_wechat not in", values, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatBetween(String value1, String value2) {
            addCriterion("c_wechat between", value1, value2, "cWechat");
            return (Criteria) this;
        }

        public Criteria andCWechatNotBetween(String value1, String value2) {
            addCriterion("c_wechat not between", value1, value2, "cWechat");
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