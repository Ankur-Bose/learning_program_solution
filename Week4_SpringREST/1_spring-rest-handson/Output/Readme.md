
# 👨‍🏫 SME Walkthrough: Spring Web Project Structure

This document provides a detailed walkthrough of the key structural and configuration components of the `spring-learn` Spring REST project.

---

## 1. 📁 `src/main/java` – Application Code

This folder contains all your main Java source code, including:

- `com.cognizant.springlearn.SpringLearnApplication` – The main class that boots the application.
- Controller, Service, Model, and Repository packages can also be created here to structure the app following layered architecture.
---

## 4. 🔧 `SpringLearnApplication.java` – Main Class Walkthrough

```java
@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Spring Boot Application Started");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Spring Boot Application Ended");
	}
}
```
---

## 5. 🧩 `@SpringBootApplication` – Purpose

This is a meta-annotation that includes:

- `@Configuration`: Declares the class as a source of Spring bean definitions.
- `@EnableAutoConfiguration`: Enables Spring Boot's auto-configuration mechanism.
- `@ComponentScan`: Scans the current package and subpackages for Spring components (like `@Controller`, `@Service`, etc.).

✅ It simplifies bootstrapping by replacing these three annotations.


---

## 6. 📄 `pom.xml` – Maven Configuration

Defines:

- **Project Info:** `groupId`, `artifactId`, `version`
- **Dependencies:** Spring Boot Starter Web, DevTools
- **Build plugins:** Spring Boot Maven Plugin
- **Repositories & properties** (optional)

### Example Sections:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
</dependencies>
```

📸 _Insert screenshot of `pom.xml` file_

---

## 7. 🧬 Dependency Hierarchy in Eclipse

To view:

1. Open `pom.xml` in IntelliJ.
2. Click on the **Dependency Hierarchy** tab at the bottom.
3. Expand modules to view transitive dependencies.

This shows how Spring Boot starters pull in required libraries like Jackson, Tomcat, Spring MVC, etc.

![Alt Text](screenshots\output-structure.png)

---
## 8. 🧬 Output

![Alt Text](screenshots\output-1.png)

---


