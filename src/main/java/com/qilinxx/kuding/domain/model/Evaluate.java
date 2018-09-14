package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_evaluate")
public class Evaluate {
    @Id
    private String eId;

    @Column(name = "e_ttos_evaluate")
    private String eTtosEvaluate;

    @Column(name = "e_stot_evaluate")
    private String eStotEvaluate;

    @Column(name = "e_ttos_score")
    private Integer eTtosScore;

    @Column(name = "e_stot_score")
    private Integer eStotScore;

    @Column(name = "e_remark")
    private String eRemark;

    @Column(name = "e_create_time")
    private Long eCreateTime;

    @Column(name = "e_did_id")
    private String eDidId;

    @Column(name = "e_sid_id")
    private String eSidId;

    @Column(name = "e_tid_id")
    private String eTidId;

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId == null ? null : eId.trim();
    }

    public String geteTtosEvaluate() {
        return eTtosEvaluate;
    }

    public void seteTtosEvaluate(String eTtosEvaluate) {
        this.eTtosEvaluate = eTtosEvaluate == null ? null : eTtosEvaluate.trim();
    }

    public String geteStotEvaluate() {
        return eStotEvaluate;
    }

    public void seteStotEvaluate(String eStotEvaluate) {
        this.eStotEvaluate = eStotEvaluate == null ? null : eStotEvaluate.trim();
    }

    public Integer geteTtosScore() {
        return eTtosScore;
    }

    public void seteTtosScore(Integer eTtosScore) {
        this.eTtosScore = eTtosScore;
    }

    public Integer geteStotScore() {
        return eStotScore;
    }

    public void seteStotScore(Integer eStotScore) {
        this.eStotScore = eStotScore;
    }

    public String geteRemark() {
        return eRemark;
    }

    public void seteRemark(String eRemark) {
        this.eRemark = eRemark == null ? null : eRemark.trim();
    }

    public Long geteCreateTime() {
        return eCreateTime;
    }

    public void seteCreateTime(Long eCreateTime) {
        this.eCreateTime = eCreateTime;
    }

    public String geteDidId() {
        return eDidId;
    }

    public void seteDidId(String eDidId) {
        this.eDidId = eDidId == null ? null : eDidId.trim();
    }

    public String geteSidId() {
        return eSidId;
    }

    public void seteSidId(String eSidId) {
        this.eSidId = eSidId == null ? null : eSidId.trim();
    }

    public String geteTidId() {
        return eTidId;
    }

    public void seteTidId(String eTidId) {
        this.eTidId = eTidId == null ? null : eTidId.trim();
    }
}