package com.ddedu.service.impl;

import com.ddedu.dao.DepartDao;
import com.ddedu.entity.Depart;
import com.ddedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartDao departDao;
    @Override
    public void addDepart(Depart depart) {
        departDao.addDepart(depart);

    }

    @Override
    public List<Depart> selectAll() {
        return departDao.selectAll();
    }

    @Override
    public void deleteOne(Integer id) {
        departDao.deleteOne(id);
    }

    @Override
    public void updateOne(Depart depart) {
        departDao.updateOne(depart);
    }
}
