package com.example.exam.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long prodID;

    private String prodName;
    private String description;
    private LocalDate dateOfManf;
    private double price;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;



}
