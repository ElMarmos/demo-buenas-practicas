package com.example.demo.service;

public interface ICrudService<T> {

    void create(T object);

    void delete(int id);

    T get(int id);
}
