package com.qilinxx.kuding.domain.model;

import javax.persistence.*;

@Table(name = "web_grant")
public class Grant {
    @Id
    private String gId;

    @Column(name = "g_record")
    private String gRecord;

    @Column(name = "g_time")
    private Long gTime;

    @Column(name = "g_url")
    private String gUrl;

    @Column(name = "g_remark")
    private String gRemark;

    @Column(name = "g_did_id")
    private String gDidId;

    @Column(name = "g_sid_id")
    private String gSidId;

    @Column(name = "g_tid_id")
    private String gTidId;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId == null ? null : gId.trim();
    }

    public String getgRecord() {
        return gRecord;
    }

    public void setgRecord(String gRecord) {
        this.gRecord = gRecord == null ? null : gRecord.trim();
    }

    public Long getgTime() {
        return gTime;
    }

    public void setgTime(Long gTime) {
        this.gTime = gTime;
    }

    public String getgUrl() {
        return gUrl;
    }

    public void setgUrl(String gUrl) {
        this.gUrl = gUrl == null ? null : gUrl.trim();
    }

    public String getgRemark() {
        return gRemark;
    }

    public void setgRemark(String gRemark) {
        this.gRemark = gRemark == null ? null : gRemark.trim();
    }

    public String getgDidId() {
        return gDidId;
    }

    public void setgDidId(String gDidId) {
        this.gDidId = gDidId == null ? null : gDidId.trim();
    }

    public String getgSidId() {
        return gSidId;
    }

    public void setgSidId(String gSidId) {
        this.gSidId = gSidId == null ? null : gSidId.trim();
    }

    public String getgTidId() {
        return gTidId;
    }

    public void setgTidId(String gTidId) {
        this.gTidId = gTidId == null ? null : gTidId.trim();
    }
}