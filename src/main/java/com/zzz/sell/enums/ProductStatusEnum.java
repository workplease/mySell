package com.zzz.sell.enums;

import lombok.Getter;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 21:41
 * @Version: 1.0
 *
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
