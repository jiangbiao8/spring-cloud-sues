package com.sues.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderMemberService {

    @Autowired
    private RestTemplate restTemplate;
    public List<String> getOrderUserAll(){
        return restTemplate.getForObject("http://service-member/getMemberAll/",List.class);
    }

}
