package com.qa.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.q.bo.ManufacturerBo;
import com.q.bo.ProductDetailsBo;
import com.qa.dao.ManufacturerDao;
import com.qa.dao.ProductDao;

public class QATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/qa/common/application-context.xml");
		/*
		 * ManufacturerDao dao = context.getBean("manufacturerDao",
		 * ManufacturerDao.class); List<Map<String, Object>> records = dao
		 * .getManufacturersAndBrandDetails(); for (Map<String, Object> record :
		 * records) { for (String col : record.keySet()) {
		 * System.out.println(col + ": " + record.get(col)); }
		 * System.out.println("--------------------------------"); }
		 */
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		List<ProductDetailsBo> products = dao.getProductDetails();
		for (ProductDetailsBo bo : products) {
			System.out.println(bo);
		}
	}
}
