package com.example.demo2.repository;

import com.example.demo2.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

    public List<Country> findByDescriptionStartsWith(String description);
}
