package discount;

import config.Logger;

public class PremiumDiscount implements DiscountStrategy {

    Logger logger = Logger.getInstance();

    @Override
    public double calculateDiscount(double amount) {

        logger.log("Applying premium customer discount");
        return amount * .25;
    }

}
