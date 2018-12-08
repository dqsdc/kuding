package com.qilinxx.kuding.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "web_certificate")
public class Certificate {
    @Id
    private String cId;

    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_font_Style")
    private String cFontStyle;

    @Column(name = "c_cer_url")
    private String cCerUrl;

    @Column(name = "c_create_time")
    private Long cCreateTime;

    @Column(name = "c_certificate_no")
    private String cCertificateNo;

    @Column(name = "c_remark")
    private String cRemark;

    @Column(name = "c_name_url")
    private String cNameUrl;

    @Column(name = "c_state")
    private Integer cState;

    @Column(name = "c_des")
    private String cDes;

    @Column(name = "c_phone")
    private String cPhone;

    @Column(name = "c_qq")
    private String cQq;

    @Column(name = "c_from")
    private String cFrom;

    @Column(name = "c_wechat")
    private String cWechat;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcFontStyle() {
        return cFontStyle;
    }

    public void setcFontStyle(String cFontStyle) {
        this.cFontStyle = cFontStyle == null ? null : cFontStyle.trim();
    }

    public String getcCerUrl() {
        return cCerUrl;
    }

    public void setcCerUrl(String cCerUrl) {
        this.cCerUrl = cCerUrl == null ? null : cCerUrl.trim();
    }

    public Long getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Long cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getcCertificateNo() {
        return cCertificateNo;
    }

    public void setcCertificateNo(String cCertificateNo) {
        this.cCertificateNo = cCertificateNo == null ? null : cCertificateNo.trim();
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    public String getcNameUrl() {
        return cNameUrl;
    }

    public void setcNameUrl(String cNameUrl) {
        this.cNameUrl = cNameUrl == null ? null : cNameUrl.trim();
    }

    public Integer getcState() {
        return cState;
    }

    public void setcState(Integer cState) {
        this.cState = cState;
    }

    public String getcDes() {
        return cDes;
    }

    public void setcDes(String cDes) {
        this.cDes = cDes == null ? null : cDes.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcQq() {
        return cQq;
    }

    public void setcQq(String cQq) {
        this.cQq = cQq == null ? null : cQq.trim();
    }

    public String getcFrom() {
        return cFrom;
    }

    public void setcFrom(String cFrom) {
        this.cFrom = cFrom == null ? null : cFrom.trim();
    }

    public String getcWechat() {
        return cWechat;
    }

    public void setcWechat(String cWechat) {
        this.cWechat = cWechat == null ? null : cWechat.trim();
    }
}