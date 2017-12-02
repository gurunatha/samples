package com.aa.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.mba.security.core.AuthenticationManager;

@Configuration
@ImportResource("com/aa/common/application-context.xml")
public class AppConfig {
	@Bean(name = "authenticationManager")
	public AuthenticationManager authenticationManager() {
		return AuthenticationManager.getInstance();
	}
}
