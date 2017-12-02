package com.mdm.beans;

public class HtmlMessageProducerImpl implements IMessageProducer {
	@Override
	public String convert(String message) {
		return "<html><body>" + message + "</body></html>";
	}
}
