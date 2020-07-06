package com.example.demo.factory;

import com.example.demo.Model.Car;
import com.example.demo.Model.ElectricCar;
import com.example.demo.Model.GasolineCar;

public class CarFactory {

    public static Car getCarType(Car car) {
        if (car.getType().equals("ELECTRIC")) {
            return new ElectricCar(car);
        }
        if (car.getType().equals("GASOLINE")) {
            return new GasolineCar(car);
        }
        return null;
    }
}
