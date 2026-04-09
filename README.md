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
## 🔑 Default Login

When the application starts, Spring Security generates a random password for the `user` account.  
Check the console logs for a line like:

- Using generated security password: `25da3012-10b1-43ed-8e0c-fabf34feab6c`


- **Username:** `user`
- **Password:** (auto-generated, see console output)

---
## 🔑 Default Credentials

- **Show both options**: mention the auto-generated password *and* how to override it.
- **Use a table** for clarity:

```markdown
    | Mode              | Username | Password                      |
    |-------------------|----------|-------------------------------|
    | Default (console) | user     | Generated at startup (see log)|
```
(You can configure these in `application.yaml` or via `UserDetailsService`.)

### Custom Credentials
To set your own credentials, add the following to `application.yaml`:

```properties
    spring:
        security:
            user:
                name: admin
                password: admin123
```
This overrides the random password and makes login predictable.

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

## 🔧 Steps to Add CSRF Token in Postman
### 1. Login or fetch the token
- Send a `GET` request to your login page or any endpoint that returns the CSRF token.
- Spring Security usually exposes it as a cookie (`XSRF-TOKEN`) or inside the HTML form as a hidden field.
## 2. Extract the token
- In Postman, check the Cookies tab after the request.
- Look for `XSRF-TOKEN` or `_csrf` in the response.
- Add the token to your request
- In your next request (e.g., POST to /students), add a header:
`X-CSRF-TOKEN: <token-value>`
- Or, if your app expects `_csrf` as a form field, include it in the request body.
- Use Postman’s cookie handling
- Postman automatically stores cookies from responses.
- Ensure “`Enable cookie management`” is turned on so the CSRF cookie is sent with sub-sequent requests.

### 📖 Example
**Step 1**: Get CSRF Token
```
    GET http://localhost:8080/csrf-token
```
Response headers/cookies:
- Set-Cookie: XSRF-TOKEN=generated-csrf-token; Path=/

**Step 2**: Use Token in POST Request
```
    POST http://localhost:8080/students
```

**Headers:**
- Content-Type: application/json
- X-CSRF-TOKEN: generated-csrf-token
```
Body:
    {
        "id": 3,
        "name": "Balaji",
        "tech": "Spring security"
    }
```

## 🔒 CSRF Protection

This app uses Spring Security’s CSRF protection.  
When testing with Postman:

1. Send a `GET` request to `/login` or `/csrf-token` to retrieve the CSRF token.
2. Copy the `_csrf` from the response cookies.
3. Add it to your request headers:


X-CSRF-TOKEN: <token-value>

Without this token, POST/PUT/DELETE requests will be rejected with `403 Forbidden`.

When working with Spring Security and testing APIs in Postman, you’ll often need to include the CSRF token if your app has CSRF protection enabled. By default, Spring Security requires this token for any state‑changing requests (POST, PUT, DELETE).


## 📖 Learning Highlights
- How to secure REST endpoints with Spring Security
- Configuring in‑memory authentication
- Configuring HTTP Basic and Form Login
- Securing endpoints with Spring Security
- Using Spring Web for RESTful APIs
- Using DevTools for rapid development
- Building a clean, recruiter‑ready Spring Boot project
 
---

## 🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you’d like to change.
