package com.npjt.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjt.bo.ManufacturerBo;
import com.npjt.dao.ManufacturerDao;

public class NPJTTest {
	public static void main(String[] args) throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/npjt/common/application-context.xml");
		ManufacturerDao dao = context.getBean("manufacturerDao",
				ManufacturerDao.class);

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy"); Date
		 * startDate = sdf.parse("01/01/1975"); Date endDate =
		 * sdf.parse("31/12/1985");
		 * 
		 * List<ManufacturerBo> manufacturers = dao.getManufactures(startDate,
		 * endDate); for (ManufacturerBo bo : manufacturers) {
		 * System.out.println(bo); }
		 */

		ManufacturerBo bo = new ManufacturerBo(4, "Mahindra",
				"Mahindra Motors", new Date());
		int r = dao.saveManufacturer(bo);
		System.out.println(r);
	}
}
