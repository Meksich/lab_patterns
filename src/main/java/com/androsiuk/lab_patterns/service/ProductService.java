package com.androsiuk.lab_patterns.service;

import com.androsiuk.lab_patterns.DTO.CsvDTO;
import com.androsiuk.lab_patterns.csv_config.CsvConfig;
import com.androsiuk.lab_patterns.entity.Product;
import com.androsiuk.lab_patterns.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ProductService extends com.androsiuk.lab_patterns.service.Service<Product> {
    private ProductRepository productRepository;

    @Override
    public JpaRepository<Product, Integer> getRepository() {
        return productRepository;
    }

    public List<Product> getSellersProducts(Integer seller_id){
        List<Product> productList = getAll();
        productList.removeIf((product -> (!product.getSeller().getId().equals(seller_id))));
        return productList;
    }

    public List<CsvDTO> getProductsFromCsvFile() {
        List<CsvDTO> dtoList = CsvConfig.readProductsFromCsv();
        return dtoList;
    }
}