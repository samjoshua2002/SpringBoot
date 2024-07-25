package com.luv2code.springboot.demo.jocodes.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
@GetMapping("/")
    public String sayHello(){
     return "Hello world";
    }
@GetMapping ("/Workout")
    public String getDailyWorkout(){
    return "run  a 5 kgs ON A SET  ";
    }
    @GetMapping ("/Fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
}
