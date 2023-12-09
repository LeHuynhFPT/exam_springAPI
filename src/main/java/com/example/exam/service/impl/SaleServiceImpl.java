package com.example.exam.service.impl;


import com.example.exam.entity.Sale;
import com.example.exam.repository.SaleRepository;
import com.example.exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;


    @Override
    public List<Sale> getAllSale() {
        return saleRepository.findAll();
    }
}
