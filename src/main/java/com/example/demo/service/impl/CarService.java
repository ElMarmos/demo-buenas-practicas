package com.example.demo.service.impl;

import com.example.demo.Model.Car;
import com.example.demo.factory.CarFactory;
import com.example.demo.repositories.CarRepository;
import com.example.demo.service.ICarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarService implements ICarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void create(Car car) {
        carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car get(int id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public List<Car> getAll() {
        return StreamSupport.stream(carRepository.findAll().spliterator(), false).map(CarFactory::getCarType).filter(Objects::nonNull).peek(car -> car.setPrice(car.getSellingPrice())).collect(Collectors.toList());
    }
}
