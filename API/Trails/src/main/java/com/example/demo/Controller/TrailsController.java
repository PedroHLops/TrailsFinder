package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.Data.DataCreationTrails;
import com.example.demo.Data.DataDetailsTrails;
import com.example.demo.Data.DataSearchTrails;
import com.example.demo.Data.DataUpdateTrails;
import com.example.demo.Interface.TrailsInterface;
import com.example.demo.Models.City;
import com.example.demo.Models.TrailsModels;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.var;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RequestMapping
@RestController
public class TrailsController {

    @Autowired
    private TrailsInterface interface1;

    @GetMapping("/Cities")
    public City[] getCities() {
        return City.values();
    }

    @Transactional
    @PostMapping("/restrict")
    public ResponseEntity<DataDetailsTrails> Creation(@RequestBody @Valid DataCreationTrails Data, UriComponentsBuilder uriBuilder) {
        interface1.save(new TrailsModels(Data));
        var trail = new TrailsModels(Data);
        var Uri = uriBuilder
        .path("/Trails/{Id}")
        .buildAndExpand(trail.getId())
        .toUri();

        return ResponseEntity.created(Uri).body(new DataDetailsTrails(trail));
    }

    @GetMapping("**")
    public ResponseEntity<List<DataSearchTrails>> List(@RequestParam(required = false) String Name){
        
        var Resultlist = interface1
        .findByNameContainingIgnoreCase(Name).stream()
        .map(DataSearchTrails::new)
        .toList();

        return ResponseEntity.ok(Resultlist);
    }

    @Transactional
    @DeleteMapping("/restrict")
    public ResponseEntity<Void> Delete(@PathVariable Long Id) {
        interface1.deleteById(Id);

        return ResponseEntity.noContent().build();
    }

    @Transactional
    @DeleteMapping("/restrict/{Id}")
    public ResponseEntity<Void> Inative(@PathVariable Long Id) {
        var Trail = interface1.getReferenceById(Id);
        Trail.InativeTrail();

        return ResponseEntity.noContent().build(); 
    }

    @Transactional
    @PutMapping("/restrict/{id}")
    public ResponseEntity<DataDetailsTrails> ActiveTrail(@PathVariable Long Id) {
        var Trail = interface1.getReferenceById(Id);
        Trail.ActiveTrail();

        return ResponseEntity.ok(new DataDetailsTrails(Trail));
    }

    @Transactional
    @PutMapping("/restrict")
    public ResponseEntity<DataDetailsTrails> UpdateTrail(@PathVariable DataUpdateTrails Data) {
        var Trail = interface1.getReferenceById(Data.Id());
        Trail.UpdateInfo(Data);

        return ResponseEntity.ok(new DataDetailsTrails(Trail));
    }
}
