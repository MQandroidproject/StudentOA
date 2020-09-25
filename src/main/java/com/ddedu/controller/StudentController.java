package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Grade;
import com.ddedu.entity.Student;
import com.ddedu.service.GradeService;
import com.ddedu.service.StudentService;
import com.ddedu.vo.StudentEcharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private GradeService gradeService;   // 用来展示班级的下拉列表
    /**
     * 添加一个学生的数据
     * @param student 页面获取的学生信息
     * @return 成功 返回json数据 code ==> 1      失败 返回json数据 code ==> 0
     */
    @RequestMapping("/insertStudent.do")
    @ResponseBody
    public JsonResult insertStudent(Student student) {
        studentService.insertStudentOne(student);
        return new JsonResult(1,"添加成功！");
    }

    /**
     * 用来展示添加学生信息时的班级下拉列表
     * @return 班级名
     */
    @RequestMapping("/selectGrade.do")
    @ResponseBody
    public JsonResult selectGrade() {
        List<Grade> grades = gradeService.selectGrade();
        return new JsonResult(1, grades);
    }

    @RequestMapping("/selectStuGrade.do")
    @ResponseBody
    public StudentEcharts selectStuGrade() {
        StudentEcharts studentEcharts = studentService.selectStuAndGrade();
        System.out.println("1231232213213 ++++++" + studentEcharts);
        //TODO  BUG 待完成
        return studentEcharts;
    }
}
