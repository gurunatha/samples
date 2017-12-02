package com.idr.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Radio {
	private Receiver receiver;
	private String receiverID;

	public Radio(String receiverID) {
		this.receiverID = receiverID;
	}

	public void play(int band) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/idr/common/application-context.xml"));
		receiver = factory.getBean(receiverID, Receiver.class);
		receiver.tune(band);
		System.out.println("playing...");
	}
}
