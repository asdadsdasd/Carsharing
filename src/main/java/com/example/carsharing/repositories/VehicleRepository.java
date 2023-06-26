package com.example.carsharing.repositories;

import com.example.carsharing.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);
}
