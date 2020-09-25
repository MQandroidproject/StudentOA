package com.ddedu.service.impl;

import com.ddedu.dao.WeekDao;
import com.ddedu.entity.Week;
import com.ddedu.service.WeekService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo on 2020/9/1 21:23
 */
@Service
public class WeekServiceImpl implements WeekService {
    @Autowired
    private WeekDao weekDao;

    @Override
    public void add(Week week) {
        weekDao.add(week);
    }

    @Override
    public List<Week> select(Integer page, Integer limit) {
        //        设置页码和每页显示的记录数，该语句后面一定要紧跟着数据库查询相关语句
        PageHelper.startPage(page, limit);
        return weekDao.select();
    }

    @Override
    public Week selectById(Integer id) {
        return weekDao.selectById(id);
    }


    @Override
    public void deleteById(Integer id) {
        weekDao.deleteById(id);
    }

    @Override
    public void update(Week week) {
        weekDao.update(week);
    }
}
