package com.ddedu.dao;

import com.ddedu.entity.Skill;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:36
 */
public interface SkillDao {
    void add(Skill skill);

    List<Skill> select();
}
