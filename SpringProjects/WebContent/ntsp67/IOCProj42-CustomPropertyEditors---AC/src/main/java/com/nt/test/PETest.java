package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.editors.IntrAmtDetailsEditor;

public class PETest {

	public static void main(String[] args) {
       ApplicationContext ctx=null;
		IntrAmtCalculator calculator=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//add CustomPropertyEditorRegistrar with IOC Container
		//get Bean
		calculator=ctx.getBean("iCalculator",IntrAmtCalculator.class);
		System.out.println("Intrest Amount:::"+calculator.calculateIntrAmount());
	}//main
}//class
