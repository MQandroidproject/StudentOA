package com.ddedu.entity;

public class User {
    private int id;
    private String no;
    private String password;
    private int role;
    private int flag;
    private String status;
    private int identity;

    public int getIdentity () {
        return identity;
    }

    public void setIdentity (int identity) {
        this.identity = identity;
    }


    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", flag=" + flag +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNo () {
        return no;
    }

    public void setNo (String no) {
        this.no = no;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public int getRole () {
        return role;
    }

    public void setRole (int role) {
        this.role = role;
    }

    public int getFlag () {
        return flag;
    }

    public void setFlag (int flag) {
        this.flag = flag;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    public User () {
    }

    public User (int id, String no, String password, int role, int flag, String status) {
        this.id = id;
        this.no = no;
        this.password = password;
        this.role = role;
        this.flag = flag;
        this.status = status;
    }
}
