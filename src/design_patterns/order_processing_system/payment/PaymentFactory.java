package payment;

public class PaymentFactory {

    public static Payment getPayment(String type) {

        if (type == null)
            return null;

        switch (type.toUpperCase()) {

            case "UPI":
                return new UpiPayment();

            case "CARD":
                return new CardPayment();

            case "WALLET":
                return new WalletPayment();

            default:
                throw new RuntimeException("Invalid payment type");
        }
    }

}
