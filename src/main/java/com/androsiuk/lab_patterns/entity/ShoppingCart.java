package com.androsiuk.lab_patterns.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "shopping_cart")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="total_price", nullable = false)
    private Double totalPrice;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Product product;
}
