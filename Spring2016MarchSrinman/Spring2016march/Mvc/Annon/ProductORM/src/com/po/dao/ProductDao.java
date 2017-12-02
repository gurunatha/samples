package com.po.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.po.entities.Product;

public class ProductDao {
	private HibernateTemplate hibernateTemplate;

	public int saveProduct(Product product) {
		return (int) hibernateTemplate.save(product);
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
