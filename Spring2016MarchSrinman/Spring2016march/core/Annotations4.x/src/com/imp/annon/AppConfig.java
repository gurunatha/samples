package com.imp.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/imp/annon/app.properties")
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public Passport passport() {
		Passport passport = new Passport();
		passport.setPassportNo(Integer.parseInt(env.getProperty("Passport.id")));
		passport.setName(env.getProperty("Passport.name"));
		return passport;
	}
}
