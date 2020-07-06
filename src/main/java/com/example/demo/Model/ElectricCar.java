package com.example.demo.Model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class ElectricCar extends Car {

    public ElectricCar(String plate, String brand, double basePrice, String type) {
        super(plate, brand, basePrice, type);
    }

    public ElectricCar(Car car) {
        super(car.plate, car.brand, car.basePrice, car.getType());
    }

    @Override
    public double getSellingPrice() {
        return this.basePrice * 1.4;
    }
}
