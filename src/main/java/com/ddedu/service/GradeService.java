package com.ddedu.service;

import com.ddedu.entity.Grade;

import java.util.List;

public interface GradeService {
    void insertGrade(Grade grade);  // 添加一个新开的班级
    List<Grade> selectGradeAll(Integer page, Integer limit);   // 展示班级列表
    void deleteGradeById(int id);   // 删除班级
    void updateGrade(Grade grade);  // 修改班级信息
    List<Grade> selectGrade();  // 添加学生信息时用来展示班级的下拉列表
}
