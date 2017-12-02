package com.mdm.test;

import com.mdm.beans.IMessageProducer;
import com.mdm.beans.MessageWriter;
import com.mdm.util.AppObjectFactory;

public class MDMTest {
	public static void main(String[] args) throws Exception {
		MessageWriter writer = (MessageWriter) AppObjectFactory
				.getObject("MessageWriter.class");
		IMessageProducer messageProducer = (IMessageProducer) AppObjectFactory
				.getObject("IMessageProducer.class");

		writer.setMessageProducer(messageProducer);
		writer.write("Welcome to Dependency Management");
	}
}
