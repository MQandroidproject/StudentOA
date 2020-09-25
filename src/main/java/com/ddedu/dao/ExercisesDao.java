package com.ddedu.dao;

import com.ddedu.entity.Exercises;

import java.util.List;

/**
 * @Classname ExercisesDao
 * @Description TODO
 * @Author Woods-sen
 * @Company XX公司
 * @CreateDate 2020-09-01 20:30
 */
public interface ExercisesDao {
    void addExercises(Exercises exercises);
    List<Exercises> selectExercises();

    void deleteByEid(Integer id);
}