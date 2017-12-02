package com.pgm.mapper;

import com.pgm.bo.ProductBo;
import com.pgm.dto.ProductDto;

public interface ProductMapper {
	ProductDto mapProductBoToProductDto(ProductBo productBo);

	ProductBo mapProductDtoToProductBo(ProductDto productDto);
}
