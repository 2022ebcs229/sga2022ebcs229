package com.example.sga2022ebcs229.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sga2022ebcs229.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("select c from Customer c where c.id >?1")
    List<Customer> findByP(int i);

    List<Customer> findByEmail(String email);
    
    List<Customer> findByIdGreaterThan(int i);
    
}
