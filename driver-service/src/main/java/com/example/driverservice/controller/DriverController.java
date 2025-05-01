\package com.example.driverservice.controller;

import com.example.driverservice.model.Driver;
import com.example.driverservice.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;

    @GetMapping("/{id}")
    public Driver getDriver(@PathVariable Long id) {
        return driverRepository.findById(id).orElse(null);
    }
}