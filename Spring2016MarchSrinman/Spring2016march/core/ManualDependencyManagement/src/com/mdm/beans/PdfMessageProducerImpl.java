package com.mdm.beans;

public class PdfMessageProducerImpl implements IMessageProducer {

	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
