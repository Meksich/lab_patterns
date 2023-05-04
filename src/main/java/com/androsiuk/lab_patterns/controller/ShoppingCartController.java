package com.androsiuk.lab_patterns.controller;

import com.androsiuk.lab_patterns.DTO.ShoppingCartDTO;
import com.androsiuk.lab_patterns.entity.ShoppingCart;
import com.androsiuk.lab_patterns.mapper.ShoppingCartMapper;
import com.androsiuk.lab_patterns.service.ShoppingCartService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/shopping_cart")
@AllArgsConstructor
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    private final ShoppingCartMapper shoppingCartMapper;

    @GetMapping(path = "/{id}")
    public ResponseEntity<ShoppingCartDTO> get(@PathVariable Integer id){
        return new ResponseEntity<>(shoppingCartMapper.map(shoppingCartService.get(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ShoppingCartDTO> create(@RequestBody ShoppingCart shoppingCart) {
        return new ResponseEntity<>(shoppingCartMapper.map(shoppingCartService.create(shoppingCart)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ShoppingCartDTO> update(@PathVariable Integer id, @RequestBody ShoppingCart shoppingCart) {
        return new ResponseEntity<>(shoppingCartMapper.map(shoppingCartService.update(id, shoppingCart)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ShoppingCartDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(shoppingCartMapper.map(shoppingCartService.delete(id)), HttpStatus.OK);
    }
}
