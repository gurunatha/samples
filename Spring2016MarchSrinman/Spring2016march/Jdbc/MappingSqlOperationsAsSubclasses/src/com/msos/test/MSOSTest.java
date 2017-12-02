package com.msos.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msos.bo.ManufacturerBo;
import com.msos.dao.ManufacturerDao;

public class MSOSTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/msos/common/application-context.xml");
		ManufacturerDao dao = context.getBean("manufacturerDao",
				ManufacturerDao.class);
		/*
		 * int r = dao.saveManufacturer(new ManufacturerBo(6, "Wipro",
		 * "Wipro Pvt Ltd", new Date())); System.out.println(r);
		 */
		List<ManufacturerBo> manufactures = dao.getManufacturers("e");
		for (ManufacturerBo bo : manufactures) {
			System.out.println(bo);
		}
	}

}
