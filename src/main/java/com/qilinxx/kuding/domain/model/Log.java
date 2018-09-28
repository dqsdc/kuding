package com.qilinxx.kuding.domain.model;

import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "web_logsheet")
public class Log {
    @Id
    private String lId;

    @Column(name = "l_action")
    private String lAction;

    @Column(name = "l_user_id")
    private String lUserId;

    @Column(name = "l_ip")
    private String lIp;

    @Column(name = "l_create_time")
    private Long lCreateTime;

    @Column(name = "l_state")
    private String lState;

    @Column(name = "l_remark")
    private String lRemark;

    @Column(name = "l_sid")
    private String lSid;

    @Column(name = "l_tid")
    private String lTid;

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public String getlAction() {
        return lAction;
    }

    public void setlAction(String lAction) {
        this.lAction = lAction == null ? null : lAction.trim();
    }

    public String getlUserId() {
        return lUserId;
    }

    public void setlUserId(String lUserId) {
        this.lUserId = lUserId == null ? null : lUserId.trim();
    }

    public String getlIp() {
        return lIp;
    }

    public void setlIp(String lIp) {
        this.lIp = lIp == null ? null : lIp.trim();
    }

    public Long getlCreateTime() {
        return lCreateTime;
    }

    public void setlCreateTime(Long lCreateTime) {
        this.lCreateTime = lCreateTime;
    }

    public String getlState() {
        return lState;
    }

    public void setlState(String lState) {
        this.lState = lState == null ? null : lState.trim();
    }

    public String getlRemark() {
        return lRemark;
    }

    public void setlRemark(String lRemark) {
        this.lRemark = lRemark == null ? null : lRemark.trim();
    }

    public String getlSid() {
        return lSid;
    }

    public void setlSid(String lSid) {
        this.lSid = lSid == null ? null : lSid.trim();
    }

    public String getlTid() {
        return lTid;
    }

    public void setlTid(String lTid) {
        this.lTid = lTid == null ? null : lTid.trim();
    }

    @Override
    public String toString() {
        return "Log{" +
                "lId='" + lId + '\'' +
                ", lAction='" + lAction + '\'' +
                ", lUserId='" + lUserId + '\'' +
                ", lIp='" + lIp + '\'' +
                ", lCreateTime=" + lCreateTime +
                ", lState='" + lState + '\'' +
                ", lRemark='" + lRemark + '\'' +
                ", lSid='" + lSid + '\'' +
                ", lTid='" + lTid + '\'' +
                '}';
    }
}