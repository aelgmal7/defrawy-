package com.example.defrawyV100.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToMany(targetEntity =Product.class,cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName ="id")
    private List<Product> resrvedProduct;

    public CustomerCart(){};
    public CustomerCart(Long id, Customer customer, List<Product> resrvedProduct) {
        this.id = id;
        this.customer = customer;
        this.resrvedProduct = resrvedProduct;
    }

}
