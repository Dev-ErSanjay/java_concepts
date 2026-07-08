package service;

import model.Order;
import model.Product;

public class OrderService {

    public void createOrder(Order order) {

        double amount = calculateAmount(order);
        order.setTotalAmount(amount);

        System.out.println("Order created successfully ... ");
        System.out.println("Customer : " + order.getUser().getName());
        System.out.println("Total amount : " + order.getTotalAmount());
        System.out.println("Status : " + order.getStatus());

    }

    public double calculateAmount(Order order) {

        double total = 0;

        for (Product product : order.getProducts())
            total += product.getPrice() * product.getQuantity();

        return total;
    }

}
