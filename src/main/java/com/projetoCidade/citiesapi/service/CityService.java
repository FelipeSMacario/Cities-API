package com.projetoCidade.citiesapi.service;

import com.projetoCidade.citiesapi.model.City;
import com.projetoCidade.citiesapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<City> findAll(){
        return cityRepository.findAll();
    }

    public ResponseEntity<City> findById(Long id){
        Optional<City> optional = cityRepository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        return (ResponseEntity<City>) ResponseEntity.notFound();
    }
}
