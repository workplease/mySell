package com.zzz.sell.service.impl;

import com.zzz.sell.dataobject.ProductInfo;
import com.zzz.sell.enums.ProductStatusEnum;
import com.zzz.sell.repository.ProductInfoRepository;
import com.zzz.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 21:36
 * @Version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductInfoRepository repository;

    @Autowired
    public ProductServiceImpl(ProductInfoRepository repository){
        this.repository = repository;
    }

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
