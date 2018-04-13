package com.sues.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignOrderMemberController {
    @Autowired
    private  FeignOrderMemberService feignOrderMemberService;
    @RequestMapping("/getOrderUserAll/")
    public List<String> getOrderUserAll(){
        System.out.println("feign服务开始调用会员服务");
        return feignOrderMemberService.getToOrderMemberAll();

    }
    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "getOrderInfo";
    }
}
