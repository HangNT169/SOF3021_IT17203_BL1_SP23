package com.hangnt169.it17203.B1_OverviewSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/test")
    public String helloWord(Model model){
        //  code
        model.addAttribute("mess","Hello world");
        return "hello";
    }
}
