package com.po.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.po.dao.ProductDao;
import com.po.entities.Product;

public class POTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/po/common/application-context.xml");
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		Product product = new Product();
		product.setName("Wallet");
		product.setDescription("Personal Wallet");
		product.setManufacturer("Levis");
		product.setPrice(3533.43f);

		int id = dao.saveProduct(product);
		System.out.println(" id : " + id);
	}
}
