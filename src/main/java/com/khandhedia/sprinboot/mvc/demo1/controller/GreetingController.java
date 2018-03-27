package com.khandhedia.sprinboot.mvc.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(ModelAndView model) {
        model.addObject("name", "Nirav");
        return "hello";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hi!!!";
    }

}