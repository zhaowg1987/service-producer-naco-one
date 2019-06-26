package com.jiukeshuke.serviceproducernacos.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jiukeshuke.serviceproducernacos.order.dao.PayOrderDao;
import com.jiukeshuke.serviceproducernacos.entity.PayOrder;
import com.jiukeshuke.serviceproducernacos.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 接口实现类
 *
 * @Author
 * @create 2019-06-18
 **/
@Service
public class PayOrderServiceImpl implements PayOrderService  {

    @Autowired
    private PayOrderDao payOrderDao;


    @LcnTransaction //分布式事务注解
    @Transactional
    @Override
    public int insertPayOrder(PayOrder payOrder) throws Exception{
        return payOrderDao.insertPayOrder(payOrder);
    }

    @Override
    public PayOrder selectPayOrderById(Long seckillId) {
        return payOrderDao.selectPayOrderById(seckillId);
    }
}
