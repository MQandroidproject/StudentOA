package com.ddedu.dao;

import com.ddedu.entity.Staff;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;

public interface LoginDao {
    public User login(String no);
    public Staff findByNo(String u_no);
    public Student findByNoStu(String u_no);
}
