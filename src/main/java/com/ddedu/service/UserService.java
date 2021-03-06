package com.ddedu.service;

import com.ddedu.entity.Student;
import com.ddedu.vo.Sex;
import com.ddedu.vo.VoStudent;

import java.util.List;

/**
 * @author lenovo on 2020/9/1 15:29
 */
public interface UserService {
    String selectNameByNo(String no);

    VoStudent selectStudentByNo(String no);

    Student selectStudentByNo2(String no);

    List<Student> selectStudentByCno(String cno, Integer page, Integer limit);

    //查询各班的男女比例人数
    List<Sex> sexScale(String cno);
}
