package com.example.carsharing.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name="cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "brnad")
    private String brand;
    @Column(name = "state_number")
    private String stateNumber;
    @Column(name = "seat")
    private int seat;
    @Column(name = "production_year")
    private int productionYear;
    @Column(name = "purchase_date")
    private Date purchaseDate;
    @Column(name = "purchase_price")
    private float purchasePrice;
    @Column(name = "status")
    private String status;
}
