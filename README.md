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

🔗 **Base URL**  
[https://cloud-vendor-rest-api-production.up.railway.app](https://cloud-vendor-rest-api-production.up.railway.app)

✅ **Public test endpoint**  
[https://cloud-vendor-rest-api-production.up.railway.app/vendor](https://cloud-vendor-rest-api-production.up.railway.app/vendor)

✅ **Root welcome route**  
[https://cloud-vendor-rest-api-production.up.railway.app/](https://cloud-vendor-rest-api-production.up.railway.app/)

---

## 📮 REST API Endpoints

| Method | Endpoint                            | Description              | Auth | Body | Sample |
|--------|-------------------------------------|--------------------------|------|------|--------|
| GET    | `/vendor`                           | Get all vendors          | ❌    | ❌    | [Try it](https://cloud-vendor-rest-api-production.up.railway.app/vendor) |
| GET    | `/vendor/getSingleVendors/{id}`     | Get vendor by ID         | ❌    | ❌    | [ID 1](https://cloud-vendor-rest-api-production.up.railway.app/vendor/getSingleVendors/1) |
| POST   | `/vendor/addVendors`                | Add a new vendor         | ❌    | ✅    | [Try it](https://cloud-vendor-rest-api-production.up.railway.app/vendor/addVendors) |

---

## ➕ Add Vendor (POST)

**URL:**  
[`/vendor/addVendors`](https://cloud-vendor-rest-api-production.up.railway.app/vendor/addVendors)

**Method:** `POST`  
**Content-Type:** `application/json`

### 🔹 Request Body

```json
{
  "name": "Maa Kali",
  "username": "maaKali@gamil.com",
  "password": "maakali"
}
🔹 Response
json
Copy
Edit
{
  "Message": "Vendor added",
  "HttPstatus": "CREATED",
  "Data": {
    "id": 1,
    "name": "Maa Kali",
    "username": "maaKali@gamil.com",
    "password": "maakali"
  }
}
🔁 Get All Vendors (GET)
URL:
/vendor

🔹 Response
json
Copy
Edit
[
  {
    "id": 1,
    "name": "Maa Kali",
    "username": "maaKali@gamil.com",
    "password": "maakali"
  },
  {
    "id": 2,
    "name": "Shree Radha Rani",
    "username": "shreeradharani@gamil.com",
    "password": "shreeradharani"
  }
]
🔍 Get Single Vendor by ID (GET)
Example 1:
/vendor/getSingleVendors/1

Example 2:
/vendor/getSingleVendors/2

🔹 Response
json
Copy
Edit
{
  "Message": "OM NAMO PARVATI PATE HAR HAR MAHADEV",
  "HttPstatus": "OK",
  "Data": {
    "id": 2,
    "name": "Shree Radha Rani",
    "username": "shreeradharani@gamil.com",
    "password": "shreeradharani"
  }
}
🧪 Unit Testing (JUnit + Mockito)
Unit testing has been implemented for the service layer using:

✅ JUnit 5

✅ Mockito (repository mocking)

✅ Covered Scenarios
Add Vendor – valid data (mocked repository)

Get Single Vendor – found and not-found case

Exception Handling – 404 custom messages

📄 File Path:
/src/test/java/com/SpringSecurity/Security/ServiceLayer/ServiceLayerImplementationTest.java

⚙️ Tech Stack
Layer	Technology
Language	Java 17
Framework	Spring Boot 3.2.x
Security	Spring Security + JWT (jjwt 0.11.5)
Validation	Jakarta Bean Validation (JSR-380)
API	Spring Web (REST)
DB	H2 (in-memory)
Persistence	Spring Data JPA
Testing	JUnit 5, Mockito
Deployment	Railway (cloud hosting)
Tools	IntelliJ, GitHub, Postman

💡 Highlights
✅ Layered Architecture: Controller → Service → Repository

✅ JWT-based stateless security

✅ DTO & Validation with custom error responses

✅ Global exception handling

✅ Fast H2 in-memory DB

✅ Public GET endpoint for demo

✅ Deployed on Railway + Live working screenshots

🔗 Useful Links
🔥 Live API Base URL:
https://cloud-vendor-rest-api-production.up.railway.app

📂 GitHub Repo:
https://github.com/siddharth0161820/cloud-vendor-rest-api

