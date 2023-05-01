package com.androsiuk.lab_patterns.controller;

import com.androsiuk.lab_patterns.DTO.BuyerDTO;
import com.androsiuk.lab_patterns.entity.Buyer;
import com.androsiuk.lab_patterns.mapper.BuyerMapper;
import com.androsiuk.lab_patterns.service.BuyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/customer_profile")
@AllArgsConstructor
public class BuyerController {
    private final BuyerService buyerService;
    private final BuyerMapper buyerMapper;

    @GetMapping(path = "/{id}")
    public ResponseEntity<BuyerDTO> get(@PathVariable Integer id){
        return new ResponseEntity<>(buyerMapper.map(buyerService.get(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BuyerDTO> create(@RequestBody Buyer buyer) {
        return new ResponseEntity<>(buyerMapper.map(buyerService.create(buyer)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<BuyerDTO> update(@PathVariable Integer id, @RequestBody Buyer buyer) {
        return new ResponseEntity<>(buyerMapper.map(buyerService.update(id, buyer)), HttpStatus.OK);
    }
}
