package com.ddedu.entity;

import java.util.Date;

public class Grade {
    private Integer id;
    private String u_no;
    private String name;
    private Date createtime;
    private int flag;
    private int week;
    private String location;

    public Grade() {
    }

    public Grade(Integer id, String u_no, String name, Date createtime, int flag, int week, String location) {
        this.id = id;
        this.u_no = u_no;
        this.name = name;
        this.createtime = createtime;
        this.flag = flag;
        this.week = week;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Grade{" +
                  "id=" + id +
                  ", u_no='" + u_no + '\'' +
                  ", name='" + name + '\'' +
                  ", createtime=" + createtime +
                  ", flag=" + flag +
                  ", week=" + week +
                  ", location='" + location + '\'' +
                  '}';
    }
}
