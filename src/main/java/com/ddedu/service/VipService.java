package com.ddedu.service;

import com.ddedu.entity.Vip;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 16:32
 */
public interface VipService {
    void add(Vip vip);

    List<Vip> select(Integer page, Integer limit);
}
