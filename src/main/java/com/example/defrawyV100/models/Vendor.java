package com.example.defrawyV100.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendorId;
    @Column
    private String vendorName;
    @Column
    private String vendorPassword;
    private int vendorPhoneNumber;

    public Vendor(List<Product> product) {
        this.product = product;
    }

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "vendor")
    private List<Product> product;



    public Vendor(Long vendorId, String vendorName, String vendorPassword, int vendorPhoneNumber, List<Product> product) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPassword = vendorPassword;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.product = product;
    }

    public Vendor() {

    }

    public Long getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public int getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public void setVendorPhoneNumber(int vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
