package com.androsiuk.lab_patterns.controller;

import com.androsiuk.lab_patterns.DTO.OrderDTO;
import com.androsiuk.lab_patterns.entity.Order;
import com.androsiuk.lab_patterns.mapper.OrderMapper;
import com.androsiuk.lab_patterns.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping(value = "/order")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @GetMapping(path = "/{id}")
    public ResponseEntity<OrderDTO> get(@PathVariable Integer id){
        return new ResponseEntity<>(orderMapper.map(orderService.get(id)), HttpStatus.OK);
    }

    @GetMapping(path = "/{buyer_id}")
    public ResponseEntity<List<OrderDTO>> getBuyersOrders(@PathVariable Integer buyer_id){
        List<OrderDTO> dtoList = orderService.getBuyersOrders(buyer_id).stream().map(orderMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> create(@RequestBody Order order) {
        return new ResponseEntity<>(orderMapper.map(orderService.create(order)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<OrderDTO> update(@PathVariable Integer id, @RequestBody Order order) {
        return new ResponseEntity<>(orderMapper.map(orderService.update(id, order)), HttpStatus.OK);
    }
}
