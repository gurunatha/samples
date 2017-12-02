package com.fs.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void write(String message) {
		String cmessage = null;

		cmessage = messageProducer.convert(message);
		System.out.println(cmessage);
	}

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

}
