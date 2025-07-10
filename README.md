# ☁️ Cloud Vendor REST API

A full-stack-ready backend project to demonstrate real-world Spring Boot REST API development using DTOs, global exception handling, unit testing, and clean layered architecture.

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge)
![JUnit](https://img.shields.io/badge/JUnit-5-25A162?style=for-the-badge)
![Postman](https://img.shields.io/badge/Tested%20With-Postman-orange?style=for-the-badge)

---

## 🚀 Tech Stack

- Java 21  
- Spring Boot 3.x  
- Spring Data JPA + Hibernate  
- MySQL  
- DTO + Validation  
- Global Exception Handling  
- Unit Testing (JUnit + Mockito)  
- Postman for API testing  

---

## 📁 Project Structure

| Layer | Link |
|-------|------|
| 🧾 Controller | [ControllerLayer.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/ControllerLayer/ControllerLayer.java) |
| 🧠 Service | [ServiceLayer](https://github.com/siddharth0161820/cloud-vendor-rest-api/tree/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/ServiceLayer) |
| 💾 Repository | [RepositoryLayer.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/RepositoryLayer/RepositoryLayer.java) |
| 🧱 Entity | [CloudVendor.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/Entity/CloudVendor.java) |
| 📦 DTO | [UserDTO.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/UserDTO/UserDTO.java) |
| ⚠️ Custom Exception | [TestCustomExceptionHandler.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/CustomExceptionHandler/TestCustomExceptionHandler.java) |
| 🚨 Global Exception | [GlobalExceptionHandling](https://github.com/siddharth0161820/cloud-vendor-rest-api/tree/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/GlobalExceptionHandling) |
| 🧪 Unit Test | [TestServiceLayer.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/test/java/com/SPRINGBOOT/RESTAPI/ServiceLayer/TestServiceLayer.java) |
| ▶️ Main App | [RestapiApplication.java](https://github.com/siddharth0161820/cloud-vendor-rest-api/blob/master/RESTAPI/src/main/java/com/SPRINGBOOT/RESTAPI/RestapiApplication.java) |

---

## ✅ Features

- Full CRUD operations for cloud vendors  
- DTO-based data transfer and request handling  
- Input validation using annotations  
- Global and custom exception handling  
- Clean layered architecture (Controller → Service → Repository)  
- JUnit + Mockito-based unit tests  
- Manual API tested with Postman  

---

## 📮 API Endpoints

### ➕ POST `/addVendors`  
**Add a new cloud vendor**

📤 Request:
```json
{
  "name": "Ganesh Ji",
  "userName": "ganeshji@gmail.com",
  "passWord": "ganeshji"
}
✅ Success Response:
{
  "Message": "Vendor details added",
  "HttpStatus": "CREATED",
  "Object": {
    "id": 1,
    "name": "Ganesh Ji",
    "userName": "ganeshji@gmail.com",
    "passWord": "ganeshji"
  }
}
❌ Validation Error:
{
  "passWord": "The passWord is mandatory",
  "name": "Name should have at-least 2 characters",
  "userName": "must be a well-formed email address"
}
📥 GET /getAllVendors
Fetch all vendors
✅ Response:
[
  {
    "id": 1,
    "name": "Ganesh Ji",
    "userName": "ganeshji@gmail.com",
    "passWord": "ganeshji"
  },
  {
    "id": 52,
    "name": "Jai Maa Kali",
    "userName": "jaimaakali@gmail.com",
    "passWord": "jaimaakali"
  }
]
📄 GET /getSingleVendors/{id}
Fetch a vendor by ID
✅ Success (/getSingleVendors/1):
{
  "Message": "Single Vendor Details Extracted",
  "HttpStatus": "OK",
  "Object": {
    "id": 1,
    "name": "Ganesh Ji",
    "userName": "ganeshji@gmail.com",
    "passWord": "ganeshji"
  }
}
❌ Not Found (/getSingleVendors/11):
{
  "message": "Please,Enter the Valid input to extract the respective vendor details",
  "httpStatus": "NOT_FOUND"
}
🗑 DELETE /deleteVendors/{id}
Delete a vendor
✅ Success:
{
  "Message": "Single Vendor Details deleted",
  "HttpStatus": "OK",
  "Object": null
}
❌ Error:
{
  "message": "Please,Enter the Valid input to delete the respective vendor details",
  "httpStatus": "NOT_FOUND"
}
🔁 PUT /updateVendors
Update vendor details
📤 Request:
{
  "id": 1,
  "name": "Om Ganeshya Namah Ji",
  "userName": "omganeshyanamahji@gmail.com",
  "passWord": "omganeshyanamahji"
}
✅ Response:
{
  "Message": "Vendor details updated",
  "HttpStatus": "OK",
  "Object": {
    "id": 1,
    "name": "Om Ganeshya Namah Ji",
    "userName": "omganeshyanamahji@gmail.com",
    "passWord": "omganeshyanamahji"
  }
}

🧪 Unit Testing
Frameworks: JUnit 5 + Mockito

Class: TestServiceLayer.java

Scenarios:

Valid CRUD logic

Invalid ID → NotFoundException

Invalid input → Validation exception

📸 Postman API Screenshots
✅ Add Vendor
<img width="700" src="https://github.com/user-attachments/assets/61e138f6-886f-4822-b8d2-5f47e7f72756" />

❌ Validation Error
<img width="700" src="https://github.com/user-attachments/assets/30a6ab79-8ddb-4bc8-85ee-31f0dab74cfd" />

✅ Get All Vendors
<img width="700" src="https://github.com/user-attachments/assets/b2a32d3e-a26b-45c7-b8aa-5ae62f776fbb" />

🗑️ Delete Vendor
<img width="700" src="https://github.com/user-attachments/assets/e605efd8-384b-4ac3-8e60-d496f7d7b82d" />

🔄 Update Vendor
<img width="700" src="https://github.com/user-attachments/assets/b72d263a-0f37-49c9-babb-5656feacd0f6" />

🧾 Get Single Vendor
<img width="700" src="https://github.com/user-attachments/assets/ea7534e5-c694-4c7f-b20a-35e81d70d5a8" />

✅ Add Another Vendor
<img width="700" src="https://github.com/user-attachments/assets/0ec3f6fc-3d22-44c7-bcfd-c11f43c4f898" />

## 👨‍💻 Author

**Sidharth Kumar**

## 👨‍💻 Author

**Sidharth Kumar**

[![Email](https://img.shields.io/badge/Email-siddharth0161820@gmail.com-red?style=for-the-badge&logo=gmail)](mailto:siddharth0161820@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/siddharthkumar16)
[![GitHub](https://img.shields.io/badge/GitHub-Profile-black?style=for-the-badge&logo=github)](https://github.com/siddharth0161820)






🙏 Thank you for visiting this project.
Feel free to connect for collaboration, job opportunities, or tech discussions.
