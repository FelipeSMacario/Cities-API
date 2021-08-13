package com.projetoCidade.citiesapi.service;

import com.projetoCidade.citiesapi.model.Country;
import com.projetoCidade.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public ResponseEntity<Country> findById(Long id) {
        Optional<Country> optional = countryRepository.findById(id);
        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else return (ResponseEntity<Country>) ResponseEntity.notFound();
    }
}
