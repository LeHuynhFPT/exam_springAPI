package com.example.exam.controller;

import com.example.exam.entity.Sale;
import com.example.exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("sales")
public class SalesController {
    @Autowired
    private SaleService saleService;
    @GetMapping("getallsales")
    public String getAll(ModelMap modelMap){
        String view="listsales";
        try{
            List<Sale> sales = saleService.getAllSale();
            modelMap.addAttribute("sales",sales);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return view;
    }
}
