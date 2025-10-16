package com.example.service;

import com.example.model.User;

public class GreetingService {
	public String greet(User user) {
        return "Hello, " + user.getName() + "! Welcome to your Spring Boot console app.";
    }

}
