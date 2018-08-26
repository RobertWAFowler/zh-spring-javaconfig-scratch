package com.zenhog.zh.spring.javaconfig.scratch.contollers;

import com.zenhog.zh.spring.javaconfig.scratch.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello(){
        System.out.println(greetingService.getGreeting());
    }
}
