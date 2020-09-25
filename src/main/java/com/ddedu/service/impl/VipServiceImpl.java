package com.ddedu.service.impl;

import com.ddedu.dao.VipDao;
import com.ddedu.entity.Vip;
import com.ddedu.service.VipService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 16:32
 */
@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipDao vipDao;

    @Override
    public void add(Vip vip) {
        vipDao.add(vip);
    }

    @Override
    public List<Vip> select(Integer page, Integer limit) {
        //        设置页码和每页显示的记录数，该语句后面一定要紧跟着数据库查询相关语句
        PageHelper.startPage(page, limit);
        return vipDao.select();
    }
}
