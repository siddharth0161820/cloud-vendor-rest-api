# ☁️ Cloud Vendor REST API (Spring Boot + JWT + Validation + H2 + Railway)

This is a fully functional Java backend project built using Spring Boot and layered architecture. It demonstrates:

✅ RESTful API endpoints  
✅ Spring Security with JWT authentication  
✅ DTO + Validation using Jakarta  
✅ Global Exception Handling  
✅ Unit Testing (JUnit + Mockito)  
✅ In-memory H2 DB for Cloud  
✅ Live Railway Deployment  
✅ Real request/response samples below  
✅ Public Welcome Route (`/`) enabled

---

## 🌍 Live Deployment

- 🔗 **Base URL**:  
  [https://cloud-vendor-rest-api-production.up.railway.app](https://cloud-vendor-rest-api-production.up.railway.app)

- ✅ **Public Endpoint** – Get All Vendors:  
  [https://cloud-vendor-rest-api-production.up.railway.app/vendor](https://cloud-vendor-rest-api-production.up.railway.app/vendor)

- ✅ **Welcome Route**:  
  [https://cloud-vendor-rest-api-production.up.railway.app/](https://cloud-vendor-rest-api-production.up.railway.app/)

---

## 📮 REST API Endpoints

### ✅ Publicly Accessible Endpoints (No Token Needed)

| Method | Endpoint                         | Description            | Test Link |
|--------|----------------------------------|------------------------|-----------|
| GET    | `/vendor`                        | Get all vendors        | [Try Now](https://cloud-vendor-rest-api-production.up.railway.app/vendor) |
| GET    | `/vendor/getSingleVendors/1`     | Get vendor by ID = 1   | [Try Now](https://cloud-vendor-rest-api-production.up.railway.app/vendor/getSingleVendors/1) |

### 🔐 Secured Endpoints (JWT Required)

| Method | Endpoint                          | Description             |
|--------|-----------------------------------|-------------------------|
| POST   | `/auth/register`                  | Register new user       |
| POST   | `/auth/login`                     | Authenticate & get JWT  |
| POST   | `/vendor/addVendors`              | Add new vendor          |
| PUT    | `/vendor/updateVendors`           | Update vendor           |
| DELETE | `/vendor/deleteVendors/{id}`      | Delete vendor by ID     |

> 💡 Use Postman to test secured routes.  
> Pass JWT token as:  
> `Authorization: Bearer <your-token>`

---

## 📦 Sample Request & Response

### ➕ Add Vendor (POST `/vendor/addVendors`)

**Request Body**
```json
{
  "name": "Mein",
  "username": "meinn@gamil.com",
  "password": "meinn"
}
Response

json
Copy
Edit
{
  "Message": "Vendor added",
  "HttPstatus": "CREATED",
  "Data": {
    "id": 2,
    "name": "Mein",
    "username": "meinn@gamil.com",
    "password": "meinn"
  }
}
⚠️ DTO Validation Error Example
json
Copy
Edit
{
  "name": "Maa",
  "username": "",
  "password": ""
}
Response

json
Copy
Edit
{
  "password": "Password is mandatory",
  "username": "Username is mandatory"
}
🔁 Update Vendor (PUT /vendor/updateVendors)
Request Body

json
Copy
Edit
{
  "id": 3,
  "name": "Maa",
  "username": "Maa@gmail.com",
  "password": "maaaaaaaa"
}
Response

json
Copy
Edit
{
  "Message": "Vendor updated",
  "HttPstatus": "OK",
  "Data": {
    "id": 3,
    "name": "Maa",
    "username": "Maa@gmail.com",
    "password": "maaaaaaaa"
  }
}
🔎 Get Vendor By ID (GET /vendor/getSingleVendors/1)
Response

json
Copy
Edit
{
  "Message": "OM NAMO PARVATI PATE HAR HAR MAHADEV",
  "HttPstatus": "OK",
  "Data": {
    "id": 1,
    "name": "Maa Kali",
    "username": "maaKali@gamil.com",
    "password": "maakali"
  }
}
❌ Delete Vendor (DELETE /vendor/deleteVendors/1)
Success Response

json
Copy
Edit
{
  "Message": "Deleted",
  "HttPstatus": "OK",
  "Data": null
}
Error Response

json
Copy
Edit
{
  "name": "Please enter the valid input to delete the single vendor details",
  "throwable": null,
  "httpStatus": "NOT_FOUND"
}
🧪 Unit Testing
✅ Service layer tested with JUnit 5 + Mockito
✅ Mocks for repository layer
✅ Positive + Negative test cases implemented

💡 Tech Stack
Category	Technology
Language	Java 17
Framework	Spring Boot 3.2.x
API Design	REST + DTO + Validation
Security	Spring Security + JWT (jjwt 0.11.5)
Persistence	Spring Data JPA
Database	H2 In-Memory
Testing	JUnit 5, Mockito
Deployment	Railway (Cloud)
Tools	Postman, IntelliJ, GitHub

🚀 Highlights
✅ DTO + Jakarta validation
✅ JWT-based authentication (stateless)
✅ Global exception handling with @ControllerAdvice
✅ Clean layered architecture: Controller → Service → Repository
✅ End-to-end testing with live endpoints
✅ H2 for cloud compatibility
✅ Screenshot proof of Railway Deployment available

