package com.example.defrawyV100.service;

import com.example.defrawyV100.db.CustomerCartRepo;
import com.example.defrawyV100.db.CustomerRepo;
import com.example.defrawyV100.db.ProductRepo;
import com.example.defrawyV100.db.VendorRepo;
import com.example.defrawyV100.models.Product;
import com.example.defrawyV100.models.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private VendorRepo vendorRepo;
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CustomerCartRepo customerCartRepo;
    @Autowired
    private CustomerRepo customerRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();

    }
//    public List<Product> gelAllOfers(){
//        return productRepo.findByOnSaleState();
//    }
    public List<String> getAllVendorsName(){
        List<String> x=null;
          vendorRepo.findAll().forEach(vendor1 -> {
              x.add(vendor1.getVendorName());
          });
        return x;
    }
    public List<Product> getAllProductsOfSpacificVendorByName(String vendor){

        return productRepo.findAllByVendor(vendor);
    }


}
