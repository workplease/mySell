package com.zzz.sell.repository;

import com.zzz.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 21:29
 * @Version: 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
