package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_course")
public class Course {
    @Id
    private String cId;

    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_create_time")
    private Long cCreateTime;

    @Column(name = "c_detail")
    private String cDetail;

    @Column(name = "c_count")
    private Integer cCount;

    @Column(name = "c_remark")
    private String cRemark;

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

    public Long getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Long cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getcDetail() {
        return cDetail;
    }

    public void setcDetail(String cDetail) {
        this.cDetail = cDetail == null ? null : cDetail.trim();
    }

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cCreateTime=" + cCreateTime +
                ", cDetail='" + cDetail + '\'' +
                ", cCount=" + cCount +
                ", cRemark='" + cRemark + '\'' +
                '}';
    }
}