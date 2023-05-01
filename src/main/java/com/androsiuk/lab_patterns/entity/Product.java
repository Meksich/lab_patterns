package com.androsiuk.lab_patterns.entity;

import com.androsiuk.lab_patterns.enums.Availability;
import com.androsiuk.lab_patterns.enums.Category;
import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price", nullable = false)
    private Double price;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="is_available", nullable = false)
    private Availability isAvailable;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="category", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "id", nullable = false)
    private Seller seller;

}
