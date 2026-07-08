package payment;

import config.Logger;

public class WalletPayment implements Payment {

    Logger logger = Logger.getInstance();

    @Override
    public void pay(double amount) {

        logger.log("Payment completed using wallet : Rs" + amount);
    }

}
