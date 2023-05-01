package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.entity.Buyer;
import com.androsiuk.lab_patterns.repository.BuyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuyerService extends com.androsiuk.lab_patterns.service.Service<Buyer> {
    private BuyerRepository buyerRepository;
    @Override
    public JpaRepository<Buyer, Integer> getRepository() {
        return buyerRepository;
    }
}
