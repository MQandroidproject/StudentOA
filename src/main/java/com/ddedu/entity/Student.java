package com.ddedu.entity;

import java.util.Date;

public class Student {
    private Integer id;
    private String u_no;
    private String name;
    private String sex;
    private Date birthday;
    private String cardno;
    private String schoolname;
    private String education;
    private String phone;
    private String email;
    private String qq;
    private String cno;
    private String introno;
    private Integer flag;
    private Date entrytime;
    private String g_name;

    public Student() {
    }

    public Student(Integer id, String u_no, String name, String sex, Date birthday, String cardno, String schoolname, String education, String phone, String email, String qq, String cno, String introno, Integer flag, Date entrytime, String g_name) {
        this.id = id;
        this.u_no = u_no;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.cardno = cardno;
        this.schoolname = schoolname;
        this.education = education;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
        this.cno = cno;
        this.introno = introno;
        this.flag = flag;
        this.entrytime = entrytime;
        this.g_name = g_name;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getIntrono() {
        return introno;
    }

    public void setIntrono(String introno) {
        this.introno = introno;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                  "id=" + id +
                  ", u_no='" + u_no + '\'' +
                  ", name='" + name + '\'' +
                  ", sex='" + sex + '\'' +
                  ", birthday=" + birthday +
                  ", cardno='" + cardno + '\'' +
                  ", schoolname='" + schoolname + '\'' +
                  ", education='" + education + '\'' +
                  ", phone='" + phone + '\'' +
                  ", email='" + email + '\'' +
                  ", qq='" + qq + '\'' +
                  ", cno='" + cno + '\'' +
                  ", introno='" + introno + '\'' +
                  ", flag=" + flag +
                  ", entrytime=" + entrytime +
                  ", g_name='" + g_name + '\'' +
                  '}';
    }
}