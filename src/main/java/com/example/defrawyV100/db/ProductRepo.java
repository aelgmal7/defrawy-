package com.example.defrawyV100.db;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.defrawyV100.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
//    @Query("SELECT * FROM PRODUCT  WHERE ON_SALE_STATE")
//    public List<Product> findByOnSaleState();
    public List<Product> findAllByVendor(String vendor);
}