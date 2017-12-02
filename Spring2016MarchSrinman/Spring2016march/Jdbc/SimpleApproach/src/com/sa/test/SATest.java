package com.sa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sa.dao.ManufacturerDao;

public class SATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sa/common/application-context.xml");
		ManufacturerDao dao = context.getBean("manufacturerDao",
				ManufacturerDao.class);
		/*int r = dao.saveManufacturer(new ManufacturerBo(5, "Micromax",
				"Micromax", new Date()));
		System.out.println(r);*/
		String name = dao.findName(2);
		System.out.println(name);
	}
}
