package com.sues.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderMemberService {
    @Autowired
     RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "isError")
    public List<String> getOrderUserAll(){
        return restTemplate.getForObject("http://service-member/getMemberAll/",List.class);
    }

    public List<String>  isError(){
        List<String> list = new ArrayList<>();
        list.add("服务发生错误");
        return list;
    }

}

