package com.example.demo.controller;

import com.example.demo.service.impl.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class carsController {

    private final CarService carService;

    public carsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<?> getCars() {
        return ResponseEntity.ok(carService.getAll());
    }
}
