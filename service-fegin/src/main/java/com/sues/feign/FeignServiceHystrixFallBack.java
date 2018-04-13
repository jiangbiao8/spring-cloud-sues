package com.sues.feign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FeignServiceHystrixFallBack implements FeignOrderMemberService {
    @Override
    public List<String> getToOrderMemberAll() {
        //服务降级处理
       List<String> list=new ArrayList<>();
       list.add("服务发生异常");
       return list;
    }
}
