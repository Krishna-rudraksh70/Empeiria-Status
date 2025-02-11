package com.temp.util;

// import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	private long Cid;
	private String Cus_Name;
	private String Cus_Address;
	private String Contact;
//	private List<Laptop> laptops; 
	
}