package com.nt.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.MVCAppConfig;
import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;

@SpringBootApplication
@Import(value={MVCAppConfig.class,ServiceConfig.class,PersistenceConfig.class})
public class BootMvcApp2SfcLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcApp2SfcLoginAppApplication.class, args);
	}
}
