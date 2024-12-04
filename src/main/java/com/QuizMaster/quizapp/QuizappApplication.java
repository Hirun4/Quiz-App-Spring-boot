package com.QuizMaster.quizapp;

import org.springframework.boot.SpringApplication; //This class is responsible for bootstrapping and launching the Spring application from a main method.
import org.springframework.boot.autoconfigure.SpringBootApplication; //This is a special annotation that marks the main class of a Spring Boot application.

@SpringBootApplication
public class QuizappApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

}
