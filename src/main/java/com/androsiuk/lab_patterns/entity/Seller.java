package com.androsiuk.lab_patterns.entity;

import lombok.*;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "seller")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="account_balance", nullable = false)
    private Double accountBalance;

    @Column(name="name")
    private String name;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="work_since", nullable = false)
    private Date workSince;

    @OneToMany(mappedBy = "seller", fetch = FetchType.LAZY)
    private Set<Product> products;
}
