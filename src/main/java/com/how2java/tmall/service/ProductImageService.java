package com.how2java.tmall.service;

import com.how2java.tmall.pojo.ProductImage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: shi
 * @Date: 2018/6/23 19:54
 * @Description:
 */


public interface ProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    List<ProductImage> list(int pid, String type);
}