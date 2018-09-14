package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_student")
public class Student {
    @Id
    private String sId;

    @Column(name = "s_account")
    private String sAccount;

    @Column(name = "s_password")
    private String sPassword;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_sex")
    private Boolean sSex;

    @Column(name = "s_state")
    private Boolean sState;

    @Column(name = "s_create_time")
    private Long sCreateTime;

    @Column(name = "s_grade")
    private String sGrade;

    @Column(name = "s_head_image")
    private String sHeadImage;

    @Column(name = "s_remark")
    private String sRemark;

    @Column(name = "s_email")
    private String sEmail;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Boolean getsSex() {
        return sSex;
    }

    public void setsSex(Boolean sSex) {
        this.sSex = sSex;
    }

    public Boolean getsState() {
        return sState;
    }

    public void setsState(Boolean sState) {
        this.sState = sState;
    }

    public Long getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(Long sCreateTime) {
        this.sCreateTime = sCreateTime;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade == null ? null : sGrade.trim();
    }

    public String getsHeadImage() {
        return sHeadImage;
    }

    public void setsHeadImage(String sHeadImage) {
        this.sHeadImage = sHeadImage == null ? null : sHeadImage.trim();
    }

    public String getsRemark() {
        return sRemark;
    }

    public void setsRemark(String sRemark) {
        this.sRemark = sRemark == null ? null : sRemark.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sAccount=" + sAccount +
                ", sPassword='" + sPassword + '\'' +
                ", sName='" + sName + '\'' +
                ", sSex=" + sSex +
                ", sState=" + sState +
                ", sCreateTime=" + sCreateTime +
                ", sGrade='" + sGrade + '\'' +
                ", sHeadImage='" + sHeadImage + '\'' +
                ", sRemark='" + sRemark + '\'' +
                ", sEmail='" + sEmail + '\'' +
                '}';
    }
}