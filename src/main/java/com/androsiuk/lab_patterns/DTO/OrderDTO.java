package com.androsiuk.lab_patterns.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Integer id;
    private String address;
    private Integer quantity;
    private Integer shoppingCart_id;
    private Integer buyer_id;
}
