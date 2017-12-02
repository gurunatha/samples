package com.nt.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.controller")
  public class WebAppInitializer 
    extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder application) {
      return application.sources(WebAppInitializer.class);
    }

    public static void main(String[] args) 
      throws Exception {
      SpringApplication.run(WebAppInitializer.class, args);
    }
  }
