package com.jiukeshuke.serviceproducernacos.order.dao;

import com.jiukeshuke.serviceproducernacos.entity.PayOrder;
import org.springframework.stereotype.Repository;

/**
 * 订单表
 *
 * @Author
 * @create 2019-06-18
 **/
@Repository
public interface PayOrderDao {

    int insertPayOrder(PayOrder payOrder);

    PayOrder selectPayOrderById(Long seckillId);
}
