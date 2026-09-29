package com.pawan.LearningSpringBoot.component;

import org.springframework.stereotype.Component;

@Component
public class MessageComponent {

    public String getMessage() {
        return "Hello from MessageComponent";
    }
}