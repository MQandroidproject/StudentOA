package com.ddedu.dao;

import com.ddedu.dto.StudentGrade;
import com.ddedu.entity.Student;

import java.util.List;

public interface StudentDao {
    void insertStudentOne(Student student); // 添加学生信息
    int selectIdByName(String name); // 根据name查询学生的id
    List<StudentGrade> selectStuAndGrade();  // 班级和人数的图表
}
