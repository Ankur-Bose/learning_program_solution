
# DependencyInjectionExample

This Java project demonstrates **constructor-based Dependency Injection** in a simple customer management application.

## 📁 Project Structure

```
DependencyInjectionExample/
├── Customer.java
├── CustomerRepository.java
├── CustomerRepositoryImpl.java
├── CustomerService.java
└── Main.java
```

## 📦 Classes Overview

### 1. Customer.java
Represents a customer with `id` and `name` fields.

### 2. CustomerRepository.java
An interface defining the method `findCustomerById(int id)`.

### 3. CustomerRepositoryImpl.java
Implements the `CustomerRepository` interface using a `HashMap` to store multiple customers.

### 4. CustomerService.java
Depends on `CustomerRepository`. Uses constructor injection to receive the dependency and provides a method to display customer information.

### 5. Main.java
Tests the functionality by injecting `CustomerRepositoryImpl` into `CustomerService` and retrieving multiple customers.

## ▶️ How to Run

1. Compile all `.java` files:
```bash
javac *.java
```

2. Run the application:
```bash
java Main
```

## ✅ Sample Output
```
Customer ID: 101, Name: Ankur Bose
Customer ID: 102, Name: Sumit Das
Customer ID: 103, Name: Abhram David
Customer with ID 999 not found.
```

## 🧠 Concepts Demonstrated
- Dependency Injection
- Interface-based design
- Inversion of Control (IoC)
- Clean code architecture

---

## Screenshot
![Output 1](screenshots/output.png)