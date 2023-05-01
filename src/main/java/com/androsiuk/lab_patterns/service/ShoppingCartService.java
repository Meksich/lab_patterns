package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.entity.ShoppingCart;
import com.androsiuk.lab_patterns.repository.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ShoppingCartService extends com.androsiuk.lab_patterns.service.Service<ShoppingCart> {
    private ShoppingCartRepository shoppingCartRepository;
    @Override
    public JpaRepository<ShoppingCart, Integer> getRepository() {
        return shoppingCartRepository;
    }
}