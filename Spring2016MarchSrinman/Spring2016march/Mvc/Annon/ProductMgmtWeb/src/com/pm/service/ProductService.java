package com.pm.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pm.dao.ProductDao;
import com.pm.dto.ManufacturerDto;
import com.pm.entities.Manufacturer;
import com.pm.entities.Product;
import com.pm.form.AddProductForm;

@Service
public class ProductService {
	private static Logger logger = Logger.getLogger(ProductService.class);

	@Autowired
	private ProductDao productDao;

	public List<ManufacturerDto> getAllManufacturers() {
		List<ManufacturerDto> manufacturerDtos = null;
		List<Manufacturer> manufacturers = null;

		logger.info("entered into getAllManufacturers");
		manufacturers = productDao.getAllManufacturers();
		logger.debug("productDao returned : " + manufacturers.size()
				+ " manufacturers");

		manufacturerDtos = new ArrayList<ManufacturerDto>();
		for (Manufacturer manufacturer : manufacturers) {
			manufacturerDtos.add(new ManufacturerDto(manufacturer
					.getManufacturerId(), manufacturer.getName()));
		}

		return manufacturerDtos;
	}

	public int saveProduct(AddProductForm productForm) {
		Product product = null;
		Manufacturer manufacturer = null;

		logger.info("entered into saveProduct()");
		product = new Product();
		product.setName(productForm.getName());
		product.setType(productForm.getType());
		product.setPrice(productForm.getPrice());
		logger.debug("retrieving manufacturer from productDao for the manufacturerId : "
				+ productForm.getManufacturer());

		manufacturer = productDao
				.getManufacturer(productForm.getManufacturer());
		logger.debug("retrieved manufacturer : " + manufacturer.getName()
				+ " for manufacturer id : " + productForm.getManufacturer()
				+ " from productDao");

		product.setManufacturer(manufacturer);
		logger.info("calling productDao to save product");
		int productId = productDao.saveProduct(product);
		logger.debug("productDao saved product with productId : " + productId);

		return productId;
	}
}
