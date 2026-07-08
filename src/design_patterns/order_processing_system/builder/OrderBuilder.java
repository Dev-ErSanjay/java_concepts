package builder;

import java.time.LocalDateTime;
import java.util.List;

import model.Order;
import model.Product;
import model.User;

public class OrderBuilder {

    private int orderId;
    private User user;
    private List<Product> products;
    private double totalAmount;
    private String status;
    private LocalDateTime createdDateTime;

    public OrderBuilder orderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder user(User user) {
        this.user = user;
        return this;
    }

    public OrderBuilder products(List<Product> products) {
        this.products = products;
        return this;
    }

    public OrderBuilder totalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public OrderBuilder status(String status) {
        this.status = status;
        return this;
    }

    public OrderBuilder createdDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    public Order build() {
        if (status == null) {
            status = "CREATED";
        }
        if (createdDateTime == null) {
            createdDateTime = LocalDateTime.now();
        }
        return new Order(this);
    }

    // getters for Order class

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

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}