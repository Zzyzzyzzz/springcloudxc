package com.xc.sentinelservice8401.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xc.sentinelservice8401.Service.SentinelService;
import com.xc.sentinelservice8401.myhandler.CustomerBlockHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @Autowired
    SentinelService service;

    @GetMapping("/testA")
    public String testA() {
        return service.getCommon();
    }

    @GetMapping("/testB")
    public String testB() {
        return service.getCommon();
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "handleHotKey")
    public String testHost(@RequestParam("hot1") String hot1,
                           @RequestParam("hot2") String hot2,
                           @RequestParam("hot3") String hot3) {
        return "testHotKey";
    }

    // 处理热点规则异常返回
    public String handleHotKey(String hot1, String hot2, String hot3, BlockException e) {
        return "系统繁忙";
    }

    // 限流、熔断异常
    @GetMapping("/testHotKey2")
    @SentinelResource(value = "testHotKey2",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handler1")
    public String testHost2(@RequestParam("hot1") String hot1,
                            @RequestParam("hot2") String hot2,
                            @RequestParam("hot3") String hot3) {
        return "testHotKey";
    }

    // 程序异常
    @GetMapping("/fallback")
    @SentinelResource(value = "fallback",
            fallbackClass = CustomerBlockHandler.class,
            fallback = "handler2",
            exceptionsToIgnore = {NullPointerException.class})
    public String fallback(@RequestParam("fallback") String value) {
        return "fallback";
    }

}
