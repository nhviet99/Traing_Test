package com.example.validation

import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

import javax.validation.Valid
@Controller
class WebController implements WebMvcConfigurer{

    @Override
    void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results")
    }
    @GetMapping("/")
    public String ShowForm(UserForm user)
    {
        return "form"
    }
    @PostMapping("/")
    public String checkUserInfo(@Valid UserForm user, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "form"
        }
        return "redirect:/results";

    }

}
