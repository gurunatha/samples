package com.nt.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.MVCAppConfig;

@SpringBootApplication
@Import(value={MVCAppConfig.class})
public class BootMvcApp2SfcLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcApp2SfcLoginAppApplication.class, args);
	}
}
