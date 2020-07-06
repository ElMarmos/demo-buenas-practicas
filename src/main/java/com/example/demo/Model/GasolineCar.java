package com.example.demo.Model;

public class GasolineCar extends Car {

    public GasolineCar(Car car) {
        super(car.plate, car.brand, car.basePrice, car.getType());
    }

    @Override
    public double getSellingPrice() {
        return this.basePrice;
    }
}
