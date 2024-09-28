package com.example.demo.Data;

import com.example.demo.Models.City;

import jakarta.validation.constraints.NotNull;

public record DataUpdateTrails(

    @NotNull
    Long Id,
    String Name,
    String UrlImage,
    String Description,
    String CEP,
    String Address,
    City City,
    String Location,
    Boolean Status
) {}
