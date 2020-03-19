package com.example.demo

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@Configurable
@Profile("Menu")
@RestController
class PrintController {
    @Bean
    @RequestMapping("/")
    String PrintSomething()
    {
        return "Choose your menu";
    }
}
@Configurable
@Profile("Tuesday")
@RestController
class PrintTuesDay{
    @Bean
    @RequestMapping("/")
    String PrintSomething()
    {
        return "Choose your tuesday";
    }
}
