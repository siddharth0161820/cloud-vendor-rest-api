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

RESTAPI/
├── controller/
├── service/
├── repository/
├── dto/
├── exception/
├── entity/
└── application.properties  
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

| Method | Endpoint           | Description        |
|--------|--------------------|--------------------|
| GET    | `/vendors`         | Get all vendors    |
| GET    | `/vendors/{id}`    | Get vendor by ID   |
| POST   | `/vendors`         | Add new vendor     |
| PUT    | `/vendors/{id}`    | Update vendor      |
| DELETE | `/vendors/{id}`    | Delete vendor      |

---

## 🛠️ How to Run

### Prerequisites
- Java 17+ (preferably Java 21)
- MySQL server running on port 3306
- Maven installed

---

### 🔧 Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/CloudVendor
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
# ▶️ Run the App
./mvnw spring-boot:run  
🧪 Unit Testing
Unit tests are written using JUnit 5 and Mockito.

✅ Test Class: TestServiceLayer.java

Covered Scenarios:

Valid CRUD operations

Invalid vendor ID (throws NotFound exception)

Input validation error (throws MethodArgumentNotValidException)

# 🧪 Run Tests
./mvnw test
📸 API Test Screenshots (via Postman)
✅  Add Vendor (POST)
<img width="700" src="https://github.com/user-attachments/assets/61e138f6-886f-4822-b8d2-5f47e7f72756" />
❌ Validation Error (POST)
<img width="700" src="https://github.com/user-attachments/assets/30a6ab79-8ddb-4bc8-85ee-31f0dab74cfd" />
✅  Get All Vendors (GET)
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

Sidharth Kumar  
📧 [siddharth0161820@gmail.com](mailto:siddharth0161820@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/siddharth0161820)  
🔗 [GitHub](https://github.com/siddharth0161820)

🙏 Thank you for taking the time to explore this project.  
I truly appreciate your interest and look forward to connecting.  
TELL ME ALL LINKS EVETHING WORKING PIC SS ALL REVOEW CHECK 
Feel free to reach out for collaboration, questions, or opportunities!
