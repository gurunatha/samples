package com.pgm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pgm.bo.ProductBo;

public class ProductDaoImpl implements ProductDao {
	// sql queries
	private final String SQL_GET_PRODUCTS = "SELECT PRODUCT_ID, NAME, DESCR, MANUFACTURER, PRICE FROM PRODUCT ORDER BY NAME";
	private final String SQL_GET_PRODUCT_BY_ID = "SELECT PRODUCT_ID, NAME, DESCR, MANUFACTURER, PRICE FROM PRODUCT WHERE PRODUCT_ID = ?";
	private final String SQL_EDIT_PRODUCT = "UPDATE PRODUCT SET NAME=?, DESCR = ?, MANUFACTURER = ?, PRICE = ? WHERE PRODUCT_ID = ?";
	private final String SQL_GET_MANUFACTURER_NAMES = "SELECT MANUFACTURER FROM PRODUCT ORDER BY MANUFACTURER";

	private JdbcTemplate jdbcTemplate;

	public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<ProductBo> getAllProducts() {
		return jdbcTemplate.query(SQL_GET_PRODUCTS, new ProductRowMapper());
	}

	@Override
	public ProductBo getProduct(int productId) {
		return jdbcTemplate.queryForObject(SQL_GET_PRODUCT_BY_ID,new ProductRowMapper(), new Object[] { productId });
	}

	@Override
	public void editProduct(ProductBo productBo) {
		jdbcTemplate.update(SQL_EDIT_PRODUCT,new Object[] { productBo.getName(), productBo.getDescription(),productBo.getManufacturer(), productBo.getPrice(),
						productBo.getProductId() });
	}

	@Override
	public List<String> getAllManufacturerNames() {
		return jdbcTemplate.query(SQL_GET_MANUFACTURER_NAMES,new RowMapper<String>() {
					@Override
					public String mapRow(ResultSet rs, int index)
							throws SQLException {
						return rs.getString("MANUFACTURER");
					}
				});
	}

	private final class ProductRowMapper implements RowMapper<ProductBo> {
		@Override
		public ProductBo mapRow(ResultSet rs, int index) throws SQLException {
			return new ProductBo(rs.getInt("PRODUCT_ID"), rs.getString("NAME"),
					rs.getString("DESCR"), rs.getString("MANUFACTURER"),
					rs.getFloat("PRICE"));
		}
	}

}
