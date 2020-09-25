package com.ddedu.dao;

import com.ddedu.entity.Grade;

import java.util.List;

public interface GradeDao {
    void insertGrade(Grade grade);  // 添加一个新开的班级
    List<Grade> selectGradeAll();   // 展示班级列表
    void deleteGradeById(int id);   // 删除班级
    void updateGrade(Grade grade);  // 修改班级信息
}
