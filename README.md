# Cloud Vendor Management API

A RESTful backend service built using Java 21, Spring Boot 3.4.0, and MySQL to manage cloud vendors. It follows layered architecture and includes CRUD operations, exception handling, DTOs, and validation.

---

## Tech Stack
- Java 21  
- Spring Boot 3.4.0  
- Spring Data JPA  
- MySQL  
- Maven  
- DTO and Validation (Hibernate Validator)  
- Postman (for API testing)  
- IntelliJ IDEA (development IDE)

---

## Features
- Add, view, update, and delete vendors
- DTOs used for request/response abstraction
- Field validation using annotations (@NotBlank, @Pattern, etc.)
- Exception handling using @ControllerAdvice
- Clean layered architecture: Controller → Service → Repository

---

## Project Structure
- controller – REST endpoints
- dto – Data Transfer Objects
- entity – JPA entities
- service – Business logic
- repository – Database operations
- exception – Custom exceptions and global handler

---

## API Endpoints
- POST /cloudvendor – Add a new vendor (validates DTO fields)
- GET /cloudvendor/{id} – Get vendor by ID
- GET /cloudvendor – Get list of all vendors
- PUT /cloudvendor – Update existing vendor
- DELETE /cloudvendor/{id} – Delete vendor

---

## DTO with Validation Example

```java
public class CloudVendorDTO {

    @NotBlank(message = "Vendor name is required")
    private String vendorName;

    @NotBlank(message = "Address is required")
    private String vendorAddress;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String vendorPhone;

    // Getters and setters
}
