package discount;

public class DiscountContext {

    private DiscountStrategy strategy;

    public DiscountContext(DiscountStrategy strategy) {

        this.strategy = strategy;
    }

    public double executeStrategy(double amount) {

        return strategy.calculateDiscount(amount);
    }

}
