package com.eureka.eurekafeignclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private Service service;


    @GetMapping("/hi")
    public String say(@RequestParam String name){
        return service.say(name);
    }
}
