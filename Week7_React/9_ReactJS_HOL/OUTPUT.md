# 📘 ES6 (ECMAScript 2015) Hands-on Lab

This document introduces the key features of **ECMAScript 6 (ES6)**, explains the use of modern JavaScript keywords like `let` and `const`, explores classes and inheritance, arrow functions, and new data structures like `Set` and `Map`. It also provides hands-on tasks to help developers apply these concepts in real-world scenarios.

---

## 🧾 Table of Contents

- [Features of ES6](#features-of-es6)
- [JavaScript let](#javascript-let)
- [Difference between var and let](#difference-between-var-and-let)
- [JavaScript const](#javascript-const)
- [ES6 Class Fundamentals](#es6-class-fundamentals)
- [ES6 Class Inheritance](#es6-class-inheritance)
- [ES6 Arrow Functions](#es6-arrow-functions)
- [ES6 Set and Map](#es6-set-and-map)
- [Hands-on Lab Tasks](#hands-on-lab-tasks)

---

## 🔹 Features of ES6

- Block-scoped variables using `let` and `const`
- Arrow functions for shorter function syntax
- Template literals for string formatting
- Destructuring assignment for arrays and objects
- Classes and inheritance for OOP in JavaScript
- Default function parameters
- Modules (`import` and `export`)
- New data structures: `Set` and `Map`

---

## 🟢 JavaScript let

`let` allows you to declare **block-scoped variables**.

```javascript
let count = 10;
if (true) {
    let count = 20; 
    console.log(count); // 20
}
console.log(count); // 10
```

- Block-scoped
- Cannot be redeclared in the same block
- Hoisted but **not initialized**

---

## 🔄 Difference between var and let

| Feature       | var                          | let                         |
|---------------|-----------------------------|-----------------------------|
| Scope         | Function-scoped              | Block-scoped                |
| Hoisting      | Hoisted & initialized to `undefined` | Hoisted but not initialized |
| Redeclaration | Allowed                      | Not allowed in same block    |

---

## 🔵 JavaScript const

`const` is used to declare **block-scoped constants** that cannot be reassigned.

```javascript
const PI = 3.14159;
const obj = { name: "John" };
obj.name = "Doe"; // Allowed
// PI = 3.14; ❌ Error
```

- Must be initialized during declaration
- Values cannot be reassigned
- Object properties can still be modified

---

## 🏗️ ES6 Class Fundamentals

ES6 introduces a cleaner way to implement **object-oriented programming**.

```javascript
class Person {
    constructor(name) {
        this.name = name;
    }
    greet() {
        return `Hello, ${this.name}!`;
    }
}
```

---

## 🏛️ ES6 Class Inheritance

Classes can inherit properties and methods using `extends` and `super()`.

```javascript
class Student extends Person {
    constructor(name, grade) {
        super(name);
        this.grade = grade;
    }
}

const student = new Student("Alice", "A");
console.log(student.greet()); // Hello, Alice!
```

---

## ⚡ ES6 Arrow Functions

Arrow functions provide a **shorter syntax** and **lexical `this` binding**.

```javascript
const add = (a, b) => a + b;
console.log(add(2, 3)); // 5
```

- Concise syntax
- Does not bind its own `this`
- Great for callbacks

---

## 📦 ES6 Set and Map

### **Set**
- Stores **unique values**
```javascript
const numbers = new Set([1, 2, 2, 3]);
console.log(numbers); // Set {1, 2, 3}
```

### **Map**
- Stores **key-value pairs** with any data type as keys
```javascript
const userRoles = new Map();
userRoles.set("Alice", "Admin");
console.log(userRoles.get("Alice")); // Admin
```

---

## 🧪 Hands-on Lab Tasks

1. Use **`map()`** to transform an array of numbers by doubling each value.
2. Apply **arrow functions** to simplify a function returning the sum of two numbers.
3. Implement **destructuring** to extract object properties into variables.
4. Create a **class `Car`** with properties and methods, then **extend** it to create an `ElectricCar`.
5. Demonstrate **Set and Map usage** to store unique data and key-value pairs.

---

## Output
![screenshot](screenshots/screenshot1.png)
![screenshot](screenshots/screenshot2.png)

---

> ✨ This lab provides a foundation for writing modern, clean, and efficient JavaScript using ES6 features.
