package com.ajanimed.boutique.controllers;

import com.ajanimed.boutique.entities.Product;
import com.ajanimed.boutique.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product p){
        productService.addProduct(p);
    }

    @GetMapping("/list")
    @CrossOrigin(origins = "http://localhost:4200/")
    public List<Product> getListOfProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
