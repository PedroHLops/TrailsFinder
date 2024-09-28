package com.example.demo.Data;

import com.example.demo.Models.City;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataCreationTrails(

    Long Id,
    String UrlImage,
    @NotBlank
    String Name,
    @NotBlank
    String Description,
    @NotBlank
    String CEP,
    @NotNull
    String Address,
    @NotNull
    City City,
    String Location,
    Boolean Status) {}

