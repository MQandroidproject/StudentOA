package com.ddedu.service.impl;

import com.ddedu.dao.LoginDao;
import com.ddedu.entity.Staff;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    public User login (String no, String pass) {
        User user = loginDao.login (no);
        if(user==null){
            throw new RuntimeException ("账号错误");
        }else if(!user.getPassword ().equals (pass)){
            throw new RuntimeException ("密码错误");
        }
        return user;
    }

    @Override
    public Staff findByNo (String no) {
        Staff sta = loginDao.findByNo (no);
        System.out.println (no);
        System.out.println (sta);
        return sta;
    }

    @Override
    public Student findByNoStu (String no) {
        Student stu = loginDao.findByNoStu (no);
        return stu;
    }
}
