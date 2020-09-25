package com.ddedu.dao;

import com.ddedu.entity.Depart;

import java.util.List;

public interface DepartDao {
    public void addDepart(Depart depart);
    public List<Depart> selectAll();
    public void deleteOne(Integer id);
    public void  updateOne(Depart depart);

}
