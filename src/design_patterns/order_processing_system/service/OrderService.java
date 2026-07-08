package service;

import config.Logger;
import model.Order;
import model.Product;

public class OrderService {

    private Logger logger = Logger.getInstance();

    public void createOrder(Order order) {

        double amount = calculateAmount(order);
        order.setTotalAmount(amount);

        logger.log("Order created successfully ... ");
        logger.log("Customer : " + order.getUser().getName());
        logger.log("Total amount : " + order.getTotalAmount());
        logger.log("Status : " + order.getStatus());

    }

    public double calculateAmount(Order order) {

        double total = 0;

        for (Product product : order.getProducts())
            total += product.getPrice() * product.getQuantity();

        return total;
    }

}
