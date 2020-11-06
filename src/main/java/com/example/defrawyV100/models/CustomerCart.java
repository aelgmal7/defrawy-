package com.example.defrawyV100.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerCart {
    @Id
    private Long id;

    @OneToOne
    private Customer customer;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_fk",referencedColumnName ="id")
    private List<Product> resrvedProduct;

    public CustomerCart(){};
    public CustomerCart(Long id, Customer customer, List<Product> resrvedProduct) {
        this.id = id;
        this.customer = customer;
        this.resrvedProduct = resrvedProduct;
    }
}
