# ☁️ Cloud Vendor REST API (Spring Boot + JWT + Validation + H2 + Railway)

This is a fully functional, professional-grade Java backend project built using Spring Boot and layered architecture. It demonstrates:

✅ REST API endpoints  
✅ Spring Security + JWT authentication  
✅ DTO + Validation using Jakarta  
✅ Global Exception Handling  
✅ Unit Testing with JUnit + Mockito  
✅ In-memory H2 DB for cloud deployments  
✅ Hosted Live on Railway  
✅ Screenshot Proof Included  
✅ Public Root Welcome Route (`/`) now allowed

---

## 🌐 Live Deployment

🟢 Your API is live and publicly accessible via:

🔗 Base URL:  
https://cloud-vendor-rest-api-production.up.railway.app

✅ Public test endpoint:  
https://cloud-vendor-rest-api-production.up.railway.app/vendor

✅ Root welcome route (used by Railway health check):  
https://cloud-vendor-rest-api-production.up.railway.app/

---

## 📮 REST API Endpoints

| Method | Endpoint                          | Description              | Request Body |
|--------|-----------------------------------|--------------------------|---------------|
| GET    | /vendor                           | Get all vendors          | ❌            |
| GET    | /vendor/getSingleVendors/{id}     | Get vendor by ID         | ❌            |
| POST   | /vendor/addVendors                | Add a new vendor         | ✅            |
| PUT    | /vendor/updateVendors             | Update existing vendor   | ✅            |
| DELETE | /vendor/deleteVendors/{id}        | Delete vendor by ID      | ❌            |

📝 Sample request body for POST/PUT:

```json
{
  "name": "Radha Rani",
  "username": "radha@example.com",
  "password": "radha123"
}

---

## 🧪 Unit Testing (JUnit + Mockito)

Unit testing has been implemented for the service layer using:

- JUnit 5
- Mockito (for mocking repository layer)

🧾 Covered scenarios:

- ✅ Add Vendor – Valid data, repository save mocked
- ✅ Get Single Vendor – Positive and Not Found case (throws custom NOTFOUNDEXCEPTION)
- 🔍 Mocks and assertions ensure robust behavior

📄 File:
Security/src/test/java/com/SpringSecurity/Security/ServiceLayer/ServiceLayerImplementationTest.java


---

## ⚙️ Tech Stack

| Layer              | Technology                         |
|--------------------|-------------------------------------|
| Language           | Java 17                            |
| Framework          | Spring Boot 3.2.x                  |
| REST API           | Spring Web                         |
| Security           | Spring Security + JWT (jjwt 0.11.5)|
| Validation         | Jakarta Bean Validation (JSR-380)  |
| Persistence        | Spring Data JPA                    |
| Database           | H2 (In-Memory)                     |
| Testing            | JUnit 5, Mockito                   |
| Deployment         | Railway (Free Cloud Platform)      |
| Tooling            | IntelliJ, GitHub, Postman          |

---

## 💡 Highlights

- ✅ Fully layered architecture (Controller, Service, Repository)
- ✅ DTO + @Valid for input layer protection
- ✅ JWT-based stateless authentication
- ✅ Custom global exception handler (@ControllerAdvice)
- ✅ H2 DB: portable + fast cloud deployments
- ✅ Public GET /vendor endpoint for Railway demo
- ✅ Root (‘/’) returns welcome message → solves 403 Forbidden
- ✅ Screenshot proof of live deployment

---

