package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Product;

import java.util.List;

/**
 * @Auther: shi
 * @Date: 2018/6/23 15:25
 * @Description:
 */
public interface ProductService {
    Product get(int id);

    void add(Product product);

    void delete(int id);

    void update(Product product);

    List list(int cid);
}
