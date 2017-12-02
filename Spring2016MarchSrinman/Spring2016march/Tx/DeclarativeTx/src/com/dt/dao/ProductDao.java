package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.bo.ProductBo;

public class ProductDao {
	private final String SQL_INSERT_PRODUCT = "INSERT INTO PRODUCTS(PRODUCT_ID, PRODUCT_NM, TYPE, PRICE, MANUFACTURER_ID) VALUES(?,?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public ProductDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveProduct(ProductBo productBo) {
		jdbcTemplate.update(
				SQL_INSERT_PRODUCT,
				new Object[] { productBo.getProductId(),
						productBo.getProductName(), productBo.getType(),
						productBo.getPrice(), productBo.getManufacturerId() });
	}
}
