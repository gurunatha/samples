package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null,locale1=null,locale2=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		JFrame frame=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create Local object
		locale=new Locale(args[0],args[1] );
		locale1=new Locale("fr","FR");
		locale2=new Locale("de","DE");
		//create JFrame
		frame=new JFrame("I18n App");
		frame.setLayout(new FlowLayout());
		//create Buttons
		btn1=new JButton(ctx.getMessage("label1",new Object[]{"hello"},"l11",locale));
		System.out.println(ctx.getMessage("label1",new Object[]{"hello"},"l11",locale1));
		System.out.println(ctx.getMessage("label1",new Object[]{"hello"},"l11",locale2));
		
		btn2=new JButton(ctx.getMessage("label2",null,"l2",locale));
		btn3=new JButton(ctx.getMessage("label3",null,"l3",locale));
		btn4=new JButton(ctx.getMessage("label4",null,"l4",locale));
		frame.add(btn1);frame.add(btn2);frame.add(btn3);frame.add(btn4);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//close IOC
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
