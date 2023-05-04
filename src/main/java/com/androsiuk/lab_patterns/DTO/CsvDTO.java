package com.androsiuk.lab_patterns.DTO;

import com.androsiuk.lab_patterns.enums.Availability;
import com.androsiuk.lab_patterns.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CsvDTO {
    private String name;
    private Double price;
    private Availability isAvailable;
    private Category category;
    private Integer seller_id;
}
