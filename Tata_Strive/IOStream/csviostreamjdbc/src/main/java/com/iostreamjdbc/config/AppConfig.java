package com.iostreamjdbc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.iostreamjdbc")
@EnableTransactionManagement
public class AppConfig {
    
}