package com.zzz.sell.VO;

import lombok.Data;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-07 22:03
 * @Version: 1.0
 *
 * http 请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
