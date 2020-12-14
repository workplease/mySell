package com.zzz.sell.repository;

import com.zzz.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: milkteazzz
 * @Data: 2020-12-12 16:33
 * @Version: 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
