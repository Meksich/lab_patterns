package com.androsiuk.lab_patterns.mapper;

import com.androsiuk.lab_patterns.DTO.CsvDTO;
import com.androsiuk.lab_patterns.DTO.ProductDTO;
import com.androsiuk.lab_patterns.entity.Product;
import com.androsiuk.lab_patterns.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductMapper implements Mapper<Product, ProductDTO>{
    private final SellerService sellerService;
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

    public Product map(CsvDTO csvDTO) {
        return new Product(csvDTO.getName(), csvDTO.getPrice(), csvDTO.getIsAvailable(),
                csvDTO.getCategory(), sellerService.get(csvDTO.getSeller_id()));
    }
}