package com.androsiuk.lab_patterns.controller;

import com.androsiuk.lab_patterns.DTO.ProductDTO;
import com.androsiuk.lab_patterns.entity.Product;
import com.androsiuk.lab_patterns.mapper.ProductMapper;
import com.androsiuk.lab_patterns.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping(value = "/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll() {
        List<ProductDTO> dtoList = productService.getAll().stream().map(productMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> get(@PathVariable Integer id){
        return new ResponseEntity<>(productMapper.map(productService.get(id)), HttpStatus.OK);
    }

    @GetMapping(path = "/{seller_id}")
    public ResponseEntity<List<ProductDTO>> getSellersProducts(@PathVariable Integer seller_id){
        List<ProductDTO> dtoList = productService.getSellersProducts(seller_id).stream().map(productMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/read-products-csv")
    public ResponseEntity<List<ProductDTO>> getProductsFromCsvFile(){
        List<Product> dtoList = productService.getProductsFromCsvFile().stream().map(productMapper::map).toList();
        return new ResponseEntity<>(dtoList.stream().map(productMapper::map).toList(), HttpStatus.OK);
    }

    @GetMapping(path = "/write-products-csv-to-db")
    public ResponseEntity<List<Product>> writeProductsFromCsvToDb(){
        return new ResponseEntity<>(productService.writeCsvToDb(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody Product product) {
        return new ResponseEntity<>(productMapper.map(productService.create(product)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Integer id, @RequestBody Product product) {
        return new ResponseEntity<>(productMapper.map(productService.update(id, product)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(productMapper.map(productService.delete(id)), HttpStatus.OK);
    }

}
