Here's a sample `README.md` file for your **Spring Boot CRUD project with REST API and MySQL**:

---

```markdown
# Spring Boot CRUD Application with REST API and MySQL

This is a simple **Spring Boot CRUD** (Create, Read, Update, Delete) application using **REST APIs** and **MySQL** database. The project demonstrates how to build a RESTful web service in Java using Spring Boot.

## 🛠 Technologies Used

- Java 11+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- RESTful APIs
- IntelliJ IDEA / Eclipse

---

## 📁 Project Structure

```

src
├── main
│   ├── java
│   │   └── com.example.crud
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       └── service
│   └── resources
│       ├── application.properties

````

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-crud-api.git
cd springboot-crud-api
````

### 2. Configure MySQL Database

Create a MySQL database named `springbootcruddb`:

```sql
CREATE DATABASE springbootcruddb;
```

### 3. Update `application.properties`

```properties
spring.application.name=springboot-crud
spring.datasource.url=jdbc:mysql://localhost:3306/springbootcruddb?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

---

## 🧪 API Endpoints

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| GET    | `/api/users`      | Get all users     |
| GET    | `/api/users/{id}` | Get user by ID    |
| POST   | `/api/users`      | Create new user   |
| PUT    | `/api/users/{id}` | Update user by ID |
| DELETE | `/api/users/{id}` | Delete user by ID |

---

## 📦 Run the App

### Using Maven

```bash
mvn spring-boot:run
```

### Or build the JAR

```bash
mvn clean install
java -jar target/springboot-crud-0.0.1-SNAPSHOT.jar
```

---

## 🧑‍💻 Author

* Name: Abubakar Ahmad



