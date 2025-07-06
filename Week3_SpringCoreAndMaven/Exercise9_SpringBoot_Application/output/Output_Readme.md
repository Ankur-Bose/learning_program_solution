
# 📚 Spring Boot Book Application - API Output Samples

This README provides sample API calls and expected outputs for your Spring Boot `Book` application.  
Use these examples for testing with **Postman**, **curl**, or integrating into your frontend.

---

## ✅ Add a Book

**Request**
```
POST http://localhost:8080/books
Content-Type: application/json

{
  "id": 1,
  "title": "Spring in Action",
  "author": "Craig Walls"
}
```

**Expected Response**
```json
{
  "id": 1,
  "title": "Spring in Action",
  "author": "Craig Walls"
}
```

---

## ✅ Get All Books

**Request**
```
GET http://localhost:8080/books
```

**Expected Response**
```json
[
  {
    "id": 1,
    "title": "Spring in Action",
    "author": "Craig Walls"
  }
]
```

---

## ✅ Get Book by ID

**Request**
```
GET http://localhost:8080/books/1
```

**Expected Response**
```json
{
  "id": 1,
  "title": "Spring in Action",
  "author": "Craig Walls"
}
```

---

## ✅ Update Book

**Request**
```
PUT http://localhost:8080/books/1
Content-Type: application/json

{
  "id": 1,
  "title": "Spring Boot Essentials",
  "author": "Ankur Bose"
}
```

**Expected Response**
```json
{
  "id": 1,
  "title": "Spring Boot Essentials",
  "author": "Ankur Bose"
}
```

---

## ✅ Delete Book

**Request**
```
DELETE http://localhost:8080/books/1
```

**Expected Response**
```
Book deleted successfully.
```

---

> Replace `localhost:8080` with your actual backend server if different.
