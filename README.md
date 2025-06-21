# ☁️ Cloud Vendor REST API (Spring Boot + JWT + Validation + H2 + Railway)

This is a complete professional-grade Java backend project using layered architecture with Spring Boot. It demonstrates:

✅ REST APIs  
✅ JWT-based Authentication  
✅ DTO & Validation  
✅ Global Exception Handling  
✅ Unit Testing with JUnit & Mockito  
✅ In-memory H2 DB for cloud  
✅ Deployed live on Railway  
✅ Screenshot Proof included

---

## 🌍 Live Deployment

🔗 Base URL:  
https://cloud-vendor-rest-api-production.up.railway.app

✅ Sample working endpoint:  
https://cloud-vendor-rest-api-production.up.railway.app/vendor

You can use this link directly in browser or via Postman.

---

## 📮 REST API Endpoints

| Method | Endpoint                          | Description              | Request Body |
|--------|-----------------------------------|--------------------------|---------------|
| GET    | /vendor                           | Get all vendors          | ❌            |
| GET    | /vendor/getSingleVendors/{id}     | Get vendor by ID         | ❌            |
| POST   | /vendor/addVendors                | Add a new vendor         | ✅            |
| PUT    | /vendor/updateVendors             | Update vendor            | ✅            |
| DELETE | /vendor/deleteVendors/{id}        | Delete vendor by ID      | ❌            |

📝 Sample request body for POST/PUT:

```json
{
  "name": "Radha Rani",
  "username": "radha@example.com",
  "password": "radha123"
}

📁 Project Structure
cloud-vendor-rest-api/
└── Security/
    ├── ControllerLayer/                  # REST controllers
    ├── ServiceLayer/                     # Business logic
    ├── RepositoryLayer/                  # JPA repositories
    ├── Entity/                           # CloudVendor entity
    ├── Jwt/                              # JWT utils and filters
    ├── UserDTO/                          # DTO + @Valid
    ├── SecurityConfig/                   # Spring Security config
    ├── CutomException/                   # Custom response formatter
    ├── GlobalExceptionHandling/          # @ControllerAdvice for errors
    ├── ServiceLayerImplementationTest.java # JUnit + Mockito tests
    ├── application.properties            # Port + H2 DB config
    ├── deployment-proof.png              # ✅ Screenshot proof
    └── README.md                         # ✅ This file

📝 Unit Testing with JUnit & Mockito
Test file:
📄 ServiceLayerImplementationTest.java
Covered test cases:
✅ addVendors() → Success path
✅ getSingleVendors(id) → Positive + Negative (not found) paths
Assertion of data, mocks and exception handling is implemented clearly.

📝 Tech Stack
Java 17
Spring Boot 3.2.x
Spring Data JPA
Spring Security + JWT (jjwt v0.11.5)
H2 In-Memory DB
Jakarta Bean Validation
JUnit 5 + Mockito
Railway (for cloud hosting)
