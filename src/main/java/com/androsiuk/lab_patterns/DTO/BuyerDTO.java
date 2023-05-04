package com.androsiuk.lab_patterns.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuyerDTO {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
