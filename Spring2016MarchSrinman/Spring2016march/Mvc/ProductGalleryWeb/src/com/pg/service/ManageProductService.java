package com.pg.service;

import java.util.ArrayList;
import java.util.List;

import com.pg.bo.ProductSpecificationBo;
import com.pg.bo.SpecificationBo;
import com.pg.dao.ProductDao;
import com.pg.dto.ProductDetailsDto;

public class ManageProductService {
	private ProductDao productDao;

	public List<ProductDetailsDto> getProducts(String offerType) {
		List<ProductSpecificationBo> productsAndSpecifications = null;
		List<ProductDetailsDto> productDetails = null;
		ProductDetailsDto productDetail = null;

		productsAndSpecifications = productDao.getProductsWithSpecification(offerType);
		productDetails = new ArrayList<ProductDetailsDto>();
		for (ProductSpecificationBo bo : productsAndSpecifications) {
			productDetail = new ProductDetailsDto();
			productDetail.setProductId(bo.getProductId());
			productDetail.setName(bo.getName());
			productDetail.setPrice(bo.getPrice());

			for (SpecificationBo sbo : bo.getSpecifications()) {
				productDetail.getSpecifications().add(sbo.getDescription());
			}
			productDetails.add(productDetail);
		}
		return productDetails;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
