package com.androsiuk.lab_patterns.repository;

import com.androsiuk.lab_patterns.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
}
