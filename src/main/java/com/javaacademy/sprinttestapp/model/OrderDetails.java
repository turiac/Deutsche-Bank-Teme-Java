package com.javaacademy.sprinttestapp.model;

public class OrderDetails {
    private Integer id;
    private String productCode;
    private int quantity;
    private double priceEach;

    public OrderDetails(Integer id, String productCode, int quantity, double priceEach) {
        this.id = id;
        this.productCode = productCode;
        this.quantity = quantity;
        this.priceEach = priceEach;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }
}
