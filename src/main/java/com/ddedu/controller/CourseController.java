package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Course;
import com.ddedu.service.CourseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @ResponseBody
    @RequestMapping("/addCourse.do")
    public JsonResult addCourse(String name, Date createtime, Integer week) {
        System.out.println("???" + name + createtime + week);
        Course course = new Course();
        course.setName(name);
        course.setCreatetime(createtime);
        course.setWeek(week);
        System.out.println(course);

        courseService.addCourse(course);
        return new JsonResult(1, null);
    }


    @RequestMapping("/coursepage.do")
    @ResponseBody
    public Map<String, Object> selectAll(Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, limit);

        List<Course> list = courseService.selectAll();
        long total = ((Page) list).getTotal();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }


    @RequestMapping("/courseupdate.do")
    @ResponseBody
    public JsonResult update(Integer id, String name, Date createtime,Integer week){
        System.out.println("??"+id+name+createtime+week);
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setCreatetime(createtime);
        course.setWeek(week);
        courseService.update(course);
        return new JsonResult(1,"OK");
    }

    @RequestMapping("/coursedelete.do")
    @ResponseBody
    public JsonResult delete(Integer id) {
        courseService.delete(id);
        return new JsonResult(1000, null);
    }

}
