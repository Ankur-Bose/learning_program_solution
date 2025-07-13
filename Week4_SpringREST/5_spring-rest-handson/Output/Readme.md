# REST - Get All Countries Web Service – Spring Learn Application

## 📋 Problem Statement

Write a REST service in the Spring Learn application that returns **all countries** using Spring Web Framework.

**Endpoint Details:**

| Method | URL          | Controller Class                                         | Method Name         |
| ------ | ------------ | -------------------------------------------------------- | ------------------- |
| GET    | `/countries` | `com.cognizant.springlearn.controller.CountryController` | `getAllCountries()` |

**Sample Request:**

```
GET http://localhost:8083/countries
```

**Sample Response:**

```json
[
  { "code": "IN", "name": "India" },
  { "code": "US", "name": "United States" },
  { "code": "JP", "name": "Japan" },
  { "code": "DE", "name": "Germany" }
]
```

---

## 🚀 Steps to Implement

### 1️⃣ Provided Files

From the uploaded files, the implementation already exists:

#### ✅ `CountryController.java`

```java
package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
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
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml") // ✅ important!
public class SpringlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlearnApplication.class, args);
    }
}
```

---

### 2️⃣ Notes

- The `@RestController` ensures the `List<Country>` is automatically converted to JSON.
- The `@GetMapping("/countries")` maps the HTTP GET request.
- The `countryList` bean is loaded from `country.xml`.
- No explicit logging in the uploaded code — recommend adding debug logs in `getAllCountries()` if required.

---

## 📸 Output

✅ When testing in **Chrome Browser**, you will see the JSON response:

```json
[
  { "code": "IN", "name": "India" },
  { "code": "US", "name": "United States" },
  { "code": "JP", "name": "Japan" },
  { "code": "DE", "name": "Germany" }
]
```

✅ When testing in **Postman**, you will see the same JSON response.

---

## 📄Screenshots

![alt text](screenshots\Output-postman.png)

---

# 💡 SME Notes

### 🌟 What happens in the controller method?

✅ Spring receives the HTTP GET request for `/countries`. ✅ The `getAllCountries()` method is invoked. ✅ The `countryList` bean is fetched from `country.xml` using the `ApplicationContext`. ✅ The list of countries is returned and serialized into JSON.

### 🌟 How is the bean converted into JSON?

✅ Since we use `@RestController`, Spring uses an HTTP message converter (like Jackson) to automatically serialize the list of `Country` objects into JSON.

### 🌟 Viewing HTTP Headers in Browser

✅ Open Chrome → Right-click → Inspect → Network tab → Refresh → Click `/countries` request → Check **Headers** tab to see request and response headers.

### 🌟 Viewing HTTP Headers in Postman

✅ In Postman, send a GET request to `http://localhost:8083/countries`. ✅ Click on the **Headers** tab in the response section to view HTTP response headers.

---

## 📚 References

- [Spring Boot REST Example](https://spring.io/guides/gs/rest-service/)
- [Spring MVC Annotations](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-annotated-controllers)
- [Jackson JSON Processor](https://github.com/FasterXML/jackson)

---