package com.ajanimed.boutique.services;

import com.ajanimed.boutique.entities.Product;
import com.ajanimed.boutique.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> productList = productRepository.findTopProducts();
        return productList;
    }

    public void addProduct(Product p){
        productRepository.save(p);
    }
}
