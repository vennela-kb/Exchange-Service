# 💱 Exchange Service - Spring Boot

## 📌 Overview
This project is a **Spring Boot-based Currency Exchange Service**, providing APIs to fetch exchange rates and perform currency conversions. It follows a **RESTful API architecture**, leveraging **Spring Boot and Maven**.

### 🎯 Features
✅ Retrieve real-time exchange rates  
✅ RESTful APIs with Spring Boot  
✅ Database Configuration via `application.properties`  
✅ Modular MVC-based structure  
✅ Unit Testing using JUnit  
✅ Maven for dependency management  

---

## 📂 Project Structure
```
exchange-service/
│── src/
│   ├── main/
│   │   ├── java/com/learn/exchangeservice/
│   │   │   ├── controller/        # API Controllers
│   │   │   ├── ExchangeServiceApplication.java  # Main Application Entry
│   │   ├── resources/
│   │   │   ├── application.properties  # Configuration
│   ├── test/java/com/learn/exchangeservice/
│   │   ├── ExchangeserviceApplicationTests.java # Unit Testing
│── pom.xml  # Maven Configuration
│── README.md  # Project Documentation
```

---

## 🛠️ Installation & Setup
### Prerequisites
- Install **Java 11+**
- Install **Maven**
- Install **PostgreSQL/MySQL** (if using a database)

### 🚀 Running the Application
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd exchange-service
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The application will be available at:
   ```sh
   http://localhost:8080
   ```

---

## 🔄 API Endpoints
| HTTP Method | Endpoint | Description |
|------------|----------|-------------|
| **GET** | `/exchange-rate/{from}/{to}` | Get exchange rate between two currencies |
| **POST** | `/exchange-rate` | Add a new exchange rate |
| **PUT** | `/exchange-rate/{id}` | Update an exchange rate |
| **DELETE** | `/exchange-rate/{id}` | Delete an exchange rate |

---

## 🏗️ Future Enhancements
🔹 Implement external API integration for live exchange rates  
🔹 Add authentication (JWT-based security)  
🔹 Develop a frontend using React/Angular  
🔹 Dockerize the application  

---

## ✉️ Contact
For any queries, reach out to:
- **Vennela Kothakonda** - Developer

---

Happy Coding! 🚀
