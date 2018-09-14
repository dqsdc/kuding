package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_detail")
public class Detail {
    @Id
    private String dId;

    @Column(name = "d_name")
    private String dName;

    @Column(name = "d_number")
    private Integer dNumber;

    @Column(name = "d_time_length")
    private Integer dTimeLength;

    @Column(name = "d_detail")
    private String dDetail;

    @Column(name = "d_create_time")
    private Long dCreateTime;

    @Column(name = "d_remark")
    private String dRemark;

    @Column(name = "d_cid_id")
    private String dCidId;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Integer getdNumber() {
        return dNumber;
    }

    public void setdNumber(Integer dNumber) {
        this.dNumber = dNumber;
    }

    public Integer getdTimeLength() {
        return dTimeLength;
    }

    public void setdTimeLength(Integer dTimeLength) {
        this.dTimeLength = dTimeLength;
    }

    public String getdDetail() {
        return dDetail;
    }

    public void setdDetail(String dDetail) {
        this.dDetail = dDetail == null ? null : dDetail.trim();
    }

    public Long getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Long dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public String getdRemark() {
        return dRemark;
    }

    public void setdRemark(String dRemark) {
        this.dRemark = dRemark == null ? null : dRemark.trim();
    }

    public String getdCidId() {
        return dCidId;
    }

    public void setdCidId(String dCidId) {
        this.dCidId = dCidId == null ? null : dCidId.trim();
    }

    @Override
    public String toString() {
        return "Detail{" +
                "dId='" + dId + '\'' +
                ", dName='" + dName + '\'' +
                ", dNumber=" + dNumber +
                ", dTimeLength=" + dTimeLength +
                ", dDetail='" + dDetail + '\'' +
                ", dCreateTime=" + dCreateTime +
                ", dRemark='" + dRemark + '\'' +
                ", dCidId='" + dCidId + '\'' +
                '}';
    }
}