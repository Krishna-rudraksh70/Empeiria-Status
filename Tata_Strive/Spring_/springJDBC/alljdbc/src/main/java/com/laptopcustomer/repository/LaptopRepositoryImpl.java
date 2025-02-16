package com.laptopcustomer.repository;

import java.util.List;

// import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.laptopcustomer.model.Laptop;

// @Primary
@Repository
public class LaptopRepositoryImpl implements LaptopRepository {

    private final JdbcTemplate jdbcTemplate;

    public LaptopRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Laptop> rowMapper = (rs, _) -> new Laptop(
            rs.getInt("id"),
            rs.getString("brand"),
            rs.getString("model"),
            rs.getDouble("price"),
            rs.getInt("customer_id"));

    @Override
    public void createTable() {
        jdbcTemplate.execute(
                "CREATE TABLE IF NOT EXISTS laptops (id INT PRIMARY KEY, brand VARCHAR(15), model VARCHAR(15), price DOUBLE, customer_id INT, FOREIGN KEY (customer_id) REFERENCES customer(id))");
    }

    @Override
    public void save(Laptop laptop) {
        jdbcTemplate.update("INSERT INTO laptops (id, brand, model, price, customer_id) VALUES (?, ?, ?, ?, ?)",
                laptop.getId(), laptop.getBrand(), laptop.getModel(), laptop.getPrice(), laptop.getCustomerId());
    }

    @Override
    public void update(Laptop laptop) {
        jdbcTemplate.update("UPDATE laptops SET brand = ?, model = ?, price = ?, customer_id = ? WHERE id = ?",
                laptop.getBrand(), laptop.getModel(), laptop.getPrice(), laptop.getCustomerId(), laptop.getId());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM laptops WHERE id = ?", id);
    }

    @Override
    public Laptop findById(int id) {
        return jdbcTemplate.query("SELECT * FROM laptops WHERE id = ?", rowMapper, id)
                .stream().findFirst().orElse(null);
    }

    @Override
    public List<Laptop> findAll() {
        return jdbcTemplate.query("SELECT * FROM laptops", rowMapper);
    }

}
