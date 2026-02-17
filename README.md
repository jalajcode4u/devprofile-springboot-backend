# DevProfile – Spring Boot Backend

A Spring Boot REST API backend built using Java, Spring Data JPA, and MySQL.  
This project demonstrates clean architecture, DTO pattern, and real-world backend development practices.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL 8
- Maven
- REST APIs
- Git & GitHub

---

## 🏗 Project Structure

src/main/java/com/example/devprofile
├── controller # REST controllers
├── service # Business logic
├── repository # JPA repositories
├── entity # JPA entities
├── dto # Request & Response DTOs
└── DevprofileApplication.java




---

## 📌 Features

- Create User API
- Fetch All Users API
- DTO-based request & response handling
- MySQL database integration
- Clean layered architecture
- Tested using curl/Postman

---

## 🔗 API Endpoints

### ➤ Create User
**POST** `/api/users`

```json
{
  "name": "Jalaj",
  "email": "jalaj@gmail.com",
  "password": "******"
}
