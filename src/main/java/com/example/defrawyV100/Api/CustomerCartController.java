package com.example.defrawyV100.Api;

import com.example.defrawyV100.db.CustomerCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerCartController {
    @Autowired
    private CustomerCartRepo customerCartRepo;

//    @PostMapping("cart/addtocart")
//    public Product addToCart(@RequestBody Product product, @RequestBody Customer customer){
//        CustomerCart x= new CustomerCart(customer,)
//
//        return
//    }
}
