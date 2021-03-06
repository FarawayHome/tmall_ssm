package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Review;
import com.how2java.tmall.pojo.ReviewExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}