package com.sues.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sues.ribbon.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderMemberController {
    @Autowired
    public OrderMemberService orderMemberService;

    @RequestMapping("/getOrderUserAll/")

    public List<String> getOrderUserAll(){
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrderUserAll();

    }

}
