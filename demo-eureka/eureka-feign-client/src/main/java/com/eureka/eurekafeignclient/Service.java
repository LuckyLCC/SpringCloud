package com.eureka.eurekafeignclient;


import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String say(String name){
        return eurekaClientFeign.say(name);
    }
}
