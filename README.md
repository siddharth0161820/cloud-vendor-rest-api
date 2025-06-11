# 🚀 Cloud Vendor Management API – Spring Boot  (Secure, Layered Architecture)

This is a production-grade Java backend project designed with a clean and secure layered architecture using Spring Boot. The API allows CRUD operations on cloud vendor entities, backed with validation, exception handling, and tested thoroughly via Postman.

---

## 📁 Project Structure

```
Security/
├── ControllerLayer/           → REST endpoints
├── ServiceLayer/              → Business logic
├── RepositoryLayer/           → JPA Repository
├── Entity/                    → CloudVendor entity
├── UserDTO/                   → DTO for validation
├── GlobalExceptionHandling/   → Global exception advice
├── CustomException/           → Custom response wrapper
└── SecurityApplication.java   → Main entry point
```

---

## 🔧 Tech Stack

- Java 8
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Hibernate
- Jakarta Bean Validation (for `@Valid`)
- MySQL / H2
- Postman for API testing
- GitHub for version control

---

## 🧪 API Base URL

```
http://localhost:6363
```

---

## 📬 API Endpoints (with Postman Results)

### ✅ 1. Get All Vendors
- **Method**: `GET`
- **URL**: `/getAllVendors`
- **Description**: Retrieves all cloud vendors.

---

### ✅ 2. Get Vendor by ID

- **Method**: `GET`
- **URL**: `/getSingleVendor/{id}`
- **Example**: `/getSingleVendor/1`

#### 🔵 Success Response (200 OK)
```json
{
  "HttpStatus ": "OK",
  "Message ": "HAR HAR MAHADEV",
  "Data ": {
    "id": 1,
    "name": "Ram Ji",
    "email": "RamJi@gmail.com",
    "password": "RamJiKiJai"
  }
}
```

🖼️ Screenshot:
![Success - Get Vendor](https://github.com/siddharth0161820/cloud-vendor-rest-api/assets/your-success-screenshot)

---

#### 🔴 Error Response (404 NOT_FOUND)
```json
{
  "message": "Please enter the valid id to extract single vendor details",
  "throwable": null,
  "httpStatus": "NOT_FOUND"
}
```

🖼️ Screenshot:
![Error - Invalid Vendor](https://github.com/siddharth0161820/cloud-vendor-rest-api/assets/your-error-screenshot)

---

### ✅ 3. Add New Vendor

- **Method**: `POST`
- **URL**: `/addVendor`
- **Request Body**:
```json
{
  "name": "AWS",
  "email": "aws@cloud.com",
  "password": "secure123"
}
```

#### ✅ Response (201 Created)
```json
{
  "Message ": "CloudVendor Created",
  "HttpStatus ": "OK",
  "Data ": {
    "id": 2,
    "name": "AWS",
    "email": "aws@cloud.com",
    "password": "secure123"
  }
}
```

---

### ✅ 4. Update Vendor

- **Method**: `PUT`
- **URL**: `/updateVendor`
- **Request Body**:
```json
{
  "id": 1,
  "name": "Amazon Web Services",
  "email": "aws@cloud.com",
  "password": "newSecurePass"
}
```

#### ✅ Response
```json
{
  "Message ": "CloudVendor Updated",
  "HttpStatus ": "OK",
  "Data ": {
    "id": 1,
    "name": "Amazon Web Services",
    "email": "aws@cloud.com",
    "password": "newSecurePass"
  }
}
```

---

### ✅ 5. Delete Vendor

- **Method**: `DELETE`
- **URL**: `/deleteVendor/{id}`
- **Example**: `/deleteVendor/2`

#### ✅ Response
```json
{
  "Message ": "DELETED SUCCESSFULLY",
  "HttpStatus ": "OK",
  "Data ": null
}
```

---

## ⚠️ Validation Errors

If any field fails validation (like empty `email`), a structured 400 BAD_REQUEST is returned:

```json
{
  "email": "must be a valid email",
  "name": "must not be blank"
}
```

---

## 🚀 How to Run Locally

```bash
# Clone the project
git clone https://github.com/siddharth0161820/cloud-vendor-rest-api.git

# Navigate into project
cd cloud-vendor-rest-api/Security

# Open in IntelliJ or VS Code

# Run the main class
SecurityApplication.java
```

Access the APIs using Postman at:  
`http://localhost:6363`

---

## 📷 Screenshots from Postman

### ✅ Success – Get Vendor ID 1  
![Success - Get Vendor](https://github.com/siddharth0161820/cloud-vendor-rest-api/assets/your-success-screenshot)

### ❌ Error – Get Invalid Vendor ID 11  
![Error - Get Invalid Vendor](https://github.com/siddharth0161820/cloud-vendor-rest-api/assets/your-error-screenshot)

Replace the links above with the GitHub-hosted versions of your screenshots (or upload them to GitHub issues or Imgur if needed).

---

## 👨‍💻 Author

**Siddharth Kumar**  
📧 siddharth0161820@gmail.com  
🔗 GitHub: [siddharth0161820](https://github.com/siddharth0161820)  
🔗 LinkedIn: [linkedin.com/in/siddharth0161820](https://linkedin.com/in/siddharth0161820)




