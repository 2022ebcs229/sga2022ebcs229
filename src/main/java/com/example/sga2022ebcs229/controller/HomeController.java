package com.example.sga2022ebcs229.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
        @GetMapping("")
    public String home(){
        return "index";
    }    
}
