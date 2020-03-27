package com.lay.springcloud.order.controller;

import com.lay.springcloud.order.feign.UserFeignService;
import com.lay.springcloud.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order/")
@RestController
public class OrderController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("getOrderById")
    public Object getOrderById(@RequestParam("id") Integer id){
        Order order = new Order();
        order.setId(1);
        order.setOrderNo("2020032200001");
        order.setUserId(1);
        String username = userFeignService.getUserNameById(1);
        order.setUsername(username);
        return order;
    }
}
