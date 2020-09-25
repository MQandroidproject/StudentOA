package com.ddedu.service;

import com.ddedu.entity.Depart;

import java.util.List;

public interface DepartService {
    public void addDepart(Depart depart);
    public List<Depart> selectAll();
    public void deleteOne(Integer id );
    public void updateOne(Depart depart);
}
