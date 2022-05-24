package com.example.springbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootProjectController {

    @GetMapping
    public String returnMethod(){
        return "hello world";
    }
}
