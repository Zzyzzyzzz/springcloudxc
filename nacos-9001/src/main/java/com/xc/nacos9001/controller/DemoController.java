package com.xc.nacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/xc")
    public String getServerPort(){
        return serverPort;
    }
    @GetMapping("/xc1")
    public String getServerPort1(){
        return serverPort;
    }
    @GetMapping("/xc/port")
    public String getServerPort2(){
        return serverPort;
    }
}
