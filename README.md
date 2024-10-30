# Backend Challenge (Java): 👻 Halloween Trivia API 👻

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-brightgreen)
![Build](https://img.shields.io/github/workflow/status/your-username/halloween-trivia-api/Build%20API%20Project)
![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Contributions](https://img.shields.io/badge/contributions-welcome-brightgreen.svg)
![Swagger](https://img.shields.io/badge/documented%20with-Swagger-orange.svg)

## 👻 **Theme:** Create an API for a Halloween trivia game!

## Description

This project involves developing a RESTful API in Java that serves as a trivia game centered around Halloween. The API manages questions and answers related to myths and legends of Halloween.

## Requirements

- Implement endpoints to:
  - Add questions
  - List all questions
  - Update existing questions
- Questions must include a difficulty level (easy, medium, hard).
- Users should be able to retrieve a list of random questions for each difficulty level.
- Document the API using Swagger or OpenAPI.

## Endpoints

Here are the available endpoints in the API:

1. **Add a New Question**
   - **Endpoint:** `POST /questions`
   - **Description:** Adds a new trivia question to the database.
   - **Request Body:**
     ```json
     {
         "question": "What supernatural being is said to emerge from its grave on Halloween?",
         "answer": "Zombie",
         "difficulty": "hard"
     }
     ```

2. **List All Questions**
   - **Endpoint:** `GET /questions`
   - **Description:** Retrieves all trivia questions from the database.
   
3. **Update an Existing Question**
   - **Endpoint:** `PUT /questions/{id}`
   - **Description:** Updates a trivia question by its ID.
   - **Request Body:**
     ```json
     {
         "question": "What supernatural being is said to emerge from its grave on Halloween?",
         "answer": "Zombie",
         "difficulty": "medium"
     }
     ```

4. **Get Random Questions by Difficulty**
   - **Endpoint:** `GET /questions/random/{difficulty}`
   - **Description:** Retrieves a list of random questions based on the specified difficulty level (easy, medium, hard).

## Technologies Used

- Java
- Spring Boot
- JPA (Java Persistence API)
- H2 Database (or any database of your choice)
- Swagger/OpenAPI for API documentation

![swagger](https://github.com/user-attachments/assets/2aa26024-edfa-49df-9389-41435a823b4b)

## Setup Instructions

1. Clone this repository:
```bash
   `git clone https://github.com/Orliluq/trivia.git`
```
2. Navigate to the project directory:
```bash
   `cd trivia` 
```
3. Build the project:
```bash
   `./mvnw clean install`
```
4. Run the application:
```bash
   `./mvnw spring-boot:run` 
```
5. Access the API documentation at:
```bash
   `http://localhost:8080/swagger-ui.html` 
```

## License
This project is licensed under the MIT License.

## Contributing
Feel free to submit issues or pull requests if you want to contribute to this project!

