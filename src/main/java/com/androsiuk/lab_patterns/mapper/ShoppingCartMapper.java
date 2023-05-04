package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.ShoppingCartDTO;
import com.androsiuk.lab_patterns.entity.ShoppingCart;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper implements Mapper<ShoppingCart, ShoppingCartDTO>{
    @Override
    public ShoppingCartDTO map(ShoppingCart shoppingCart) {
        ShoppingCartDTO.ShoppingCartDTOBuilder shoppingCartDTOBuilder = ShoppingCartDTO.builder();
        shoppingCartDTOBuilder.id(shoppingCart.getId());
        shoppingCartDTOBuilder.totalPrice(shoppingCart.getTotalPrice());
        shoppingCartDTOBuilder.product_id(shoppingCart.getProduct().getId());
        return shoppingCartDTOBuilder.build();
    }
}
