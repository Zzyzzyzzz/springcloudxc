package com.xc.consumer8083.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String url;

    @GetMapping("/consumer/nacos")
    public String getDiscovery() throws Exception {
        Thread.sleep(2000);
        return restTemplate.getForObject(url + "/config/info", String.class);
    }
}
