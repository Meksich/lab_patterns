package com.androsiuk.lab_patterns.entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="address", nullable = false)
    private String address;

    @Column(name="quantity", nullable = false)
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id", nullable = false)
    private ShoppingCart shoppingCart;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "id", nullable = false)
    private Buyer buyer;
}
