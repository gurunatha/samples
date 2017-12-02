package com.cpe.editors;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.ComplexNumber;

public class ComplexNumberPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		ComplexNumber cn = null;
		String[] tokens = null;

		tokens = text.split(",");
		cn = new ComplexNumber();
		cn.setBase(Integer.parseInt(tokens[0]));
		cn.setExpo(Integer.parseInt(tokens[1]));

		setValue(cn);
	}
}
