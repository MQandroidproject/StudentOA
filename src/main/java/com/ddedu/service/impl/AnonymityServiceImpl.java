package com.ddedu.service.impl;

import com.ddedu.dao.AnonymityDao;
import com.ddedu.entity.Anonymity;
import com.ddedu.service.AnonymityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:08
 */
@Service
public class AnonymityServiceImpl implements AnonymityService {
    @Autowired
    private AnonymityDao anonymityDao;

    @Override
    public void add(Anonymity anonymity) {
        anonymityDao.add(anonymity);
    }

    @Override
    public List<Anonymity> select(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        return anonymityDao.select();
    }
}
