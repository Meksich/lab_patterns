package com.androsiuk.lab_patterns.DTO;

import com.androsiuk.lab_patterns.enums.Availability;
import com.androsiuk.lab_patterns.enums.Category;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Availability isAvailable;
    private Category category;
    private Integer seller_id;

}
