public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Ankur Bose"));
        context.executePayment(1500.00);

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment("ankurbose124@example.com"));
        context.executePayment(750.00);
    }
}
