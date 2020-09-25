package com.ddedu.service.impl;

import com.ddedu.dao.GradeDao;
import com.ddedu.entity.Grade;
import com.ddedu.service.GradeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeDao gradeDao;

    /**
     * 添加一个新班的数据
     * @param grade 页面传来的班级数据
     */
    @Override
    public void insertGrade(Grade grade) {
        if (grade == null) {
            throw new RuntimeException("输入错误！");
        }
        gradeDao.insertGrade(grade);
    }

    /**
     * 展示班级列表
     * @return 所有的班级信息
     */
    @Override
    public List<Grade> selectGradeAll(Integer page, Integer limit) {

        //        设置页码和每页显示的记录数，该语句后面一定要紧跟着数据库查询相关语句
        PageHelper.startPage(page, limit);
        List<Grade> grades = gradeDao.selectGradeAll();
        return grades;
    }

    /**
     * 根据id删除班级
     * @param id 页面选中的id
     */
    @Override
    public void deleteGradeById(int id) {
        gradeDao.deleteGradeById(id);
    }

    /**
     * 修改班级信息
     * @param grade 页面传来的班级信息
     */
    @Override
    public void updateGrade(Grade grade) {
        if (grade.getId() == null) {
            throw new RuntimeException("数据异常！");
        }
        gradeDao.updateGrade(grade);
    }

    /**
     * 添加学生信息时用来展示班级的下拉列表
     */
    @Override
    public List<Grade> selectGrade() {
        List<Grade> grades = gradeDao.selectGradeAll();
        return grades;
    }
}
