package com.ddedu.dao;

import com.ddedu.entity.Question;
import com.ddedu.vo.QuestionDept;

import java.util.List;

public interface QuestionDao {
    void addQuestion (Question question);

    List<Question> findAll();

    int findCount();

    void deleteById(Integer id);

    void updateById (Question question);

    void addNote(Question question);

    void addCode(Question question);

    List<QuestionDept> findCharts();

    List<Question> findExcel();
}
