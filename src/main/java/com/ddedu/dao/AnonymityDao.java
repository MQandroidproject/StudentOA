package com.ddedu.dao;

import com.ddedu.entity.Anonymity;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:06
 */
public interface AnonymityDao {
    void add(Anonymity anonymity);

    List<Anonymity> select();
}
