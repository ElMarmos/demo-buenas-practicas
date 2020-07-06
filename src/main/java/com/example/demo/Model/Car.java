package com.example.demo.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public abstract class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    String plate;

    @Column
    String brand;

    @Column
    String type;

    @Column
    double basePrice;

    double price;

    Car(String plate, String brand, double basePrice, String type) {
        this.plate = plate;
        this.brand = brand;
        this.basePrice = basePrice;
        this.type = type;
    }

    public abstract double getSellingPrice();
}
