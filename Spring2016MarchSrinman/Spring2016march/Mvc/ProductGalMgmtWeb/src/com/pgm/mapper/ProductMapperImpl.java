package com.pgm.mapper;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.pgm.bo.ProductBo;
import com.pgm.dto.ProductDto;

public class ProductMapperImpl implements ProductMapper {

	@Override
	public ProductDto mapProductBoToProductDto(ProductBo productBo) {
		ProductDto productDto = null;

		productDto = new ProductDto();
		try {
			BeanUtils.copyProperties(productDto, productBo);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return productDto;
	}

	@Override
	public ProductBo mapProductDtoToProductBo(ProductDto productDto) {
		ProductBo productBo = null;

		productBo = new ProductBo();
		try {
			BeanUtils.copyProperties(productBo, productDto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return productBo;
	}

}
