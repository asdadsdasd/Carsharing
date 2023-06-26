package com.example.carsharing.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private Long id;
    private String name;
    private String brand;
    private int seat;
    private int productionYear;
    private float purchasePrice;
}
