package com.zzz.sell.service;

import com.zzz.sell.dto.OrderDTO;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-13 12:59
 * @Version: 1.0
 *
 * 买家
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
