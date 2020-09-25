package com.ddedu.vo;

/**
 * @author lenovo on 2020/9/1 16:09
 */
public class VoStudent {
    private String id;
    private String sname;
    private String cname;
    private String sex;
    private String birthday;
    private String email;
    private String phone;
    private String qq;
    private String schoolname;
    private String education;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
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

    @Override
    public String toString() {
        return "VoStudent{" +
                "id='" + id + '\'' +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
