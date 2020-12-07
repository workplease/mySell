package com.zzz.sell.repository;

import com.zzz.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 19:54
 * @Version: 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
