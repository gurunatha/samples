package com.imp.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(AppConfig.class)
@ImportResource("com/imp/annon/importresource-context.xml")
public class RootAppConfig {
	@Bean(name = "person", autowire = Autowire.BY_NAME)
	public Person person() {
		Person person = new Person();
		return person;
	}
}
