package model;

import java.time.LocalDateTime;
import java.util.List;

import builder.OrderBuilder;

public class Order {

    private int orderId;
    private User user;
    private List<Product> products;
    private double totalAmount;
    private String status;
    private LocalDateTime createdDateTime;

    public Order(OrderBuilder builder) {
        this.orderId = builder.getOrderId();
        this.user = builder.getUser();
        this.products = builder.getProducts();
        this.totalAmount = builder.getTotalAmount();
        this.status = builder.getStatus();
        this.createdDateTime = builder.getCreatedDateTime();
    }

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}