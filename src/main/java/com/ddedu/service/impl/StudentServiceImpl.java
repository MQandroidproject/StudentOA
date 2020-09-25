package com.ddedu.service.impl;

import com.ddedu.dao.StudentDao;
import com.ddedu.dto.StudentGrade;
import com.ddedu.entity.Student;
import com.ddedu.service.StudentService;
import com.ddedu.vo.StudentEcharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 添加一条学生信息
     * @param student
     */
    @Override
    public void insertStudentOne(Student student) {
        if (student == null)  {
            throw new RuntimeException("信息为空！");
        }
        studentDao.insertStudentOne(student);
    }

    /**
     * 根据name查询学生的id
     * @param name name
     * @return 学生对应的id
     */
    @Override
    public int selectIdByName(String name) {
        if (name == null) {
            throw new RuntimeException("name 不能为空");
        }
        int id = studentDao.selectIdByName(name);
        return id;
    }

    /**
     * 班级 学生人数的图表
     * @return 两个集合
     */
    @Override
    public StudentEcharts selectStuAndGrade() {
        List<StudentGrade> list = studentDao.selectStuAndGrade();
        System.out.println("list =======================" + list.toString());
        StudentEcharts studentEcharts = new StudentEcharts();
        studentEcharts.setGrades(new ArrayList<>());
        studentEcharts.setCounts(new ArrayList<>());
        for(StudentGrade stu : list) {
            studentEcharts.getGrades().add(stu.getGrade());
            studentEcharts.getCounts().add(stu.getCount());
        }
        return studentEcharts;
    }
}
