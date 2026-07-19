package com.beans.example;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	private final UserService userService;

	public ExampleApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
	public void run(String[] args) {
		userService.saveUser("Pranav");
	}
}
