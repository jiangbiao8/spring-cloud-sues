package com.sues.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
     @Value("${server.port}")
     private String serverPort;
     private static int count=0;
    @RequestMapping("/getMemberAll")
    public List<String> getMemberAll(){
        count++;
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("LI");
        list.add("count"+count);
        list.add("serverPort"+serverPort);
        return list;
    }
    @RequestMapping("/getMemberServiceApi")
    public String getMemberServiceApi(){
        return "this is 会员服务工程";
    }


}
