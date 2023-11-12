# Spring Boot Inventory Management System

This is a simple inventory management system for a store implemented using Spring Boot, Hibernate, and MySQL.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Configuration](#configuration)
    - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Test Coverage](#test-coverage)
- [Code Quality](#code-quality)
- [Conversation Logs](#conversation-logs)
- [Project Feedback](#project-feedback)
- [Contributing](#contributing)
- [License](#license)

## Features

- View a list of available products
- Add new products
- Update existing products
- Each product has a name, description, price, and quantity

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven or Gradle
- MySQL

### Configuration

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-inventory.git
   cd spring-boot-inventory
Configure your MySQL database in src/main/resources/application.properties:


spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
Running the Application

Build the project:


```bash
./mvnw clean install  
```

Run the application:
```bash
./mvnw spring-boot:run 
``` 

The application should now be accessible at http://localhost:8080.

API Endpoints

GET /products: Get a list of all products.

POST /products: Add a new product.

PUT /products/{id}: Update an existing product.

Refer to the API documentation for detailed information on each endpoint.

Testing
Run the tests using the following command:

```bash
./mvnw test
``` 


## Test Coverage

Check the test coverage using the following command:

```bash
./mvnw test jacoco:report 
``` 

View the coverage report in the target/site/jacoco directory (Maven) or build/reports/jacoco directory (Gradle).

## Code Quality

Run SonarQube analysis to check code quality:

```bash
./mvnw sonar:sonar
``` 

View the SonarQube dashboard at http://localhost:9000.
## Conversation Logs

ChatGPT conversation logs are available in the file [chat.log](src/main/resources/chat.log).
Conversation link: https://chat.openai.com/share/591ff7e6-3a73-4a7b-b06b-541327509c4d

# Project Feedback

- **Was it easy to complete the task using AI?**
    - Absolutely, leveraging AI made the task significantly more straightforward.

- **How long did the task take you to complete?**
    - The task was completed in approximately 1 hour.

- **Was the code ready to run after generation? What did you have to change to make it usable?**
    - The generated code was ready to run; I made minor adjustments to the readme for clarity.

- **Which challenges did you face during completion of the task?**
    - The primary challenge revolved around formulating questions in a manner that AI could understand, leading to satisfactory responses.

Contributing

Feel free to contribute by opening issues and pull requests. Please follow the Contributing Guidelines.

License

This project is licensed under the MIT License.
