package com.ddedu.dao;

import com.ddedu.entity.Course;

import java.util.List;

public interface CourseDao {
    public void addCourse(Course course);
    public List<Course> selectAll();

    public  void update(Course course);
    public  void delete(Integer id);

}
