package com.androsiuk.lab_patterns.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoppingCartDTO {
    private Integer id;
    private Double totalPrice;
    private Integer product_id;
}
