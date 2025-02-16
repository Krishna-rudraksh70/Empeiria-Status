package com.laptopcustomer.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.laptopcustomer.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    public CustomerRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Customer> rowMapper = (rs, _) -> new Customer(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("email"));

    @Override
    public void createTable() {
        jdbcTemplate.execute(
                "CREATE TABLE IF NOT EXISTS customer (id INT PRIMARY KEY, name VARCHAR(15), email VARCHAR(25))");
    }

    @Override
    public void save(Customer customer) {
        jdbcTemplate.update("INSERT INTO customer (id, name, email) VALUES (?, ?, ?)",
                customer.getId(), customer.getName(), customer.getEmail());
    }

    @Override
    public void update(Customer customer) {
        jdbcTemplate.update("UPDATE customer SET name = ?, email = ? WHERE id = ?",
                customer.getName(), customer.getEmail(), customer.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM customer WHERE id = ?", id);
    }

    @Override
    public Customer findById(int id) {
        return jdbcTemplate.query("SELECT * FROM customer WHERE id = ?", rowMapper, id)
                   .stream().findFirst().orElse(null);

    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", rowMapper);
    }

}
