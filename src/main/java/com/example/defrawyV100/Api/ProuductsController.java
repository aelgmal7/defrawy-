package com.example.defrawyV100.Api;

import java.util.List;
import java.util.Optional;

import com.example.defrawyV100.db.ProductRepo;
import com.example.defrawyV100.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProuductsController {


    private ProductRepo productRepo;
    @Autowired
    public ProuductsController(  ProductRepo productRepo) {

        this.productRepo = productRepo;
    }


//    @GetMapping("/")
//    public List<Product> getAllProducts(){
//        return productRepo.findAll();
//    }

        @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
    //get one product by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productRepo.findById(id);
    }
    //save new product
    @PostMapping(path="/saveNewProduct")
    public List<Product> setNewProduct(@RequestBody Product p){
        productRepo.save(p);

        return  productRepo.findAll();
    }


    @PostMapping(path="/saveProduct")
    public  List<Product>  setNewProduct(@RequestBody List<Product> p){


        return  productRepo.findAll();
    }



    //delete prodcut from database
    @DeleteMapping("/delete/{id}")
    public List<Product> removeProduct(@PathVariable Long id){
       Product x= productRepo.findById(id).orElse(null);
        productRepo.delete(x);
        return productRepo.findAll();
    }
    //update product info;
    @PutMapping("/update/{id}")
    public List<Product> updateProduct(@RequestBody Product pro, @PathVariable Long id){
        Product nonUpdated_Product= productRepo.findById(id).orElse(null);
        nonUpdated_Product.setProductImgUrl(pro.getProductImgUrl());
        nonUpdated_Product.setAgencyName(pro.getAgencyName());
        nonUpdated_Product.setProductName(pro.getProductName());
        nonUpdated_Product.setProductType(pro.getProductType());
        productRepo.delete(nonUpdated_Product);
        productRepo.save(nonUpdated_Product);
        return productRepo.findAll();
    }

}

