package com.lm.annon;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public class Container {
	public void receive(String data) {
		Handler handler = null;

		handler = lookupHandler();
		handler.setData(data);
		handler.process();
	}

	@Lookup("requestHandler")
	public Handler lookupHandler(){return null;};
}
