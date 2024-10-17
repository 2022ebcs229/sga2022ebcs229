package com.example.sga2022ebcs229.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.sga2022ebcs229.CustomerRepo;
import com.example.sga2022ebcs229.model.Customer;


@Controller
public class CustomerController {

    @Autowired
    CustomerRepo repo;
    
    @GetMapping("customerReg")
    public String custRegPage(){
        return "customerRegistration";
    }

    @PostMapping("customer")
    public String addCustomer(Customer customer) {
        repo.save(customer);
        return "customer";
    }

    @GetMapping("customer/{custid}")
    public ModelAndView getCustomer(@PathVariable("custid") int id, ModelAndView mv){

        mv.addObject("customer", repo.findById(id));
        mv.setViewName("customer");

        return mv;
    }

    @GetMapping("customers")
    public String getCustomers() {
        System.out.println(repo.findAll());
        System.out.println(repo.findById(1));
        System.out.println(repo.findByP(1));
        System.out.println(repo.findByIdGreaterThan(1));
        System.out.println(repo.findByEmail("makarand.khare@gmail.com"));
        repo.delete(repo.findById(1).orElse(null));
        return "index";
    }
    
    
}
