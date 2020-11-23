package com.example.defrawyV100.models;
import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ProductId;
    private String productName;
    private  String productType;
    private String productImgUrl;
    private boolean onSaleState;
    private int reservationCounter;

    @ManyToOne
    private  Vendor vendor;



    @ManyToMany
    private List<CustomerCart> customerCart;


    public Product(){}
    public Product(Long productId, String productName, String productType, String productImgUrl, int reservationCounter, boolean onSaleSate, Vendor vendor, List<CustomerCart> customerCart) {
        ProductId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productImgUrl = productImgUrl;
        this.reservationCounter = reservationCounter;
        this.onSaleState = onSaleSate;
        this.vendor = vendor;
        this.customerCart = customerCart;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }


    public void setReservationCounter(int reservationCounter) {
        this.reservationCounter = reservationCounter;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public void setOnSaleState(boolean onSaleState) {
        this.onSaleState = onSaleState;
    }

    public List<CustomerCart> getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(List<CustomerCart> customerCart) {
        this.customerCart = customerCart;
    }

    public Long getProductId() {
        return ProductId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public int getReservationCounter() {
        return reservationCounter;
    }

    public Vendor getVendor() {
        return vendor;
    }

}
