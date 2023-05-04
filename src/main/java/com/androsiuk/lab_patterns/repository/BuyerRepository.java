package com.androsiuk.lab_patterns.repository;

import com.androsiuk.lab_patterns.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BuyerRepository extends JpaRepository<Buyer, Integer>{
}
