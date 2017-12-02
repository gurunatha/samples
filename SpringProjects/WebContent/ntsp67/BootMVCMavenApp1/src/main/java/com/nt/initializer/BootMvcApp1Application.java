package com.nt.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.nt.config.ServiceConfig;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
@Import(value=ServiceConfig.class)
public class BootMvcApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcApp1Application.class, args);
	}
}
