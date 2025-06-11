# 🚀 Cloud Vendor Management API – Spring Boot 

A production-style secure Java backend built using Spring Boot. This project manages cloud vendors with proper layered architecture, validation, exception handling, and all APIs tested using Postman.

---

## 📁 Project Structure

```
Security/
├── ControllerLayer/
├── ServiceLayer/
├── RepositoryLayer/
├── Entity/
├── UserDTO/
├── CustomException/
├── GlobalExceptionHandling/
└── SecurityApplication.java
```

---

## 🔧 Tech Stack

- Java 8
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Hibernate
- Jakarta Bean Validation
- MySQL / H2
- Postman (API Testing)

---

## 🧪 Base URL

```
http://localhost:6363
```

---

## 📬 API Endpoints

### ✅ 1. Get All Vendors
- **GET** `/getAllVendors`  
Returns all vendor entries from the database.

---

### ✅ 2. Get Vendor by ID

- **GET** `/getSingleVendor/{id}`  
Example: `/getSingleVendor/1`

#### ✅ Success Response
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
![Success Screenshot](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/Screenshot%20(134).png?raw=true)

---

#### ❌ Not Found Error Response
```json
{
  "message": "Please enter the valid id to extract single vendor details",
  "throwable": null,
  "httpStatus": "NOT_FOUND"
}
```

🖼️ Screenshot:  
![Error Screenshot](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/Screenshot%20(135).png?raw=true)

---

### ✅ 3. Add New Vendor

- **POST** `/addVendor`
```json
{
  "name": "AWS",
  "email": "aws@cloud.com",
  "password": "secure123"
}
```

#### Response
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

- **PUT** `/updateVendor`
```json
{
  "id": 1,
  "name": "Amazon Web Services",
  "email": "aws@cloud.com",
  "password": "newpass123"
}
```

---

### ✅ 5. Delete Vendor

- **DELETE** `/deleteVendor/{id}`  
Example: `/deleteVendor/1`

---

## ⚠️ Validation Error Example

```json
{
  "email": "must be a valid email",
  "name": "must not be blank"
}
```

---

## ▶️ How to Run Locally

```bash
# Clone the repo
git clone https://github.com/siddharth0161820/cloud-vendor-rest-api.git

# Navigate to Security folder
cd cloud-vendor-rest-api/Security

# Open SecurityApplication.java in IntelliJ or VSCode

# Run the Spring Boot application
```

Access APIs via Postman at:  
`http://localhost:6363`

---

## 📷 Screenshots from Postman

### ✅ Workspace View  
![Workspace Screenshot](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/Screenshot%20(133).png?raw=true)

### ✅ Get Vendor (Success)  
![Success Screenshot](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/Screenshot%20(134).png?raw=true)

### ❌ Get Vendor (404 Error)  
![Error Screenshot](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/Screenshot%20(135).png?raw=true)

---

## 🔗 Postman Collection

If you want, [click here to test all APIs in Postman](#) *(Replace this with your public Postman link if available)*

---

## 👨‍💻 Author

**Siddharth Kumar**  
📧 siddharth0161820@gmail.com  
🔗 GitHub: [@siddharth0161820](https://github.com/siddharth0161820)  
🔗 LinkedIn: [linkedin.com/in/siddharth0161820](https://linkedin.com/in/siddharth0161820)


