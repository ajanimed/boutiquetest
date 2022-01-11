package com.ajanimed.boutique.repositories;

import com.ajanimed.boutique.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM PRODUCT p",
            nativeQuery = true)
    List<Product> findTopProducts();
}

