package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class IntrAmtDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=0.0f,rate=0.0f,time=0.0f;
		IntrAmtDetails details=null;
		// get details
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		//store Details into IntrAmtDetails class object
		details=new IntrAmtDetails();
		details.setpAmt(pAmt);details.setRate(rate);details.setTime(time);
		//set object as value to property 
		setValue(details);
	}

}
