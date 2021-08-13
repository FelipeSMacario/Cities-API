package com.projetoCidade.citiesapi.service;

import com.projetoCidade.citiesapi.model.State;
import com.projetoCidade.citiesapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }

    public ResponseEntity<State> findById (Long id){
        Optional<State> optional = stateRepository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        else return (ResponseEntity<State>) ResponseEntity.notFound();
    }
}
