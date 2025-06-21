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
  https://cloud-vendor-rest-api-production.up.railway.app

- ✅ **Public Endpoint** (Get all vendors):  
  https://cloud-vendor-rest-api-production.up.railway.app/vendor

- ✅ **Welcome Route** (`/`):  
  https://cloud-vendor-rest-api-production.up.railway.app/

---

## 📮 REST API Endpoints (with Responses)

### ➕ POST – Add Vendor

**Endpoint:**  
`POST /vendor/addVendors`

**Request Body:**

```json
{
  "name": "Mein",
  "username": "meinn@gamil.com",
  "password": "meinn"
}
Response:

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
⚠️ POST – DTO Validation Error
json
Copy
Edit
{
  "name": "Maa",
  "username": "",
  "password": ""
}
Response:

json
Copy
Edit
{
  "password": "Password is mandatory",
  "username": "Username is mandatory"
}
🔁 PUT – Update Vendor
Endpoint:
PUT /vendor/updateVendors

Request Body:

json
Copy
Edit
{
  "id": 3,
  "name": "Maa",
  "username": "Maa@gmail.com",
  "password": "maaaaaaaa"
}
Response:

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
🔍 GET – All Vendors
Endpoint:
GET /vendor

Response:

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
🔎 GET – Single Vendor by ID
Endpoint:
GET /vendor/getSingleVendors/{id}

Example:

url
Copy
Edit
/vendor/getSingleVendors/1
Response:

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
❌ DELETE – Delete Vendor
Endpoint:
DELETE /vendor/deleteVendors/{id}

Success Response:

json
Copy
Edit
{
  "Message": "Deleted",
  "HttPstatus": "OK",
  "Data": null
}
Error Response (Not Found):

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

✅ Positive + negative test cases (vendor not found, valid vendor addition, etc.)

💡 Tech Stack
Category	Tech Used
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

✅ JWT-based authentication (Stateless)

✅ Global exception handling with @ControllerAdvice

✅ Clean Layered Architecture: Controller → Service → Repository

✅ End-to-end testing with live endpoints

✅ H2 for cloud compatibility

✅ Screenshot proof of Railway Deployment

yaml
Copy
Edit
