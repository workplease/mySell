package com.zzz.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-12 16:27
 * @Version: 1.0
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;

    /*
     * 订单id.
     */
    private String orderId;

    /*
     * 商品id.
     */
    private String productId;

    /*
     * 商品名称.
     */
    private String productName;

    /*
     * 商品单价.
     */
    private BigDecimal productPrice;

    /*
     * 商品数量.
     */
    private Integer productQuantity;

    /*
     * 商品小图.
     */
    private String productIcon;
}
