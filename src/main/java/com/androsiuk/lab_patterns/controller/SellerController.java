package com.androsiuk.lab_patterns.controller;

import com.androsiuk.lab_patterns.DTO.SellerDTO;
import com.androsiuk.lab_patterns.entity.Seller;
import com.androsiuk.lab_patterns.mapper.SellerMapper;
import com.androsiuk.lab_patterns.service.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/seller")
@AllArgsConstructor
public class SellerController {
    private final SellerService sellerService;
    private final SellerMapper sellerMapper;

    @GetMapping(path = "/{id}")
    public ResponseEntity<SellerDTO> get(@PathVariable Integer id){
        return new ResponseEntity<>(sellerMapper.map(sellerService.get(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SellerDTO> create(@RequestBody Seller seller) {
        return new ResponseEntity<>(sellerMapper.map(sellerService.create(seller)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<SellerDTO> update(@PathVariable Integer id, @RequestBody Seller seller) {
        return new ResponseEntity<>(sellerMapper.map(sellerService.update(id, seller)), HttpStatus.OK);
    }
}
