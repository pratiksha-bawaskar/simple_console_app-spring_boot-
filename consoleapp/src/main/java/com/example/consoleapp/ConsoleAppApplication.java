package com.example.consoleapp;

import com.example.service.GreetingService;
import com.example.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsoleAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        GreetingService service = new GreetingService();
        User user = new User("Pratiksha");
        System.out.println(service.greet(user));
    }
}
