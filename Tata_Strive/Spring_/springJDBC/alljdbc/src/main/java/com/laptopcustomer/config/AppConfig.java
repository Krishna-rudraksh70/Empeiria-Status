package com.laptopcustomer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import com.laptopcustomer.repository.LaptopRepository;
import com.laptopcustomer.repository.LaptopRepositoryImpl;
import com.laptopcustomer.service.LaptopService;
import com.laptopcustomer.service.LaptopServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.laptopcustomer")
@Import(DatabaseConfig.class)
public class AppConfig {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean
    public LaptopRepository laptopRepository() {
        return new LaptopRepositoryImpl(jdbcTemplate);
    }

    @Bean
    public LaptopService laptopService() {
        return new LaptopServiceImpl(laptopRepository());
    }

}