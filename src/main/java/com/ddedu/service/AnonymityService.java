package com.ddedu.service;

import com.ddedu.entity.Anonymity;

import java.util.List;

/**
 * @author lenovo on 2020/9/2 19:07
 */
public interface AnonymityService {
    void add(Anonymity anonymity);

    List<Anonymity> select(Integer page, Integer limit);
}
