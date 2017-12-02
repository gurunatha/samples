package com.nt.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
public class MvcBootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(MvcBootApp2Application.class, args);
	}
}
