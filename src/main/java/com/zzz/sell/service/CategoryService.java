package com.zzz.sell.service;

import com.zzz.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 20:40
 * @Version: 1.0
 *
 * 类目 DAO 接口
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
