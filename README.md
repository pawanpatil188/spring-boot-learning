# Spring Boot Learning

This repository contains my practical learning and projects while preparing for Java Developer roles.

## Technologies

* Java 17
* Spring Boot
* Maven
* Spring Web
* REST API

## Day 1

Created my first Spring Boot application.

### Topics Practiced

* Spring Boot project structure
* `@SpringBootApplication`
* `SpringApplication.run()`
* `@RestController`
* `@GetMapping`
* Basic REST API
* Running application on port 8080

### APIs

| Method | Endpoint  | Description                |
| ------ | --------- | -------------------------- |
| GET    | `/hello`  | Returns a hello message    |
| GET    | `/name`   | Returns my name            |
| GET    | `/course` | Returns my learning course |







## Day 2 — REST API Fundamentals

### Topics Practiced

* REST API basics
* HTTP GET method
* API endpoints
* URL and port
* `@GetMapping`
* `@PathVariable`
* `@RequestParam`
* Request and response flow

### APIs Created

| Method | Endpoint                     | Purpose                                |
| ------ | ---------------------------- | -------------------------------------- |
| GET    | `/hello`                     | Basic response                         |
| GET    | `/student`                   | Student information                    |
| GET    | `/student/{id}`              | Get student by ID                      |
| GET    | `/student/{id}/name`         | Get student information using ID       |
| GET    | `/student/search?name=Pawan` | Search using request parameter         |
| GET    | `/calculate?a=10&b=20`       | Calculate sum using request parameters |





## Day 3 — Controller and Service Layer

### Topics Practiced

* Layered architecture
* Controller layer
* Service layer
* `@Service`
* Dependency Injection
* Constructor Injection
* IoC basics
* Business logic separation

### Architecture

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Response
```

### APIs

| Method | Endpoint        | Description              |
| ------ | --------------- | ------------------------ |
| GET    | `/student`      | Gets student information |
| GET    | `/calculate`    | Calculates sum           |
| GET    | `/check-number` | Checks even/odd          |
| GET    | `/square`       | Calculates square        |
| GET    | `/greet`        | Returns greeting         |

### Key Learning

The Controller handles HTTP requests, while the Service layer contains business logic. Spring manages the service object and injects it into the Controller using Dependency Injection.
