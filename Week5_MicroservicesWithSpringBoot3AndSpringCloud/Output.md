
# 🏦 Microservices: Account & Loan

This project has two independent Spring Boot microservices:

- **Account Service** → runs on port `8080`
- **Loan Service** → runs on port `8081`

---

## 📦 Account Service

### Controller
```java
@RestController
public class AccountController {
    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "savings",
            "balance", 234343
        );
    }
}
```

### Output
Request:
```
GET http://localhost:8080/accounts/00987987973432
```

Response:
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

---

## 📦 Loan Service

### Controller
```java
@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        return Map.of(
            "number", number,
            "type", "car",
            "loan", 400000,
            "emi", 3258,
            "tenure", 18
        );
    }
}
```

### Output
Request:
```
GET http://localhost:8081/loans/H00987987972342
```

Response:
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```
