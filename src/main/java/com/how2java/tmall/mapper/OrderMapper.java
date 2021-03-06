package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}