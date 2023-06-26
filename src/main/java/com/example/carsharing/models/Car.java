package com.example.carsharing.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.Year;

@Entity
@Table(name = "vehicle")
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
    @Column(name = "brand")
    private String brand;
    @Column(name = "state")
    private String stateNumber;
    @Column(name = "seat")
    private int seat;
    @Column(name = "production year")
    private int productionYear;
    @Column(name = "purchase date")
    private Date purchaseDate;
    @Column(name = "purchase price")
    private float purchasePrice;
    @Column(name = "status")
    private String status;
    @Column(name = "tonnage")
    private float tonnage;
}
