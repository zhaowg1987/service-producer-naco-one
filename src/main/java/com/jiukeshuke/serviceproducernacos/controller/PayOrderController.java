package com.jiukeshuke.serviceproducernacos.controller;

import com.jiukeshuke.serviceproducernacos.entity.CommonRespData;

import com.jiukeshuke.serviceproducernacos.entity.PayOrder;
import com.jiukeshuke.serviceproducernacos.service.PayOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 秒杀订单controller
 *
 * @Author
 * @create 2019-06-18
 **/
@Slf4j
@RestController
public class PayOrderController {


    @Autowired
    private PayOrderService payOrderService;

    @RequestMapping("/insertOrder")
    public CommonRespData insertOrder(@RequestBody PayOrder payOrder)  {
        CommonRespData commonRespData = new CommonRespData();
        try {
            payOrderService.insertPayOrder(payOrder);
            commonRespData.setStatus(200);
            commonRespData.setMessage("操作成功");
            commonRespData.setData(payOrder);
        } catch (Exception e) {
            commonRespData.setStatus(500);
            commonRespData.setMessage(e.toString());
            log.error("插入订单发生异常。", e);
        }
        return commonRespData;
    }


    @RequestMapping("/getPayOrder")
    public CommonRespData getPayOrder(Long payOrderId) {
        CommonRespData commonRespData = new CommonRespData();
        try {
            PayOrder payOrder = payOrderService.selectPayOrderById(payOrderId);
            commonRespData.setStatus(200);
            commonRespData.setMessage("操作成功");
            commonRespData.setData(payOrder);
        } catch (Exception e) {
            commonRespData.setStatus(500);
            commonRespData.setMessage(e.toString());
            log.error("查询出现异常.", e);
        }
        return commonRespData;
    }


}
