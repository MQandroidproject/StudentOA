package com.ddedu.dao;

import com.ddedu.entity.Vip;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 16:31
 */
public interface VipDao {

    void add(Vip vip);

    List<Vip> select();
}
