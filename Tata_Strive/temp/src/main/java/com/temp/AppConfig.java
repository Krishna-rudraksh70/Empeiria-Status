package com.temp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.temp.service.CustomerService;
import com.temp.service.LaptopService;

@Configuration
@ComponentScan(basePackages = "SpringJDBC.Spring") // streotype annotation -  @Service , @Component , @Repository , @Setter
public class AppConfig {
	@Bean
	public DataSource ds() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3679/temp", "rudrakri", "synapse");
		
	}
	@Bean
	public JdbcTemplate js() {
		return new JdbcTemplate(ds());
	}
	@Bean("laptopSer")
	public LaptopService ls() {
		LaptopService l = new LaptopService();
        l.setJdbctemplate(js());
		return l;
	}
	@Bean("customerSer")
	public CustomerService cs() {
		CustomerService c = new CustomerService();
		c.setJdbctemplate(js());
		return c;
	}
}