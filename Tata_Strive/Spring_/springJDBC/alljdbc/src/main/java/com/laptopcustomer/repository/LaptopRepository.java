package com.laptopcustomer.repository;

import java.util.List;

import com.laptopcustomer.model.Laptop;

public interface LaptopRepository {
    void createTable();

    void save(Laptop laptop);

    void update(Laptop laptop);

    void delete(int id);

    Laptop findById(int id);

    List<Laptop> findAll();
}