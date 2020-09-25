package com.ddedu.service;

import com.ddedu.entity.Week;

import java.util.List;

/**
 * @author lenovo on 2020/9/1 21:23
 */
public interface WeekService {
    void add(Week week);

    List<Week> select(Integer page, Integer limit);

    Week selectById(Integer id);

    void deleteById(Integer id);

    void update(Week week);
}
