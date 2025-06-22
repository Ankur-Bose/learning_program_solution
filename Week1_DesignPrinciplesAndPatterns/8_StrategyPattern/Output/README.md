# StrategyPatternExample

This Java project demonstrates the **Strategy Design Pattern** using a payment system as the context. 
It allows runtime selection of different payment methods like **Credit Card** and **PayPal**.

## 📂 Project Structure

```
StrategyPatternExample/
│
├── PaymentStrategy.java
├── CreditCardPayment.java
├── PayPalPayment.java
├── PaymentContext.java
└── Main.java
```

## 🧠 Strategy Pattern

This project uses the **Strategy Pattern** to encapsulate different payment algorithms and make them interchangeable.

## 📦 Components

### 1. `PaymentStrategy` (Interface)
Defines the strategy interface with a `pay()` method.

### 2. `CreditCardPayment` (Concrete Strategy)
Implements payment using a credit card.

### 3. `PayPalPayment` (Concrete Strategy)
Implements payment using PayPal.

### 4. `PaymentContext` (Context)
Holds a reference to a `PaymentStrategy` and delegates payment execution.

### 5. `Main` (Test Class)
Demonstrates selecting and using different payment strategies at runtime.

## ▶️ Sample Output

```
Paid ₹1500.0 using Credit Card. CardHolder: Ankur Bose
Paid ₹750.0 using PayPal. Email: ankurbose124@example.com
```

## 🖼 Screenshot Placeholder

![screenshot](screenshots/output.png)

## 🚀 How to Run

1. Clone or download this repository.
2. Open in any Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run `Main.java`.
