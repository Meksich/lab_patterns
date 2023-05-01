package com.androsiuk.lab_patterns.controller;


import com.androsiuk.lab_patterns.entity.Shipment;
import com.androsiuk.lab_patterns.service.ShipmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/shipment")
@AllArgsConstructor
public class ShipmentController {
    private final ShipmentService shipmentService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Shipment> get(@PathVariable Integer id){
        return new ResponseEntity<>(shipmentService.get(id), HttpStatus.OK);
    }
}
