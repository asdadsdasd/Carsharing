package com.example.carsharing.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Car {
    private Long id;
    private String name;
    private String brand;
    private String stateNumber;
    private int seat;
    private int productionYear;
    private Date purchaseDate;
    private float purchasePrice;
    private String status;
}
