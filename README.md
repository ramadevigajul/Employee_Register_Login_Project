# 🚀 Employee Management System

A modern Employee Management System built using **Spring Boot MVC**, **Spring Data JPA**, **Thymeleaf**, and **MySQL**. This application enables employees to register, log in securely, and manage authentication through a clean and user-friendly interface.

---

## ✨ Features

🔐 Secure Employee Registration

👤 Employee Login Authentication

🗄️ MySQL Database Integration

⚡ Spring Boot MVC Architecture

📄 Thymeleaf Template Engine

📊 Spring Data JPA Repository Layer

🎨 Responsive and Clean UI Design

🔄 Real-Time Database Updates

---

## 🛠️ Tech Stack

| Technology      | Description                |
| --------------- | -------------------------- |
| Java            | Core Programming Language  |
| Spring Boot     | Backend Framework          |
| Spring MVC      | MVC Architecture           |
| Spring Data JPA | Database Operations        |
| Thymeleaf       | Frontend Template Engine   |
| MySQL           | Relational Database        |
| Maven           | Dependency Management      |
| Lombok          | Boilerplate Code Reduction |
| HTML & CSS      | User Interface             |

---

## 🏗️ System Architecture

```text
Presentation Layer (Thymeleaf)
            ↓
      Controller Layer
            ↓
       Service Layer
            ↓
     Repository Layer
            ↓
        MySQL Database
```

---

## 📂 Project Structure

```text
employee-management-system
│
├── src/main/java
│   ├── controller
│   ├── dao
│   ├── entity
│   ├── service
│   └── EmployeeManagementApplication
│
├── src/main/resources
│   ├── templates
│   │   ├── login.html
│   │   ├── register.html
│   │   └── home.html
│   └── application.properties
│
└── pom.xml
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/employee-management-system.git
```

### 2️⃣ Create Database

```sql
CREATE DATABASE employee_db;
```

### 3️⃣ Configure Database Credentials

Update your `application.properties` file.

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

### 5️⃣ Access Application

```text
http://localhost:8080
```

---

## 🔄 Application Workflow

### Employee Registration

✅ Enter Name

✅ Enter Email

✅ Create Password

✅ Store Data in MySQL

### Employee Login

✅ Enter Registered Email

✅ Enter Password

✅ Authentication Verification

✅ Redirect to Home Page

---

## 📸 Screenshots

### 🔑 Login Page

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/7c1eea67-2b24-4b6c-a0c4-d0886c9be192" />


### 📝 Registration Page

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ce0011e1-eb03-4ac6-9b78-5ffda3415ba4" />


---

## 🌟 Future Enhancements

* Spring Security Integration
* Password Encryption using BCrypt
* Employee CRUD Operations
* Profile Management
* Logout Functionality
* Session Management
* Admin Dashboard
* Role-Based Access Control
* REST API Development

---

## 👨‍💻 Author

### Ramadevi Gajul

🎓 B.Tech Student

☕ Java Full Stack Developer

🌱 Passionate about Spring Boot, Java, and Web Development

---

## ⭐ Support

If you found this project useful, consider giving it a **Star ⭐** on GitHub.

---

## 📜 License

This project is developed for educational and learning purposes.
