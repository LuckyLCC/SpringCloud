package com.eureka.eurekafeignclient;

import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/6/21.
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String say(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
