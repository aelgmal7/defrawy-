package com.example.defrawyV100.models;
import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ProductId;
    private String productName;
    private  String productType;
    private String productImgUrl;
    private String agencyName;
    private int reservationCounter;
    private int saleRatio;

    @ManyToOne
    private  Vendor vendor;

    public Product(Long productId, String productName, String productType, String productImgUrl, String agencyName, int reservationCounter, int saleRatio, Vendor vendor) {
        ProductId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productImgUrl = productImgUrl;
        this.agencyName = agencyName;
        this.reservationCounter = reservationCounter;
        this.saleRatio = saleRatio;
        this.vendor = vendor;
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

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setReservationCounter(int reservationCounter) {
        this.reservationCounter = reservationCounter;
    }

    public void setSaleRatio(int saleRatio) {
        this.saleRatio = saleRatio;
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

    public String getAgencyName() {
        return agencyName;
    }

    public int getReservationCounter() {
        return reservationCounter;
    }


    public int getSaleRatio() {
        return saleRatio;
    }
    public Product(){}

    public Product( String productName, String productType, String productImgUrl, String agencyName, int reservationCounter,int saleRatio) {
        this.productName = productName;
        this.productType = productType;
        this.productImgUrl = productImgUrl;
        this.agencyName = agencyName;
        this.reservationCounter = reservationCounter;
        
        this.saleRatio = saleRatio;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
