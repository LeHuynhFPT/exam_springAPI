package com.example.exam.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "sale")

public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long slNo;

    private Long salesmanID;

    @ManyToOne
    private Product product;

    private String salesmanName;
    private LocalDate dos;
}
