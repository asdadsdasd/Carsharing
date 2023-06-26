package com.example.carsharing.services;

import com.example.carsharing.models.Car;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private long id = 0;
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(++id, "RAV4", "Toyota", "BH459T", 5, 2019, new Date(2020, 02, 23), 1500000, "Свободна"));
        cars.add(new Car(++id, "JUK", "Nissan", "EM202P",2, 2013, new Date(2019, 11, 8), 900000, "В работе"));
    }

    public List<Car> listCars() {
        return cars;
    }

    public void saveCar(Car car){
        car.setId(++id);
        cars.add(car);
    }

    public void deleteCar(Long id){
        cars.removeIf(car -> car.getId().equals(id));
    }

    public Car getCarById(Long id) {
        for(Car car : cars){
            if (car.getId().equals(id)) return car;
        }
        return  null;
    }
}
