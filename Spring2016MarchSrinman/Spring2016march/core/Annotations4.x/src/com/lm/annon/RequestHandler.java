package com.lm.annon;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestHandler implements Handler {
	private String data;

	@Override
	public void process() {
		System.out.println("processing : " + data + " ...");
	}

	public void setData(String data) {
		this.data = data;
	}

}
