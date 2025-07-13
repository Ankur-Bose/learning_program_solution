# REST - Country Web Service – Spring Learn Application

## 📋 Problem Statement

Write a REST service in the Spring Learn application that returns **India country details** using Spring Web Framework.

**Endpoint Details:**

| Method | URL        | Controller Class                                         | Method Name         |
| ------ | ---------- | -------------------------------------------------------- | ------------------- |
| GET    | `/country` | `com.cognizant.springlearn.controller.CountryController` | `getCountryIndia()` |

**Sample Request:**

```
GET http://localhost:8083/country
```

**Sample Response:**

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## 🚀 Steps to Implement

### 1️⃣ Provided Files

From the uploaded files, the implementation already exists:

#### ✅ `CountryController.java`

```java
package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        return country;
    }
}
```

#### ✅ `Country.java`

```java
package com.cognizant.springlearn.model;

public class Country {
    private String code;
    private String name;

    public Country() {}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

#### ✅ `SpringlearnApplication.java`

```java
package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlearnApplication.class, args);
    }
}
```

---

### 2️⃣ Notes

- The `@RestController` ensures the `Country` object is automatically converted to JSON.
- The `@RequestMapping("/country")` maps the HTTP GET request.
- The `country` bean is loaded from `country.xml`.
- No explicit logging in the uploaded code — recommend adding debug logs in `getCountryIndia()` if required.

---

## 📸 Output

✅ When testing in **Chrome Browser**, you will see the JSON response:

```json
{
  "code": "IN",
  "name": "India"
}
```

✅ When testing in **Postman**, you will see the same JSON response.

---

## 📄 Places to Add Screenshots

📌 Below are suggested places where you can include screenshots of the output and code:

![alt text](screenshots\Output-postman.png)
- 🖼️ Postman output.

---

# 💡 SME Notes

### 🌟 What happens in the controller method?

✅ Spring receives the HTTP GET request for `/country`. ✅ The `getCountryIndia()` method is invoked. ✅ A Spring ApplicationContext is created and the `country` bean is fetched from `country.xml`. ✅ The bean is returned and serialized into JSON.

### 🌟 How is the bean converted into JSON?

✅ Since we use `@RestController`, Spring uses an HTTP message converter (like Jackson) to automatically serialize the `Country` object into JSON.

### 🌟 Viewing HTTP Headers in Browser

✅ Open Chrome → Right-click → Inspect → Network tab → Refresh → Click `/country` request → Check **Headers** tab to see request and response headers.

### 🌟 Viewing HTTP Headers in Postman

✅ In Postman, send a GET request to `http://localhost:8083/country`. ✅ Click on the **Headers** tab in the response section to view HTTP response headers.

---

## 📚 References

- [Spring Boot REST Example](https://spring.io/guides/gs/rest-service/)
- [Spring MVC Annotations](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-annotated-controllers)
- [Jackson JSON Processor](https://github.com/FasterXML/jackson)

---