package com.laptopcustomer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int customerId;

}
