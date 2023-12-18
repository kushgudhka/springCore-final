package com.spring.main.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" as endPoints

    @GetMapping("/")
    public String sayHello(){
        return "Hello Kush!";
    }

}
