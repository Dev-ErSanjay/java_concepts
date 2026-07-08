package payment;

import config.Logger;

public class CardPayment implements Payment {

    Logger logger = Logger.getInstance();

    @Override
    public void pay(double amount) {

        logger.log("Payment completed using card : Rs" + amount);
    }

}
