package com.laptopcustomer.service;

import java.util.List;

import com.laptopcustomer.model.Laptop;

public interface LaptopService {
    void setupTable();

    void addLaptop(Laptop laptop);

    void updateLaptop(Laptop laptop);

    void deleteLaptop(int id);

    Laptop getLaptopById(int id);

    List<Laptop> getAllLaptops();
}
