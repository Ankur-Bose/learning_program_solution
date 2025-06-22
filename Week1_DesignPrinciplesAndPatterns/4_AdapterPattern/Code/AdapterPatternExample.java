public class AdapterPatternExample {
    public static void main(String[] args) {
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(15000);

        RazorPayGateway razorpay = new RazorPayGateway();
        PaymentProcessor razorProcessor = new RazorPayAdapter(razorpay);
        razorProcessor.processPayment(20000);
    }
}