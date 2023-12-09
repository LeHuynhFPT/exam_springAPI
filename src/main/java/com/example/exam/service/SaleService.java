package com.example.exam.service;


import com.example.exam.entity.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    List<Sale> getAllSale();

}
