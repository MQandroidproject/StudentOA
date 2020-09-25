package com.ddedu.service;

import com.ddedu.entity.Exercises;

import java.util.List;

/**
 * @Classname ExercisesService
 * @Description TODO
 * @Author Woods-sen
 * @Company XX公司
 * @CreateDate 2020-09-01 20:31
 */
public interface ExercisesService {
    void addExercises(Exercises exercises);

    List<Exercises> selectExercises(Integer page, Integer limit);

    void deleteByEid(Integer id);
}
