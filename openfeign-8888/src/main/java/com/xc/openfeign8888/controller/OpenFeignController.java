package com.xc.openfeign8888.controller;

import com.xc.openfeign8888.service.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {

    @Autowired
    OpenFeignService openFeignService;

    @GetMapping("/getInfo")
    public String getDiscovery() {
        return openFeignService.getDiscovery();
    }
}
