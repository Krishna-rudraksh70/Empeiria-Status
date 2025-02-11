package com.temp.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
	private long lid;
	private String modal;
	private String brand;
	private Customer customerId; 
}