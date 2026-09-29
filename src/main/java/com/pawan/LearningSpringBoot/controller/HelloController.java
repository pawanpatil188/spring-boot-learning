package com.pawan.LearningSpringBoot.controller;

import com.pawan.LearningSpringBoot.model.Student;
import com.pawan.LearningSpringBoot.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/name")
    public String name() {
        return "Pawan Patil";
    }

    @GetMapping("/course")
    public String course() {
        return "Java and Spring Boot";
    }

    private final StudentService studentService;

    public HelloController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/message")
    public String message() {
        return studentService.getMessage();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}