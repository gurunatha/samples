package com.fs.beans;

public class PdfMessageProducerImpl implements IMessageProducer {

	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
