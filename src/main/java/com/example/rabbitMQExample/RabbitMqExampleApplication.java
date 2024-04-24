package com.example.rabbitMQExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class RabbitMqExampleApplication implements CommandLineRunner {

//	@Autowired
//	private RabbitMaConfig messageSender;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqExampleApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		messageSender.processMessage("topic.first", "Hello, RabbitMQ with topic.first!");
//
//		messageSender.processMessage("topic.second", "Hello, RabbitMQ with topic.second!");
	}

}
