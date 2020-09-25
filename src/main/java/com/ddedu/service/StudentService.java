package com.ddedu.service;

import com.ddedu.dto.StudentGrade;
import com.ddedu.entity.Student;
import com.ddedu.vo.StudentEcharts;

import java.util.List;

public interface StudentService {
    void insertStudentOne(Student student); // 添加学生信息
    int selectIdByName(String name); // 根据name查询学生的i
    StudentEcharts selectStuAndGrade();  // 班级和人数的图表
}
