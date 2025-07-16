

### 📄 `README.md` content (copy this into Notepad):

````markdown
# 🏦 Bank App (Spring Boot + PostgreSQL)

A simple RESTful banking application built using **Spring Boot** and **PostgreSQL**. This app allows you to create accounts and manage basic banking operations like account creation and balance initialization.

---

## 📌 Features

- Create a new account with holder name and initial balance
- Connects to PostgreSQL using Spring Data JPA
- REST API using Spring MVC
- Clean architecture with Controller → Service → Repository layers

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Postman (for API testing)

---

## 🚀 Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/vijaykumarkatherla/Bankapp.git
cd Bankapp
````

### 2. Set up the database

Create a PostgreSQL database named:

```
bankapp_db
```

Update the credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.url=jdbc:postgresql://localhost:5432/bankapp_db
```

---

### 3. Run the application

```bash
./mvnw spring-boot:run
```

The app will start at: `http://localhost:8081`

---

## 📬 Sample API Usage

### ➕ Create Account (POST)

**URL:**

```
http://localhost:8081/api/accounts?holderName=Vijay&initialBalance=1000
```

**Response:**

```json
{
  "id": 1,
  "holderName": "Vijay",
  "balance": 1000
}
```

---

## 📂 Project Structure

```
bankapp/
├── controller/
├── service/
├── repository/
├── entity/
└── resources/
    └── application.properties
```

---

## 📃 License

This project is licensed under the MIT License.

````

---

### ✅ Final Step:

After saving the file, push it to GitHub:

```bash
git add README.md
git commit -m "Add README.md"
git push
````

Let me know if you'd like to add badges (e.g., Java version, build status) or advanced sections!
