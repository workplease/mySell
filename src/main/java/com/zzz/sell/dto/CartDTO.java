package com.zzz.sell.dto;

import lombok.Data;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-13 0:41
 * @Version: 1.0
 *
 * 购物车
 */
@Data
public class CartDTO {

    /**
     * 商品 ID
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId,Integer productQuantity){
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
