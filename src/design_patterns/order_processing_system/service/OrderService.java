package service;

import config.Logger;
import discount.DiscountContext;
import discount.PremiumDiscount;
import model.Order;
import model.Product;
import payment.Payment;
import payment.PaymentFactory;

public class OrderService {

    private Logger logger = Logger.getInstance();

    public void createOrder(Order order) {

        double amount = calculateAmount(order);
        DiscountContext discountContext = new DiscountContext(new PremiumDiscount());
        double discount = discountContext.executeStrategy(amount);
        double finalAmount = amount - discount;

        order.setTotalAmount(finalAmount);

        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(finalAmount);

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
