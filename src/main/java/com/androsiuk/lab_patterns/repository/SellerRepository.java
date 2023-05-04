package com.androsiuk.lab_patterns.repository;

import com.androsiuk.lab_patterns.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
}