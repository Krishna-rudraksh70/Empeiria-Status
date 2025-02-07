package com.laptopcustomer.repository;

import java.util.List;

import com.laptopcustomer.model.Customer;

public interface CustomerRepository {
    void createTable();

    void save(Customer customer);

    void update(Customer customer);

    void delete(int id);

    Customer findById(int id);

    List<Customer> findAll();
}