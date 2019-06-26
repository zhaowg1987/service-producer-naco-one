package com.jiukeshuke.serviceproducernacos.service;

import com.jiukeshuke.serviceproducernacos.entity.PayOrder;

/**
 * 秒杀订单服务接口
 *
 * @Author
 * @create 2019-06-18
 **/
public interface PayOrderService {

    int insertPayOrder(PayOrder payOrder) throws Exception;

    PayOrder selectPayOrderById(Long seckillId);

}
