package com.projetoCidade.citiesapi.controller;

import com.projetoCidade.citiesapi.model.State;
import com.projetoCidade.citiesapi.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {
    @Autowired
    StateService stateService;

    @GetMapping
    public List<State> findAll(){
        return stateService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> getOne(@Valid @PathVariable Long id){
        return stateService.findById(id);
    }


}
