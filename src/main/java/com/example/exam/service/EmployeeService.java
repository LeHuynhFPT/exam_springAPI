package com.example.exam.service;


import com.example.exam.entity.Employee;
import com.example.exam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> getAllSales() {
        return employeeRepository.findAll();
    }

}
