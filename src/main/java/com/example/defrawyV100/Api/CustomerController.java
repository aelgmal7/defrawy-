package com.example.defrawyV100.Api;

import com.example.defrawyV100.db.CustomerRepo;

import com.example.defrawyV100.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/customers/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }
    @GetMapping("customers")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

}
