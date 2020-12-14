package com.zzz.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zzz.sell.dataobject.OrderDetail;
import com.zzz.sell.dto.OrderDTO;
import com.zzz.sell.enums.ResultEnum;
import com.zzz.sell.exception.SellException;
import com.zzz.sell.from.OrderFrom;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-13 11:42
 * @Version: 1.0
 */
@Slf4j
public class OrderFrom2OrderDTOConverter {

    public static OrderDTO convert(OrderFrom orderFrom){
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderFrom.getName());
        orderDTO.setBuyerPhone(orderFrom.getPhone());
        orderDTO.setBuyerAddress(orderFrom.getAddress());
        orderDTO.setBuyerOpenid(orderFrom.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderFrom.getItems(),
                    new TypeToken<List<OrderDetail>>() {
            }.getType());
        }catch (Exception e){
            log.error("【对象转换】错误，string={}",orderFrom.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
