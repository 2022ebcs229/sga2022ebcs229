package com.example.sga2022ebcs229.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sga2022ebcs229.model.Customer;
import com.example.sga2022ebcs229.repository.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo repo; 

    public void save(Customer customer){
        repo.save(customer);
    }

    public Customer findById(int id){
        return repo.findById(id).orElse(new Customer());
    }

    public void getCustomers() {
        System.out.println(repo.findAll());
        System.out.println(repo.findById(1));
        System.out.println(repo.findByP(1));
        System.out.println(repo.findByIdGreaterThan(1));
        System.out.println(repo.findByEmail("makarand.khare@gmail.com"));
        //repo.delete(repo.findById(1).orElse(null));
        
    }
    
}
