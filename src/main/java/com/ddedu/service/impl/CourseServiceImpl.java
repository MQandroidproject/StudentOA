package com.ddedu.service.impl;


import com.ddedu.dao.CourseDao;
import com.ddedu.entity.Course;
import com.ddedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public List<Course> selectAll() {
        return courseDao.selectAll();
    }

    @Override
    public void update(Course course) {

        courseDao.update(course);
    }

    @Override
    public void delete(Integer id) {
        courseDao.delete(id);
    }
}
