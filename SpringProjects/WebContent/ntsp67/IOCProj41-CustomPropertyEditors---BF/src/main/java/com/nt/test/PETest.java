package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.editors.IntrAmtDetailsEditor;

public class PETest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		IntrAmtCalculator calculator=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//add CustomPropertyEditorRegistrar with IOC Container
		((XmlBeanFactory)factory).addPropertyEditorRegistrar(new MyPropertyEditorRegistrar());
		//get Bean
		calculator=factory.getBean("iCalculator",IntrAmtCalculator.class);
		System.out.println("Intrest Amount:::"+calculator.calculateIntrAmount());
	}//main
	private static class MyPropertyEditorRegistrar implements PropertyEditorRegistrar{

		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(IntrAmtDetails.class,new IntrAmtDetailsEditor());
		}
		
	}
}//class
