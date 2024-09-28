package com.example.demo.Models;

import com.example.demo.Data.DataCreationTrails;
import com.example.demo.Data.DataUpdateTrails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "Trail")
@Table(name = "Trails")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "Id")
public class TrailsModels {

    public TrailsModels(@Valid DataCreationTrails data) {
       this.name = data.Name();
       this.UrlImage = data.UrlImage();
       this.Description = data.Description();
       this.CEP = data.CEP();
       this.Address = data.Address();
       this.City = data.City();
       this.Location = data.Address() + ", " + data.City() + ", " + data.CEP();
       this.Status = true;
    }
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String UrlImage;
    private String Description;
    private String CEP;
    private String Address;
    
    @Enumerated(EnumType.STRING)
    private City City;
    private String Location;
    private Boolean Status;


    public void InativeTrail() {
        this.Status = false;
    }

    public void ActiveTrail() {
        this.Status = true;
    }

    public void UpdateInfo(@Valid DataUpdateTrails Data) {
        if(Data.Name() != null){
            this.name = Data.Name();
        }
    }

}
