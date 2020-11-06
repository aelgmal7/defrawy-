package com.example.defrawyV100.db;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.defrawyV100.models.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
