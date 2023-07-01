package com.example.carsharing.services;

import com.example.carsharing.models.Car;

import com.example.carsharing.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private long id = 0;
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(++id, "RAV4", "Toyota", "BH459T", 5, 2019, new Date(2020, 02, 23), 1500000, "Свободна"));
        cars.add(new Car(++id, "JUK", "Nissan", "EM202P",2, 2013, new Date(2019, 11, 8), 900000, "В работе"));
    }

    public List<Car> listCars(String brand) {
        if(brand != null) return carRepository.findByBrand(brand);
        return carRepository.findAll();
    }

    public void saveCar(Car car){
        log.info("Saving new {}", car);
        carRepository.save(car);
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
}
