package com.ddedu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public class AskForLeave {
    private Integer id;
    private Integer sid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    private int count;
    private String status;
    private String reason;

    public AskForLeave() {
    }

    public AskForLeave(Integer id, Integer sid, Date startTime, Date endTime, int count, String status, String reason) {
        this.id = id;
        this.sid = sid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.count = count;
        this.status = status;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "AskForLeave{" +
                  "id=" + id +
                  ", sid=" + sid +
                  ", startTime=" + startTime +
                  ", endTime=" + endTime +
                  ", count=" + count +
                  ", status='" + status + '\'' +
                  ", reason='" + reason + '\'' +
                  '}';
    }
}
