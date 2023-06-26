package com.example.carsharing.services;

import com.example.carsharing.models.Car;
import com.example.carsharing.repositories.VehicleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {
    private final VehicleRepository vehicleRepository;

    public List<Car> listCars(String brand) {
        if (brand != null) vehicleRepository.findByBrand(brand);
        return vehicleRepository.findAll();
    }

    public void saveCar(Car car){
        log.info("Saving new {}", car);
        vehicleRepository.save(car);
    }

    public void deleteCar(Long id){
        vehicleRepository.deleteById(id);
    }

    public Car getCarById(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }
}
