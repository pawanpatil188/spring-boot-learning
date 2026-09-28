package com.pawan.LearningSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String getStudent() {
        return "Student: Pawan, Course: Java";
    }

    public int calculateSum(int a, int b){
        return a+b;
    }

    public String checkEvenOdd(int num){
        if (num % 2 == 0){
            return "EVEN";
        }

        return "ODD";
    }
    public int squareOfNumber(int num) {
        int sq = num * num;
        return sq;
    }

}
