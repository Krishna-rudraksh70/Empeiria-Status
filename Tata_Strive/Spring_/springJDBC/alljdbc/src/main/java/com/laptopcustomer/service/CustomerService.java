package com.laptopcustomer.service;

import java.util.List;

import com.laptopcustomer.model.Customer;

public interface CustomerService {
    void setupTable();

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(int id);

    Customer getCustomerById(int id);

    List<Customer> getAllCustomers();
}