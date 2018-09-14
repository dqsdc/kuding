package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_teacher")
public class Teacher {
    @Id
    private String tId;

    @Column(name = "t_account")
    private String tAccount;

    @Column(name = "t_password")
    private String tPassword;

    @Column(name = "t_name")
    private String tName;

    @Column(name = "t_age")
    private Integer tAge;

    @Column(name = "t_sex")
    private Boolean tSex;

    @Column(name = "t_state")
    private Boolean tState;

    @Column(name = "t_create_time")
    private Long tCreateTime;

    @Column(name = "t_degree")
    private String tDegree;

    @Column(name = "t_detail")
    private String tDetail;

    @Column(name = "t_head_image")
    private String tHeadImage;

    @Column(name = "t_remark")
    private String tRemark;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettAccount() {
        return tAccount;
    }

    public void settAccount(String tAccount) {
        this.tAccount = tAccount;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public Boolean gettSex() {
        return tSex;
    }

    public void settSex(Boolean tSex) {
        this.tSex = tSex;
    }

    public Boolean gettState() {
        return tState;
    }

    public void settState(Boolean tState) {
        this.tState = tState;
    }

    public Long gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Long tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public String gettDegree() {
        return tDegree;
    }

    public void settDegree(String tDegree) {
        this.tDegree = tDegree == null ? null : tDegree.trim();
    }

    public String gettDetail() {
        return tDetail;
    }

    public void settDetail(String tDetail) {
        this.tDetail = tDetail == null ? null : tDetail.trim();
    }

    public String gettHeadImage() {
        return tHeadImage;
    }

    public void settHeadImage(String tHeadImage) {
        this.tHeadImage = tHeadImage == null ? null : tHeadImage.trim();
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark == null ? null : tRemark.trim();
    }
}