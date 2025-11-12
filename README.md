# DreamShop

# 🛍️ DreamShop – E-Commerce Backend (Spring Boot + JWT)

DreamShop is an **e-commerce backend application** built using **Spring Boot, Spring Security, and JWT authentication**.  
It provides secure APIs for managing users, products, carts, and orders.

---

## ⚙️ Tech Stack

- Java 17
- Spring Boot
- Spring Security + JWT
- Hibernate / JPA
- MySQL
- Maven

---

## 🚀 Features

✅ User registration & login (JWT authentication)  
✅ Product CRUD operations  
✅ Category management  
✅ Add to cart / Remove from cart  
✅ Order placement and tracking  
✅ Exception handling

---

## 🧩 How to Run

1. Clone this repo:

   ```bash
   git clone https://github.com/UmasriMuthuvel/DreamShop.git
   cd DreamShop
   ```

2. Configure your MySQL database inside `application.properties`:

   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/dreamshop_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. Run this command:

   ```bash
   mvn spring-boot:run
   ```

4. Test APIs using Postman  
   Example endpoint:
   ```
   GET http://localhost:9193/api/v1/products/all
   ```

---

## 👩‍💻 Author

**Umasri Muthuvel**  
Java Full Stack Developer  
🌐 [LinkedIn](https://www.linkedin.com/in/umasri-muthuvel)  
💻 [GitHub](https://github.com/UmasriMuthuvel)

---

### 🏷️ Keywords (for recruiters)

`Spring Boot` `Spring Security` `JWT` `REST API` `MySQL` `E-Commerce` `Backend Developer` `Java Developer`
