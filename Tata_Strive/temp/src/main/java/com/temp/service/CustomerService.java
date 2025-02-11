package com.temp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.temp.util.Customer;

import lombok.Setter;
@Setter
@Service
public class CustomerService {
	@Autowired
	private JdbcTemplate jdbctemplate;
	public void createTable() {
		jdbctemplate.update("CREATE TABLE if not exists Customer (cid BIGINT PRIMARY KEY, c_name VARCHAR(20), c_address VARCHAR(40), contact VARCHAR(30))");
	}
	public int saveCustomer(Customer customer) {
		Object args[] = { customer.getCid(), customer.getCus_Name(), customer.getCus_Address(),customer.getContact() };
		int res = jdbctemplate.update("INSERT INTO customer (cid, c_name, c_address, contact) VALUES (?, ?, ?, ?);", args);
		return res;
	}
}