package com.ddedu.service.impl;

import com.ddedu.dao.QuestionDao;
import com.ddedu.entity.Question;
import com.ddedu.service.QuestionService;
import com.ddedu.vo.QuestionCharts;
import com.ddedu.vo.QuestionDept;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Override
    public void addQuestion(Question question) {
        questionDao.addQuestion(question);
    }

    @Override
    public List<Question> findAll(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Question> list = questionDao.findAll();
        return list;
    }

    @Override
    public int findCount() {
        return questionDao.findCount();
    }

    @Override
    public void deleteById(Integer id) {
        questionDao.deleteById(id);
    }

    @Override
    public void updateById(Question question) {
        questionDao.updateById(question);
    }

    @Override
    public void addNote(Question question) {
        questionDao.addNote(question);
    }

    @Override
    public void addCode(Question question) {
        questionDao.addCode(question);
    }

    @Override
    public QuestionCharts findCharts() {
        List<QuestionDept> list = questionDao.findCharts();
        QuestionCharts charts = new QuestionCharts();
        charts.setCts(new ArrayList<>());
        charts.setQtypes(new ArrayList<>());
        for (QuestionDept qd : list) {
            charts.getQtypes().add(qd.getQtype());
            charts.getCts().add(qd.getCt());
        }
        return charts;
    }

    @Override
    public List<Question> findExcel() {
        List<Question> excel = questionDao.findExcel();
        return excel;
    }
}
