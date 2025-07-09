# ☁️ Cloud Vendor REST API

A clean, production-ready Spring Boot REST API for managing cloud vendor information — built using layered architecture, DTOs, input validation, global exception handling, and unit testing with JUnit + Mockito.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot 3.x
- Spring Data JPA + Hibernate
- MySQL
- DTO + Validation
- Global Exception Handling
- Unit Testing with JUnit & Mockito
- Postman for manual API testing

---

## 📁 Project Structure

RESTAPI/
├── ControllerLayer/
├── ServiceLayer/
├── RepositoryLayer/
├── Entity/
├── UserDTO/
├── GlobalExceptionHandling/
├── CustomExceptionHandler/
└── application.properties

yaml
Copy
Edit

---

## ✅ Features

- Add, update, delete cloud vendors
- Retrieve single or all vendors
- Clean separation using DTOs
- Input validation using annotations
- Global + custom exception handling
- JUnit & Mockito-based unit testing
- Fully tested with Postman

---

## 📮 API Endpoints

| Method | Endpoint                  | Description               |
|--------|---------------------------|---------------------------|
| GET    | `/getAllVendors`          | Get all vendors           |
| GET    | `/getSingleVendors/{id}`  | Get vendor by ID          |
| POST   | `/addVendors`             | Add new vendor            |
| PUT    | `/updateVendors`          | Update vendor             |
| DELETE | `/deleteVendors/{id}`     | Delete vendor by ID       |

---

## 🛠️ How to Run

### Prerequisites:
- Java 17 or above
- MySQL running on port 3306
- Maven

### Setup:
```bash
git clone https://github.com/siddharth0161820/cloud-vendor-rest-api.git
cd RESTAPI
Update application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/CloudVendor
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Run the app:

bash
Copy
Edit
./mvnw spring-boot:run
🧪 Testing (JUnit + Mockito)
bash
Copy
Edit
./mvnw test
Test class:

TestServiceLayer.java

📸 Postman Screenshots
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
👨‍💻 Author
Sidharth Kumar
📧 siddharth0161820@gmail.com
🔗 LinkedIn
🔗 GitHub

