package com.ddedu.service.impl;

import com.ddedu.dao.UserDao;
import com.ddedu.entity.Student;
import com.ddedu.service.UserService;
import com.ddedu.vo.Sex;
import com.ddedu.vo.VoStudent;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo on 2020/9/1 15:29
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String selectNameByNo(String no) {
        return userDao.selectNameByNo(no);
    }

    @Override
    public VoStudent selectStudentByNo(String no) {
        return userDao.selectStudentByNo(no);
    }

    @Override
    public Student selectStudentByNo2(String no) {
        return userDao.selectStudentByNo2(no);
    }

    @Override
    public List<Student> selectStudentByCno(String cno, Integer page, Integer limit) {
        //        设置页码和每页显示的记录数，该语句后面一定要紧跟着数据库查询相关语句
        PageHelper.startPage(page, limit);
        return userDao.selectStudentByCno(cno);
    }

    @Override
    public List<Sex> sexScale(String cno) {
        return userDao.sexScale(cno);
    }


}
