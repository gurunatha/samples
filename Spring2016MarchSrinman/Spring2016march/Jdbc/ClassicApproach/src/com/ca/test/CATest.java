package com.ca.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.bo.ManufacturerBo;
import com.ca.dao.ManufacturerDao;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ca/common/application-context.xml");
		ManufacturerDao dao = context.getBean("manufacturerDao",
				ManufacturerDao.class);
		List<ManufacturerBo> manufacturers = dao.getManufacturers();
		System.out.println(manufacturers);
	}
}
