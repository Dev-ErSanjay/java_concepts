package discount;

import config.Logger;

public class NormalDiscount implements DiscountStrategy {

    Logger logger = Logger.getInstance();

    @Override
    public double calculateDiscount(double amount) {

        logger.log("Applying normal customer discount");
        return amount * .1;
    }

}
