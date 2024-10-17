package com.example.sga2022ebcs229.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sga2022ebcs229.model.Customer;

@Controller
public class CustomerController {
    
    @GetMapping("customerReg")
    public String custRegPage(){
        return "customerRegistration";
    }

    @PostMapping("customer")
    public String addCustomer(Customer customer) {
        return "customerAddSuccess";
    }
    
}
