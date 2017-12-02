package com.pmg.service;

import java.util.ArrayList;
import java.util.List;

import com.pgm.bo.ProductBo;
import com.pgm.dao.ProductDao;
import com.pgm.dto.ProductDto;
import com.pgm.mapper.ProductMapper;

public class ManageProductServiceImpl implements ManageProductService {
	private ProductMapper productMapper;
	private ProductDao productDao;

	@Override
	public List<ProductDto> getProducts() {
		List<ProductBo> productBos = null;
		List<ProductDto> productDtos = null;
		ProductDto productDto = null;

		productDtos = new ArrayList<ProductDto>();
		productBos = productDao.getAllProducts();
		for (ProductBo productBo : productBos) {
			productDto = productMapper.mapProductBoToProductDto(productBo);
			productDtos.add(productDto);
		}
		return productDtos;
	}

	@Override
	public ProductDto getProduct(int id) {
		return productMapper
				.mapProductBoToProductDto(productDao.getProduct(id));
	}

	@Override
	public void updateProduct(ProductDto productDto) {
		productDao.editProduct(productMapper
				.mapProductDtoToProductBo(productDto));
	}

	@Override
	public List<String> getManufacturerNames() {
		return productDao.getAllManufacturerNames();
	}

	public void setProductMapper(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
