import java.util.Arrays;

import model.Order;
import model.Product;
import model.User;
import service.OrderService;

public class OrderProcessingSystem {

    public static void main(String[] args) {

        User user = new User(1, "John", "john@gmail.com", "Delhi");

        Product phone = new Product(101, "One Plus", 16000.00, 2);
        Product charger = new Product(201, "Charger", 800.00, 3);
        Order order = new Order(501, user, Arrays.asList(phone, charger));

        OrderService service = new OrderService();

        service.createOrder(order);
    }

}