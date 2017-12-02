package com.mdm.util;

import com.mdm.beans.HtmlMessageProducerImpl;
import com.mdm.beans.IMessageProducer;
import com.mdm.beans.PdfMessageProducerImpl;

public class MessageProducerFactory {
	public static IMessageProducer createMessageProducer(String type) {
		IMessageProducer messageProducer = null;

		if (type.equals("html")) {
			messageProducer = new HtmlMessageProducerImpl();
		} else if (type.equals("pdf")) {
			messageProducer = new PdfMessageProducerImpl();
		}

		return messageProducer;
	}
}
