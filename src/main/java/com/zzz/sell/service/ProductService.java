package com.zzz.sell.service;

import com.zzz.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 21:33
 * @Version: 1.0
 *
 * 商品 DAO 接口
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
