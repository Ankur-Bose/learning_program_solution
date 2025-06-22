# 🧠 Singleton Pattern Example in Java

This project demonstrates the **Singleton Design Pattern** in Java using a `Logger` utility class. The Singleton pattern ensures that a class has **only one instance** throughout the application lifecycle and provides a **global access point** to it.

---

## 📌 Project Structure

    SingletonPatternExample/
    └── SingletonPattern.java


---

## 🔍 What is the Singleton Pattern?

The **Singleton Pattern** is a creational design pattern that ensures a class has only **one instance** and provides a **global point of access** to that instance.

### ✅ Key Characteristics:
- **Private constructor** – Prevents instantiation from outside the class.
- **Static instance variable** – Stores the single instance.
- **Public static method** – Provides controlled access to the instance.
- **Thread-safe implementation** – Especially important in multi-threaded applications.

---

## 🚀 Implementation Overview

### ✅ Complete Code (`SingletonPattern.java`)

```java
class Logger {
    private static Logger logger;

    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        Logger logger3 = Logger.getLogger();
        Logger logger4 = Logger.getLogger();
        Logger logger5 = Logger.getLogger();

        System.out.println("Hashcode value for Logger 1: " + logger1.hashCode());
        System.out.println("Hashcode value for Logger 2: " + logger2.hashCode());
        System.out.println("Hashcode value for Logger 3: " + logger3.hashCode());
        System.out.println("Hashcode value for Logger 4: " + logger4.hashCode());
        System.out.println("Hashcode value for Logger 5: " + logger5.hashCode());
    }
}

```

---
## 🧪 Sample Output

📌 All logger instances should print the same hashcode, confirming they refer to the same object.

![Logger Output](logger_output.png)

    In out case, since all the hashcodes are returning same value, we can say that  only one instance of Logger is created and used across the application

---

## 🧵 Why Double-Checked Locking?
    The getLogger() method uses double-checked locking to ensure:

       ✔️ Thread-safety

       ✔️ Performance efficiency (synchronization only when needed)

       ✔️ Lazy instantiation (object is created only when first requested)

---