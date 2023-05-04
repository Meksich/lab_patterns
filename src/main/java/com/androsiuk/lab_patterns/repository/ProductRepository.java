package com.androsiuk.lab_patterns.repository;

import com.androsiuk.lab_patterns.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}