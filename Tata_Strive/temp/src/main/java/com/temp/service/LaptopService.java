package com.temp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.temp.util.Laptop;

import lombok.Setter;

@Setter
@Service
public class LaptopService {
	@Autowired
	private JdbcTemplate jdbctemplate ;
//	= new JdbcTemplate(getDS());

	// public LaptopService(JdbcTemplate js) {
    //     this.jdbctemplate = js;
    // }
	public int saveLaptop(Laptop laptop) {
		long customerId = laptop.getCustomerId().getCid(); 
		int res = jdbctemplate.update("INSERT INTO laptop (lid, model, brand, customerid) values(?,?,?,?)", 
										laptop.getLid(), 
										laptop.getModal(), 
										laptop.getBrand(), 
										customerId);
		return res;
	}
	
	public void createTable() {
		jdbctemplate.update("CREATE TABLE if not exists Laptop (lid BIGINT PRIMARY KEY, model VARCHAR(20), brand VARCHAR(20), customerId BIGINT, FOREIGN KEY (customerId) REFERENCES Customer(cid))");
	}
	
	
//	public List<Laptop> allrec(){
//		return jdbctemplate.query("select * from laptop", new RowMapperClass());
//	}
	public List<Laptop> allrec(){
		return jdbctemplate.query("select * from laptop", (rs,rowNum)->{
			Laptop _laptop = new Laptop();
			_laptop.setLid(rs.getLong(1));
			_laptop.setModal(rs.getString(2));
			_laptop.setBrand(rs.getString(3));
			return _laptop;
		});
	}
//	@SuppressWarnings("unused")
//	private DataSource getDS(){
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setUrl("jdbc:mysql://localhost:3306/bank");
//		ds.setUsername("root");
//		ds.setPassword("12345678");
//		return ds;
//	}
}