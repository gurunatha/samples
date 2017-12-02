package com.dt.service;

import org.springframework.transaction.annotation.Transactional;

import com.dt.bo.ManufacturerBo;
import com.dt.bo.ProductBo;
import com.dt.dao.ManufacturerDao;
import com.dt.dao.ProductDao;
import com.dt.dto.NewManufacturerDto;

public class ManageManufacturerService {
	private ManufacturerDao manufacturerDao;
	private ProductDao productDao;

	@Transactional
	public void addManufacturer(NewManufacturerDto newManufacturerDto) {
		ManufacturerBo manufacturerBo = null;
		ProductBo productBo = null;

		manufacturerBo = new ManufacturerBo();
		manufacturerBo
				.setManufacturerId(newManufacturerDto.getManufacturerId());
		manufacturerBo.setManufacturerName(newManufacturerDto
				.getManufacturerName());
		manufacturerBo.setBrandName(newManufacturerDto.getBrandName());
		manufacturerBo.setEstDate(newManufacturerDto.getEstDate());

		manufacturerDao.saveManufacturer(manufacturerBo);

		productBo = new ProductBo();
		productBo.setProductId(newManufacturerDto.getProductId());
		productBo.setProductName(newManufacturerDto.getProductName());
		productBo.setType(newManufacturerDto.getType());
		productBo.setPrice(newManufacturerDto.getPrice());
		productBo.setManufacturerId(newManufacturerDto
				.getProductManufacturerId());

		productDao.saveProduct(productBo);
	}

	public void setManufacturerDao(ManufacturerDao manufacturerDao) {
		this.manufacturerDao = manufacturerDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
