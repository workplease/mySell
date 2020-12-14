package com.zzz.sell.enums;

import lombok.Getter;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-12 16:20
 * @Version: 1.0
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
