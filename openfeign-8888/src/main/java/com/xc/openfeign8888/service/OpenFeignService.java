package com.xc.openfeign8888.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("nacos-consumer")
public interface OpenFeignService {

    @GetMapping("/consumer/nacos")
    String getDiscovery();
}
