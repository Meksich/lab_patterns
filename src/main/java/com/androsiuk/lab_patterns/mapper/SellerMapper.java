package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.SellerDTO;
import com.androsiuk.lab_patterns.entity.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerMapper implements Mapper<Seller, SellerDTO>{
    @Override
    public SellerDTO map(Seller seller) {
        SellerDTO.SellerDTOBuilder sellerDTOBuilder = SellerDTO.builder();
        sellerDTOBuilder.id(seller.getId());
        sellerDTOBuilder.name(seller.getName());
        sellerDTOBuilder.email(seller.getEmail());
        sellerDTOBuilder.password(seller.getPassword());
        sellerDTOBuilder.accountBalance(seller.getAccountBalance());
        sellerDTOBuilder.workSince(seller.getWorkSince());
        return sellerDTOBuilder.build();
    }
}
