package com.pgm.dao;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pgm.bo.ProductBo;

public class ProductDaoTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Work\\Spring\\Master\\20160311\\Mvc\\ProductGalMgmtWeb\\WebContent\\WEB-INF\\spring\\persistence-beans.xml");
		ProductDao dao = context.getBean("productDao", ProductDao.class);
		ProductBo bo = dao.getProduct(1);
		System.out.println(bo.getName());
	}
}