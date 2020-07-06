package com.example.demo.loader;

import com.example.demo.Model.Car;
import com.example.demo.Model.ElectricCar;
import com.example.demo.repositories.CarRepository;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Configuration
public class CarsLoader {

    private final CarRepository carRepository;

    public CarsLoader(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    private void loadCars() {
        Car car1 = new ElectricCar("ABC-001", "Mazda", 30000000, "ELECTRIC");
        Car car2 = new ElectricCar("ABC-002", "Mazda", 30000000, "GASOLINE");
        Car car3 = new ElectricCar("ABD-001", "Hyundai", 30000000, "ELECTRIC");
        Car car4 = new ElectricCar("ABD-002", "Hyundai", 30000000, "GASOLINE");
        Car car5 = new ElectricCar("ABE-001", "Toyota", 30000000, "ELECTRIC");
        Car car6 = new ElectricCar("ABE-002", "Toyota", 30000000, "GASOLINE");
        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6);
        carRepository.saveAll(cars);
    }
}
