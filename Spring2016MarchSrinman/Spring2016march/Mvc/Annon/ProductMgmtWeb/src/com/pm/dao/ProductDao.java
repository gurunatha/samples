package com.pm.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pm.entities.Manufacturer;
import com.pm.entities.Product;

@Repository
public class ProductDao {
	private static Logger logger = Logger.getLogger(ProductDao.class);

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Manufacturer> getAllManufacturers() {
		logger.info("entered into getAllManufacturers");
		return (List<Manufacturer>) hibernateTemplate.find("from Manufacturer",
				null);
	}

	public Manufacturer getManufacturer(int manufacturerId) {
		logger.debug("entered into getManufacturer(" + manufacturerId + ")");
		return hibernateTemplate.load(Manufacturer.class, manufacturerId);
	}

	public int saveProduct(Product product) {
		logger.info("entered into saveProduct()");
		return (int) hibernateTemplate.save(product);
	}
}
