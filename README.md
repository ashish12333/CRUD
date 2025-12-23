# CRUD Application

This is a basic CRUD (Create, Read, Update, Delete) application developed using
Spring Boot. The project demonstrates simple REST APIs to perform CRUD
operations on a database.

---

## Features
- Create records
- Read records
- Update records
- Delete records
- RESTful APIs

---

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven

---

## API Endpoints

| Method | Endpoint | Description |
|------|---------|------------|
| POST | /api/items | Create record |
| GET | /api/items | Get all records |
| GET | /api/items/{id} | Get record by ID |
| PUT | /api/items/{id} | Update record |
| DELETE | /api/items/{id} | Delete record |

---

## Database Configuration

Update `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/crud_db  
spring.datasource.username=root  
spring.datasource.password=******  

---

## Author
Ashish Kumar  
Java Backend Developer (Fresher)
