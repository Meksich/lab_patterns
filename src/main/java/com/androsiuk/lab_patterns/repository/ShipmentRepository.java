package com.androsiuk.lab_patterns.repository;

import com.androsiuk.lab_patterns.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
}
