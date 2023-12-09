package com.example.exam.controller;

import com.example.exam.entity.Product;
import com.example.exam.entity.Sale;
import com.example.exam.service.ProductService;
import com.example.exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("products")
public class ProductsController {
    @Autowired
    private ProductService productService;
    @GetMapping("getallproducts")
    public String getAll(ModelMap modelMap){
        String view="listproducts";
        try{
            List<Product> products = productService.getAllProduct();
            modelMap.addAttribute("products",products);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return view;
    }
}
