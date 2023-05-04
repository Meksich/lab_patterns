package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.BuyerDTO;
import com.androsiuk.lab_patterns.entity.Buyer;
import org.springframework.stereotype.Component;

@Component
public class BuyerMapper implements Mapper<Buyer, BuyerDTO>{
    @Override
    public BuyerDTO map(Buyer buyer) {
        BuyerDTO.BuyerDTOBuilder buyerDTOBuilder = BuyerDTO.builder();
        buyerDTOBuilder.id(buyer.getId());
        buyerDTOBuilder.name(buyer.getName());
        buyerDTOBuilder.email(buyer.getEmail());
        buyerDTOBuilder.password(buyer.getPassword());
        return buyerDTOBuilder.build();
    }
}
