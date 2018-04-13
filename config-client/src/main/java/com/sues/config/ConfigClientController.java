package com.sues.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${foo}")
    public String foo;
    @RequestMapping("/getName")
    public String getName(){
        System.out.println("get name..........");
        return foo;
    }
}
