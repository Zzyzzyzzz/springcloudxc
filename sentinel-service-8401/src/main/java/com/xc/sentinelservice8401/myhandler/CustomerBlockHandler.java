package com.xc.sentinelservice8401.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {

    public static String handler1(String hot1, String hot2, String hot3, BlockException e){
        return "服务器繁忙";
    }

    public static String handler2(String value, Throwable e){
        return "服务器繁忙";
    }
}
