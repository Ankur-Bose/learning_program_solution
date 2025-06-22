
# 💳 Adapter Pattern - Payment Gateway Integration (Java)

## 📘 Problem Statement

We are building a **Payment Processing System** that integrates with multiple third-party gateways like **Paypal** and **RazorPay**, each having a different interface. Using the **Adapter Pattern**, we provide a unified interface to process payments.

---

## 🏗️ Project Structure

```
AdapterPatternExample/
│
├── PaymentProcessor.java          # Target interface
├── PayPalGateway.java             # Adaptee 1 (Paypal)
├── RazorPayGateway.java           # Adaptee 2 (RazorPay)
├── PayPalAdapter.java             # Adapter for PayPal Gateway
├── RazorPayAdapter.java           # Adapter for RazorPay
└── Main.java                      # Test class
```

---

## 🧩 Design

- `PaymentProcessor`: Target interface expected by the client.
- `PayPalGateway` and `RazorPayGateway`: Third-party libraries with incompatible interfaces.
- `PayPalAdapter` and `RazorPayAdapter`: Adapters that convert gateway-specific APIs to the target interface.

---

## 🧪 Code

### `PaymentProcessor.java`
```java
public interface PaymentProcessor {
    void processPayment(double amount);
}
```

### `PayPalGateway.java`
```java
public class PayPalGateway {
    public void makePayment(String currency, double amount){
        System.out.println("Paid "+amount+" "+currency+ " using PayPal");
    }
}
```

### `RazorPayGateway.java`
```java
public class RazorPayGateway {
    public void pay(double amount){
        System.out.println("Charged Rs "+amount+" using RazorPay ");
    }
}
```

### `PayPalAdapter.java`
```java
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }
    

    @Override
    public void processPayment(double amount){
        paypal.makePayment("Rs", amount);
    }
}
```

### `RazorPayAdapter.java`
```java
public class RazorPayAdapter implements PaymentProcessor {
    private RazorPayGateway razorPay;

    public RazorPayAdapter(RazorPayGateway razorPay) {
        this.razorPay = razorPay;
    }

    @Override
    public void processPayment(double amount) {
        razorPay.payViaRazor(amount);
    }
}
```

### `AdapterPatternExample.java`
```java
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
```

---

## 🖥️ Sample Output

```
Paid 15000.0 Rs using PayPal
Charged Rs 20000.0 using RazorPay
```

---

## ✅ Conclusion

The Adapter Pattern allows our system to interact with different payment gateways via a unified interface (`PaymentProcessor`). This pattern is especially helpful when dealing with third-party libraries with incompatible interfaces.