public class RazorPayAdapter implements PaymentProcessor{
    private RazorPayGateway razorpay;

    public RazorPayAdapter(RazorPayGateway razorpay) {
        this.razorpay = razorpay;
    }

    
    @Override
    public void processPayment(double amount){
        razorpay.pay(amount);
    }
    
}
