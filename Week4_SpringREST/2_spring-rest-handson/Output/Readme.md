# Spring Core – Load Country from Spring Configuration XML

## 📋 Problem Statement

An airline website needs to support booking for four countries. A dropdown on the homepage lets users select their country. We also need to store the two-character ISO code of each country.

**Countries Data:**

| Code | Name          |
| ---- | ------------- |
| US   | United States |
| DE   | Germany       |
| IN   | India         |
| JP   | Japan         |

You will store the data in a Spring XML configuration file, read it into a Java application using Spring, and display the details.

---

## 🚀 Steps to Implement

### 1️⃣ Create `country.xml`

Pick any one country and configure it in `country.xml`.

```xml
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN" />
    <property name="name" value="India" />
</bean>
```

---

### 2️⃣ Create `Country` Class

✅ Instance variables:

```java
private String code;
private String name;
```

✅ Empty constructor with debug log:

```java
public Country() {
    LOGGER.debug("Inside Country Constructor.");
}
```

✅ Getters and Setters with debug logs:

```java
public String getCode() {
    LOGGER.debug("Getting code");
    return code;
}

public void setCode(String code) {
    LOGGER.debug("Setting code");
    this.code = code;
}

public String getName() {
    LOGGER.debug("Getting name");
    return name;
}

public void setName(String name) {
    LOGGER.debug("Setting name");
    this.name = name;
}
```

✅ `toString()` method:

```java
@Override
public String toString() {
    return "Country [code=" + code + ", name=" + name + "]";
}
```

---

### 3️⃣ Create `SpringLearnApplication.java`

Add a method `displayCountry()` to load and display the country:

```java
public static void displayCountry() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = context.getBean("country", Country.class);
    LOGGER.debug("Country : {}", country);
}
```

In `main()` method:

```java
public static void main(String[] args) {
    displayCountry();
}
```

---

## 📸 Output

✅ Run `SpringLearnApplication.java` and observe the logs:

- Inside Country Constructor.
- Setting code
- Setting name
- Getting code/name when accessed
- Final `toString()` output of country

---

## 📄 Screenshot

![alt text](screenshots\Output4.png)

---

# 💡 SME Notes

### 🌟 What is `<bean>`?

Defines a bean (object) in the Spring container.

#### Attributes:

- **id** — Unique name to identify the bean.
- **class** — Fully qualified class name of the bean.

### 🌟 What is `<property>`?

Used to set a property of a bean by invoking the setter method.

#### Attributes:

- **name** — Name of the property.
- **value** — Value to assign.

---

## 📝 ApplicationContext & ClassPathXmlApplicationContext

- **ApplicationContext**: Central interface to Spring’s IoC container. Responsible for instantiating, configuring, and assembling beans.

- **ClassPathXmlApplicationContext**: Concrete implementation of ApplicationContext that loads configuration from an XML file in the classpath.

---

## 🔍 What happens on `context.getBean()`?

✔️ Spring container:

- Searches for the bean with the given ID.
- Instantiates the bean if not already created.
- Injects all dependencies (via constructor or setters).
- Returns the fully initialized bean to the caller.

---

## 📚 References

- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)
- [Spring Beans and Dependency Injection](https://spring.io/guides/gs/handling-form-submission/)

---

