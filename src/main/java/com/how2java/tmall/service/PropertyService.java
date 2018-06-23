package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Property;

import java.util.List;

/**
 * @Auther: shi
 * @Date: 2018/6/21 15:09
 * @Description:
 */
public interface PropertyService {
    void add(Property c);

    void delete(int id);

    void update(Property c);

    Property get(int id);

    List list(int cid);

}
