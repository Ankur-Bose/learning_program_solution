# Hello World RESTful Web Service – Spring Learn Application

## 📋 Problem Statement

Write a REST service in the Spring Learn application that returns the text `Hello World!!` using Spring Web Framework.

**Endpoint Details:**

| Method | URL      | Controller Class                                       | Method Name  |
| ------ | -------- | ------------------------------------------------------ | ------------ |
| GET    | `/hello` | `com.cognizant.springlearn.controller.HelloController` | `sayHello()` |

**Sample Request:**

```
GET http://localhost:8083/hello
```

**Sample Response:**

```
Hello World!!
```

---

## 🚀 Steps to Implement

### 1️⃣ Create `HelloController.java`

✅ Create a class in the specified package:

```java
package com.cognizant.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("START: sayHello()");
        String message = "Hello World!!";
        System.out.println("END: sayHello()");
        return message;
    }
}
```

✅ Notes:

- Use `@RestController` so the response is written directly to the HTTP response body.
- Annotate the method with `@GetMapping("/hello")` to map it to the `/hello` URL.
- Add `start` and `end` logs in the method.

---

### 2️⃣ Run the Application

✅ Start your Spring Boot application (or deploy it on Tomcat if not using Spring Boot).

✅ Open browser and go to: [http://localhost:8083/hello](http://localhost:8083/hello)

✅ You should see:

```
Hello World!!
```

✅ You can also test the same in Postman.

---

## 📸 Output

✅ When testing in **Chrome Browser**, you will see `Hello World!!` in the page.

✅ When testing in **Postman**, you will also see `Hello World!!` in the response body.

---

## 📄 Screenshots

✅ Console output
![alt text](screenshots\Output-console.png)

✅ Google output.
![alt text](screenshots\Output-google.png)

✅ Postman output.
![alt text](screenshots\Output-postman.png)


---

# 💡 SME Notes

### 🌟 Viewing HTTP Headers in Browser

✅ Open Chrome → Right-click → Inspect → Network tab. ✅ Refresh the page → Click on `/hello` request. ✅ Check **Headers** tab in the right pane. ✅ Observe request and response headers such as `Content-Type`, `Date`, `Content-Length`, etc.

### 🌟 Viewing HTTP Headers in Postman

✅ In Postman, send a GET request to `http://localhost:8083/hello`. ✅ Click on the **Headers** tab in the response section. ✅ You’ll see key-value pairs for response headers.

---

## 📚 References

- [Spring Boot REST Example](https://spring.io/guides/gs/rest-service/)
- [Spring MVC Annotations](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-annotated-controllers)

---