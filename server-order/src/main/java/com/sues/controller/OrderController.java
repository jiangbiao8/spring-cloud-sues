package com.sues.controller;

import com.sues.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    public OrderMemberService orderMemberService;

    @RequestMapping("/getOrderUserAll/")
    public List<String> getOrderUserAll(){
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrderUserAll();

    }
    @RequestMapping("/getOrderServiceApi")
    public String getOrderServiceApi(){
        return "this is 订单服务工程";
    }
}
