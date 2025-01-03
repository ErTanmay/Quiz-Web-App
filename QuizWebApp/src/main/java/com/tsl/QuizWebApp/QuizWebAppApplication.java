package com.tsl.QuizWebApp;

import com.tsl.QuizWebApp.model.Question;
import com.tsl.QuizWebApp.repo.QuestionJPARepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuizWebAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(QuizWebAppApplication.class, args);
	}


}
