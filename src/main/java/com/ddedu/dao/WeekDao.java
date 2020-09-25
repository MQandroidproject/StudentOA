package com.ddedu.dao;

import com.ddedu.entity.Week;

import java.util.List;

/**
 * @author lenovo on 2020/9/1 21:21
 */
public interface WeekDao {

    void add(Week week);

    List<Week> select();

    Week selectById(Integer id);

    void deleteById(Integer id);

    void update(Week week);

}
