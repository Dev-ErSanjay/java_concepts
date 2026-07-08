package model;

import java.time.LocalDateTime;

import java.util.List;

public class Order {

    private int orderId;
    private User user;
    private List<Product> products;
    private double totalAmount;
    private String status;
    private LocalDateTime createdDate;

    public Order(int orderId, User user, List<Product> products) {

        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.status = "CREATED";
        this.createdDate = LocalDateTime.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
}