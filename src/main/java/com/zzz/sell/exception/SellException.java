package com.zzz.sell.exception;

import com.zzz.sell.enums.ResultEnum;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-12 17:06
 * @Version: 1.0
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
