package com.projetoCidade.citiesapi.controller;

import com.projetoCidade.citiesapi.model.Country;
import com.projetoCidade.citiesapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @Autowired
    CountryService countryService;

    @GetMapping
    public List<Country> countries(){
        return countryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@Valid @PathVariable Long id){
        return countryService.findById(id);
    }
}
