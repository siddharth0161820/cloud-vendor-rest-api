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

🔗 Base URL:  
https://cloud-vendor-rest-api-production.up.railway.app

✅ Public test endpoint:  
https://cloud-vendor-rest-api-production.up.railway.app/vendor

✅ Root welcome route (used by Railway health check):  
https://cloud-vendor-rest-api-production.up.railway.app/

---

## 📮 REST API Endpoints

| Method | Endpoint                          | Description              | Request Body |
|--------|-----------------------------------|--------------------------|---------------|
| GET    | /vendor                           | Get all vendors          | ❌            |
| GET    | /vendor/getSingleVendors/{id}     | Get vendor by ID         | ❌            |
| POST   | /vendor/addVendors                | Add a new vendor         | ✅            |
| PUT    | /vendor/updateVendors             | Update existing vendor   | ✅            |
| DELETE | /vendor/deleteVendors/{id}        | Delete vendor by ID      | ❌            |

📝 Sample request body for POST/PUT:

```json
{
  "name": "Radha Rani",
  "username": "radha@example.com",
  "password": "radha123"
}
