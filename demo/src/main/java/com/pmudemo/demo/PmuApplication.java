package com.pmudemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.pmudemo.controller", "com.pmudemo.service", "com.pmudemo.config" })
public class PmuApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmuApplication.class, args);
	}
}
