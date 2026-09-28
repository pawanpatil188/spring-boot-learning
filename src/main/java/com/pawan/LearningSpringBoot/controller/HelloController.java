package com.pawan.LearningSpringBoot.controller;

import com.pawan.LearningSpringBoot.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

//    @GetMapping("/student")
//    public String student() {
//        return "Student: Pawan, Course: Java";
//    }

//    @GetMapping("/student/{id}")
//    public String getStudent(@PathVariable int id) {
//        return "Student ID: " + id;
//    }

//    @GetMapping("/student/{id}/name")
//    public String getStudentName(@PathVariable int id) {
//        return "Student ID: " + id + ", Name: Pawan";
//    }

//    @GetMapping("/student/search")
//    public String searchStudent(@RequestParam String name) {
//        return "Searching student: " + name;
//    }

//    @GetMapping("/calculate")
//    public String calculate(
//            @RequestParam int a,
//            @RequestParam int b) {
//
//        return "Sum: " + (a + b);
//    }


    private final StudentService studentService;
    public HelloController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String Student(){
        return studentService.getStudent();
    }

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam int a,
            @RequestParam int b) {

        return "Sum: " + studentService.calculateSum(a,b);
    }

    @GetMapping("/check-number")
    public String checkNumber(@RequestParam int number){

        return studentService.checkEvenOdd(number);
    }

    @GetMapping("/checkSquare")
    public int squareOfNumber(@RequestParam int num){
        return studentService.squareOfNumber(num);
    }
}