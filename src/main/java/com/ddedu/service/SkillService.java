package com.ddedu.service;

import com.ddedu.entity.Skill;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:37
 */
public interface SkillService {
    void add(Skill skill);

    List<Skill> select(Integer page, Integer limit);
}
