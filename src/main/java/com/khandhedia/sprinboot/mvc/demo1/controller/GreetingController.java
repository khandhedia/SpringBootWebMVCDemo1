package com.khandhedia.sprinboot.mvc.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("name", "Nirav");
        return "hello";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hi!!!";
    }

}