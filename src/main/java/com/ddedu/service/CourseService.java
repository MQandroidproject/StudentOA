package com.ddedu.service;

import com.ddedu.entity.Course;

import java.util.List;

public interface CourseService {
    public void addCourse(Course course);

    public List<Course> selectAll();

    public void update(Course course);
    public  void delete(Integer id);
}
