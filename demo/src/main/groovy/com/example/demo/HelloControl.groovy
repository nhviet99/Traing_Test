package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloControl {
    @Value('${spring.application.name}')
    String name;
    @RequestMapping(value="/")
    String HelloMain()
    {
        return "Hello " +name
    }
}
