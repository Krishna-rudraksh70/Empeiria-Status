package com.laptopcustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.laptopcustomer.model.Laptop;
import com.laptopcustomer.repository.LaptopRepository;

// @Primary
@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    @Autowired
    public LaptopServiceImpl(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @Override
    public void setupTable() {
        laptopRepository.createTable();
    }

    @Override
    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    @Override
    public void updateLaptop(Laptop laptop) {
        laptopRepository.update(laptop);
    }

    @Override
    public void deleteLaptop(int id) {
        laptopRepository.delete(id);
    }

    @Override
    public Laptop getLaptopById(int id) {
        return laptopRepository.findById(id);
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }
    
}