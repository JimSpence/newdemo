package com.example.demo2.controller;

import com.example.demo2.model.Country;
import com.example.demo2.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

//    @ApiOperation(value = "Fetch Countries")
    @GetMapping
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @GetMapping(value = "/{description}")
    public List<Country> findByDescription(@PathVariable String description) {
        return countryRepository.findByDescriptionStartsWith(description);
    }

    @PostMapping
    public Country save(@RequestBody Country country) {
        return countryRepository.save(country);
    }



}