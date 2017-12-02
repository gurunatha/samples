package com.pgm.dao;

import java.util.List;

import com.pgm.bo.ProductBo;

public interface ProductDao {
	List<ProductBo> getAllProducts();

	ProductBo getProduct(int productId);

	void editProduct(ProductBo productBo);

	List<String> getAllManufacturerNames();
}
