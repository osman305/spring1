package com.spring.repository;

import com.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
