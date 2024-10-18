package com.example.sga2022ebcs229.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class OrderData {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    Menu menu;

    LocalDateTime orderTime;
    int quantity;
    
}
