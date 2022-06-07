package com.luv2code.springboot.demo.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {


    @GetMapping("/")
    public String sayHello(){
        return "Hello World! This is Cool App \n Time on server is " + LocalDateTime.now();
    }

    //exposes a new new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run 5k workout";
    }
    //exposes a new new endpoint for lucky day

    @GetMapping("/lucky")
    public String getDailyLucky(){
        return "today is yourlucky day";
    }

}
