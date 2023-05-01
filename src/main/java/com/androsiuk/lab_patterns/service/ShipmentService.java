package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.entity.Shipment;
import com.androsiuk.lab_patterns.repository.ShipmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ShipmentService extends com.androsiuk.lab_patterns.service.Service<Shipment> {
    private ShipmentRepository shipmentRepository;
    @Override
    public JpaRepository<Shipment, Integer> getRepository() {
        return shipmentRepository;
    }
}
