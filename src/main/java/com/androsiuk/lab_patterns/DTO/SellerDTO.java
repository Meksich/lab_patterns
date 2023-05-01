package com.androsiuk.lab_patterns.DTO;

import lombok.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerDTO {
    private Integer id;
    private Double accountBalance;
    private String name;
    private String email;
    private String password;
    private Date workSince;
}
