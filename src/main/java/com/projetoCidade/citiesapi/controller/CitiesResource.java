package com.projetoCidade.citiesapi.controller;

import com.projetoCidade.citiesapi.model.City;
import com.projetoCidade.citiesapi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CitiesResource {
    @Autowired
    CityService cityService;

    @GetMapping
    public List<City> findAll(){
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getOne(@Valid @PathVariable Long id){
        return cityService.findById(id);
    }
}
