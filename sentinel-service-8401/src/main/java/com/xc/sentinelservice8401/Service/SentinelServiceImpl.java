package com.xc.sentinelservice8401.Service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class SentinelServiceImpl implements SentinelService{

    @Override
    @SentinelResource("common")
    public String getCommon() {
        return "Common";
    }
}
