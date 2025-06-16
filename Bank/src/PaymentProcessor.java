public class PaymentProcessor {
    private final String cardNumber;
    private final double amount;

    public PaymentProcessor(String cardNumber, double amount) {
        this.cardNumber = maskCardNumber( cardNumber );
        this.amount = amount;
    }

    private String maskCardNumber(String cardNumber) {
        return "****_****_****_" + cardNumber.substring(cardNumber.length() - 4);
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " from card " + cardNumber);
    }
}
