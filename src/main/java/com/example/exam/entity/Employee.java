package com.example.exam.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long employeeId;

    private String employeeName;
    private String designation;
    private double salary;
}
