package com.xc.sentinelservice8401.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {

    public static String handler1(BlockException e){
        return "服务器繁忙";
    }
}
