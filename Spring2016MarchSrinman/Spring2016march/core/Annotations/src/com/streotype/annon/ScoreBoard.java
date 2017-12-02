package com.streotype.annon;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Named
public class ScoreBoard {
	@PostConstruct
	public void init() {
		System.out.println("scoreboard created..");
	}

	@PreDestroy
	public void release() {
		System.out.println("scoreboard removed...");
	}

	public void display() {
		System.out.println("displayed...");
	}
}
