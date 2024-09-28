package com.example.demo.Interface;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.TrailsModels;


public interface TrailsInterface extends JpaRepository<TrailsModels, Long>{

    Collection<TrailsModels> findByNameContainingIgnoreCase(String name); 
}
