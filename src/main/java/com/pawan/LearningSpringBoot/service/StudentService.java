package com.pawan.LearningSpringBoot.service;

import com.pawan.LearningSpringBoot.component.MessageComponent;
import com.pawan.LearningSpringBoot.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final MessageComponent messageComponent;

    public StudentService(MessageComponent messageComponent) {
        this.messageComponent = messageComponent;
    }

    public String getStudent() {
        return "Student : Pawan, Course : Java";
    }

    public String getMessage() {
        return messageComponent.getMessage();
    }

    public Student createStudent(Student student) {
        return student;
    }
}