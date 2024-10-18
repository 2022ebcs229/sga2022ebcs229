package com.example.sga2022ebcs229.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sga2022ebcs229.model.Customer;
import com.example.sga2022ebcs229.repository.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo; 

    public void delete(int i){
        customerRepo.delete(customerRepo.findById(i).orElse(null));
    }

    public void save(Customer customer){
        customerRepo.save(customer);
    }

    public Customer findById(int id){
        return customerRepo.findById(id).orElse(new Customer());
    }

    public void getCustomers() {
        // System.out.println(customerRepo.findAll());
        // System.out.println(customerRepo.findById(1));
        // System.out.println(customerRepo.findByP(1));
        // System.out.println(customerRepo.findByIdGreaterThan(1));
        // System.out.println(customerRepo.findByEmail("makarand.khare@gmail.com"));
        //customerRepo.delete(customerRepo.findById(1).orElse(null));
        
    }

    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }
    
}
