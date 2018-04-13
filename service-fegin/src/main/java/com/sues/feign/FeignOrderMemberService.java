package com.sues.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "service-member",fallback = FeignServiceHystrixFallBack.class)
public interface FeignOrderMemberService {
    @RequestMapping("/getMemberAll")
    List<String> getToOrderMemberAll();
}
