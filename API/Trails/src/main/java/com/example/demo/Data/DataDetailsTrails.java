package com.example.demo.Data;

import com.example.demo.Models.City;
import com.example.demo.Models.TrailsModels;


public record DataDetailsTrails(
    
    Long Id,
    String Name,
    String UrlImage,
    String Description,
    String CEP,
    String Address,
    City City,
    String Location,
    Boolean Status
    ) {

        public DataDetailsTrails (TrailsModels trail) {

            this(
                trail.getId(),
                trail.getName(),
                trail.getUrlImage(),
                trail.getDescription(),
                trail.getCEP(),
                trail.getAddress(),
                trail.getCity(),
                trail.getLocation(),
                trail.getStatus()
            );
        }
    }
