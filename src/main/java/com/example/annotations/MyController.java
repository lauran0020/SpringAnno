package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private CityRepo cityRepo;

    @GetMapping(value="/getAllCities")
    public @ResponseBody List<City> getAllCities() {
        return cityRepo.findAll();
    }

    @GetMapping(value="/getCityById/{id}")
    public @ResponseBody City getCityById(@PathVariable Long id) {
        return cityRepo.findById(id).get();
    }

    @DeleteMapping(value="/deleteCityById")
    public ResponseEntity deleteById(@RequestParam(value="id") Long id) {
        cityRepo.deleteById(id);
        return new ResponseEntity("id " + id + " deleted", HttpStatus.OK);
    }
}