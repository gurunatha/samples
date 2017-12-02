package com.val.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toy {
	private int id;
	private String description;

	@Autowired
	public Toy(@Value("#{appValues[toy_description]}") String description,
			@Value("#{appValues[toy_id]}") int id) {
		this.description = description;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Toy [id=" + id + ", description=" + description + "]";
	}

}
