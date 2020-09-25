package com.ddedu.service.impl;

import com.ddedu.dao.ExercisesDao;
import com.ddedu.entity.Exercises;
import com.ddedu.service.ExercisesService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ExercisesServiceImpl
 * @Description TODO
 * @Author Woods-sen
 * @Company XX公司
 * @CreateDate 2020-09-01 20:31
 */
@Service
public class ExercisesServiceImpl implements ExercisesService {
    @Autowired
    private ExercisesDao exercisesDao;

    @Override
    public void addExercises(Exercises exercises) {
        exercisesDao.addExercises(exercises);
    }

    @Override
    public List<Exercises> selectExercises(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        return exercisesDao.selectExercises();
    }

    @Override
    public void deleteByEid(Integer id) {
        if (id == null) {
            throw new RuntimeException("id为null");
        }
        exercisesDao.deleteByEid(id);

    }
}
