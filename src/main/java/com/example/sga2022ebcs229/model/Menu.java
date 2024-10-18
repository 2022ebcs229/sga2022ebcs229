package com.example.sga2022ebcs229.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Menu {
    @Id
    private int id;
    private String dish;
    private float price; 
    
    @OneToMany(mappedBy = "menu")
    Set<OrderData> orders;

    @Override
    public String toString() {
        return "<tr> <td> Item id=" + id + "</td> <td> &emsp;</td> <td>  Dish name =" + dish + "</td> <td> &emsp;</td> <td> Price = " + price + " Rs.</td></tr>";
    }

    

}
