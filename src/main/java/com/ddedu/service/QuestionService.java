package com.ddedu.service;

import com.ddedu.entity.Question;
import com.ddedu.vo.QuestionCharts;

import java.util.List;

public interface QuestionService {
    void addQuestion (Question question);

    List<Question> findAll(Integer page, Integer limit);

    int findCount();

    void deleteById(Integer id);

    void updateById (Question question);

    void addNote(Question question);

    void addCode(Question question);

    QuestionCharts findCharts();

    List<Question> findExcel();

}
