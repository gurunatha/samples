package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.config.BeanConfigurator;

public class AnnotationConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		WishGenerator wish=null;
		//create IOC Container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get Bean
/*		wish=ctx.getBean("wish",WishGenerator.class);
		System.out.println("Wish Message:::"+wish.generateWishMsg("raja"));
*/		//close container
		ctx.close();
	}

}
