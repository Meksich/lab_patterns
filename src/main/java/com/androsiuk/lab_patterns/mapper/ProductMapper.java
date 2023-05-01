package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.ProductDTO;
import com.androsiuk.lab_patterns.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<Product, ProductDTO>{
    @Override
    public ProductDTO map(Product product) {
        ProductDTO.ProductDTOBuilder productDTOBuilder = ProductDTO.builder();
        productDTOBuilder.id(product.getId());
        productDTOBuilder.name(product.getName());
        productDTOBuilder.category(product.getCategory());
        productDTOBuilder.description(product.getDescription());
        productDTOBuilder.isAvailable(product.getIsAvailable());
        productDTOBuilder.price(product.getPrice());
        productDTOBuilder.seller_id(product.getSeller().getId());
        return productDTOBuilder.build();
    }
}