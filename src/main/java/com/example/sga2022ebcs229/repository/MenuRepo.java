package com.example.sga2022ebcs229.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sga2022ebcs229.model.Menu;

@Repository
public interface MenuRepo  extends JpaRepository<Menu, Integer> {
}