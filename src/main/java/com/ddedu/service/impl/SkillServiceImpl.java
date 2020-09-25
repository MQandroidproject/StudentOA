package com.ddedu.service.impl;

import com.ddedu.dao.SkillDao;
import com.ddedu.entity.Skill;
import com.ddedu.service.SkillService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:37
 */
@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillDao skillDao;

    @Override
    public void add(Skill skill) {
        skillDao.add(skill);
    }

    @Override
    public List<Skill> select(Integer page, Integer limit) {
        //        设置页码和每页显示的记录数，该语句后面一定要紧跟着数据库查询相关语句
        PageHelper.startPage(page, limit);
        return skillDao.select();
    }
}
