package com.example.sga2022ebcs229.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.sga2022ebcs229.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.sga2022ebcs229.service.CustomerService;

@Controller
public class BitsController {
    
    //this variable 'cr' is available for all the jsp pages 
    @ModelAttribute("cr")
    public String cr(){
        return "© Makarand Khare";
    }

    @GetMapping("")
    public String home(){
        return "index";
    } 

    @Autowired
    CustomerService service;
    
    @GetMapping("customerReg")
    public String custRegPage(){
        return "customerReg";
    }

    @PostMapping("customer")
    public String addCustomer(Customer customer) {
        //if JSP variable has different name than customer then use addCustomer(@ModelAttribute("variable_name") Customer customer)
        service.save(customer);
        return "customer";
    }

    @GetMapping("customers")
    public ModelAndView getCustomers(ModelAndView mv) {
        mv.addObject("customers", service.findAllCustomers());
        mv.setViewName("customers");
        return mv;
    }
    
    @GetMapping("deleteCustomer")
     public String deleteCustomerPage(){
        return "deleteCustomer";
    }
    
    @PostMapping("delCustDone")
    public String deleteCustomer(int id) {
        service.delete(id);
        return "index";
    }
    
}

    // @GetMapping("customer/{custid}")
    // public ModelAndView getCustomer(@PathVariable("custid") int id, ModelAndView mv){

    //     mv.addObject("customer", service.findById(id));
    //     mv.setViewName("customer");

    //     return mv;
    // }