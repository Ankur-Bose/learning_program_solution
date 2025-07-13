package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }
}
