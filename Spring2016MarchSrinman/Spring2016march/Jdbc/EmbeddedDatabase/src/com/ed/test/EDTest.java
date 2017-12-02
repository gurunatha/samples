package com.ed.test;

import java.util.Date;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ed.bo.ManufacturerBo;
import com.ed.dao.ManufacturerDao;

public class EDTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ed/common/application-context.xml");
		
		DatabaseManagerSwing.main(new String[] { "--url",
				"jdbc:hsqldb:mem:dataSource", "--user", "sa", 
				"--password", "" });
		
		
		ManufacturerDao dao = context.getBean("manufacturerDao",
				ManufacturerDao.class);
		int r = dao.saveManufacturer(new ManufacturerBo(2, "Mahendra",
				"Mahendra Motors", new Date()));
		System.out.println(r);
		
	}
}
