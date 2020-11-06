package com.example.defrawyV100.service;

import com.example.defrawyV100.db.CustomerCartRepo;
import com.example.defrawyV100.db.CustomerRepo;
import com.example.defrawyV100.db.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CustomerCartRepo customerCartRepo;
    @Autowired
    private CustomerRepo customerRepo;

}
