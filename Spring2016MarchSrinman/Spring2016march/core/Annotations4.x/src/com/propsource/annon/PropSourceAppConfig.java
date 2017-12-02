package com.propsource.annon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropSourceAppConfig {
	@Value("${book.isbn}")
	private String isbn;

	@Value("${book.title}")
	private String title;

	@Bean(name = "book")
	public Book newBook() {
		Book book = new Book();
		book.setIsbn(isbn);
		book.setTitle(title);
		return book;
	}

	@Bean
	public static PropertyPlaceholderConfigurer newPropertiesPlaceHolderConfigurer() {
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource(
				"com/propsource/annon/ps-app.properties"));
		return configurer;
	}
}
