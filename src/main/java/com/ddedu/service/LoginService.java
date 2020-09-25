package com.ddedu.service;

import com.ddedu.entity.Staff;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;

public interface LoginService {
    public User login(String no,String pass);
    public Staff findByNo(String no);
    public Student findByNoStu(String no);
}
