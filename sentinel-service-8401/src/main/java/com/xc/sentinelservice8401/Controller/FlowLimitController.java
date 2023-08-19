package com.xc.sentinelservice8401.Controller;

import com.xc.sentinelservice8401.Service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
