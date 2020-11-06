package com.example.defrawyV100.service;

import com.example.defrawyV100.db.VendorRepo;
import com.example.defrawyV100.models.Product;
import com.example.defrawyV100.models.Vendor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VendorService {
    @Autowired
    private VendorRepo vendorRepo;
    public void setVendorProducts(){
        Vendor byId = vendorRepo.findById(2L).orElse(null);
        Product product = new Product();
         Product product1 = new Product();

        List<Product> products = Arrays.asList(product, product1);
        byId.setProduct(products);

    }
}
