package com.mdm.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void write(String message) {
		String cmessage = null;

		// messageProducer =//
		// MessageProducerFactory.createMessageProducer("pdf");
		cmessage = messageProducer.convert(message);
		System.out.println(cmessage);
	}

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

}
