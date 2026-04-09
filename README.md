# Spring Security App

A simple Spring Boot application demonstrating **user authentication and authorization** with Spring Security.  
Built with modern practices using **Spring DevTools**, **Spring Web**, and **Spring Security** dependencies.

---

## 🚀 Features
- User login with Spring Security
- Role-based access control (e.g., `USER`, `ADMIN`)
- Secure endpoints with HTTP Basic and Form Login
- Hot reload support via Spring DevTools
- RESTful APIs using Spring Web

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Security**
- **Spring Web**
- **Spring DevTools**
- **Maven**

---

## 📦 Project Setup

### Prerequisites
- JDK 17+
- Maven 3.8+
- IDE (IntelliJ IDEA recommended)

### Steps
1. **Clone the repository:**
```bash
   git clone https://github.com/sugganabalaji/spring-security-app.git
   cd spring-security-app
```
2. **Build and run:**
```bash
  mvn spring-boot:run
```
3. **Access the app:**
- API: `http://localhost:8080/api/hello`
- Login: `http://localhost:8080/login`

---

## 🔑 Default Credentials

| Role   | Username | Password |
|--------|----------|----------|
| USER   | user     | password |
| ADMIN  | admin    | admin123 |

(You can configure these in `application.properties` or via `UserDetailsService`.)

---

## 📂 Project Structure
```properties
src/
 ├─ main/
 │   ├─ java/com/example/security/
 │   │   ├─ config/        # Security configuration
 │   │   ├─ controller/    # REST controllers
 │   │   └─ model/         # Domain models
 │   └─ resources/
 │       ├─ application.properties
 │       └─ static/        # Static assets
 ```
---

## 📖 Learning Highlights
- How to secure REST endpoints with Spring Security
- Configuring in‑memory authentication
- Using DevTools for rapid development
- Building a clean, recruiter‑ready Spring Boot project
 
---

## 🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you’d like to change.
