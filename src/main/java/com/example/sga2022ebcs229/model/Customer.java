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
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "customer")
    Set<OrderData> orders;

    @Override
    public String toString() {
        return "<tr> <td> Customer id=" + id + "</td> <td> &emsp;</td> <td> Name =" + name + "</td><td> &emsp;</td> <td> address=" + address + "</td> <td> &emsp;</td><td> phone=" + phone + "</td> <td> &emsp;</td><td> email="
                + email + "</td></tr>";
    }

    

}
