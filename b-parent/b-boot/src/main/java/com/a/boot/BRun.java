package com.a.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BRun {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BRun.class);
		application.run(args);
	}
}
