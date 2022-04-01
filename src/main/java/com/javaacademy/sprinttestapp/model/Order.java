package com.javaacademy.sprinttestapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CustomerOrder")
public class Order {
    @Id
    @GeneratedValue
    private Integer orderId;
    private Date orderDate;
    private Date shippedDate;
    private String status;
    private String comments;
    @ManyToOne
    Customer customer;

    public Order(Integer orderId, Date orderDate, Date shippedDate, String status, String comments, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;

        this.customer = customer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
