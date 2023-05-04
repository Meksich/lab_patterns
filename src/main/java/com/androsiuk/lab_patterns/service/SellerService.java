package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.entity.Seller;
import com.androsiuk.lab_patterns.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class SellerService extends com.androsiuk.lab_patterns.service.Service<Seller> {
    private SellerRepository sellerRepository;
    @Override
    public JpaRepository<Seller, Integer> getRepository() {
        return sellerRepository;
    }
}