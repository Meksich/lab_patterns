package com.androsiuk.lab_patterns.entity;

import com.androsiuk.lab_patterns.enums.Status;
import lombok.*;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "shipment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name="shipped")
    private Date shipped;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private Status status;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private Order order;
}
