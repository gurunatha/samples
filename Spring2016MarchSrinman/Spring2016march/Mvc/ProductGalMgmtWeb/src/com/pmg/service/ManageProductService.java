package com.pmg.service;

import java.util.List;

import com.pgm.dto.ProductDto;

public interface ManageProductService {
	List<ProductDto> getProducts();

	ProductDto getProduct(int id);

	void updateProduct(ProductDto productDto);
	
	List<String> getManufacturerNames();
}
