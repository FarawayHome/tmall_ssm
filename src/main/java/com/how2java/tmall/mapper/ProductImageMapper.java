package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.ProductImage;
import com.how2java.tmall.pojo.ProductImageExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductImage record);

    int insertSelective(ProductImage record);

    List<ProductImage> selectByExample(ProductImageExample example);

    ProductImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductImage record);

    int updateByPrimaryKey(ProductImage record);
}