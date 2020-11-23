package com.example.defrawyV100.models;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long customerID;
    @Column
    private String customerName;
    @Column
    private String customerPassword;
    @Column
    private int customerPhoneNumber;
    @Column
    private int customerInvitationCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    public Customer(){}


    public Customer(Long customerID, String customerName, String customerPassword, int customerPhoneNumber, int customerInvitationCode) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerInvitationCode = customerInvitationCode;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getCustomerInvitationCode() {
        return customerInvitationCode;
    }

    public void setCustomerInvitationCode(int customerInvitationCode) {
        this.customerInvitationCode = customerInvitationCode;
    }

}
