package com.how2java.tmall.service;

import com.how2java.tmall.pojo.User;

import java.util.List;

/**
 * @Auther: shi
 * @Date: 2018/6/25 14:40
 * @Description:
 */
public interface UserService {
    void add(User user);

    void delete(int id);

    void update(User user);

    List list();

    User get(int id);
}
