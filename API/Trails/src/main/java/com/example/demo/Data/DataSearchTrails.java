package com.example.demo.Data;

import com.example.demo.Models.TrailsModels;

public record DataSearchTrails(
    String UrlImage,
    String Name
) {

    public DataSearchTrails(TrailsModels trail) {
        this(
            trail.getUrlImage(),
            trail.getName()
        );
    }
}
