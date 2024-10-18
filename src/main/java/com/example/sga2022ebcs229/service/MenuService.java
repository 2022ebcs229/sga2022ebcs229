package com.example.sga2022ebcs229.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sga2022ebcs229.model.Menu;
import com.example.sga2022ebcs229.repository.MenuRepo;

@Service
public class MenuService {

    @Autowired
    MenuRepo menuRepo;

    public void save(Menu menu) {
        menuRepo.save(menu);
    }

    public List<Menu> findAllMenu() {
        return menuRepo.findAll();
    }
    
}
