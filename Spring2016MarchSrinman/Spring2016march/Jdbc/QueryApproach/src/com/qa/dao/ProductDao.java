package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.q.bo.ProductDetailsBo;
import com.q.bo.SpecificationBo;

public class ProductDao {
	// sql queries
	private final String SQL_GET_PRODUCT_DETAILS = "SELECT P.PRODUCT_ID, P.PRODUCT_NM, P.TYPE, P.PRICE, S.SPECIFICATION_ID, S.SPECIFICATION_NM, S.DESCR FROM PRODUCTS P, SPECIFICATIONS S WHERE P.PRODUCT_ID = S.PRODUCT_ID";

	// logic
	private JdbcTemplate jdbcTemplate;

	public ProductDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ProductDetailsBo> getProductDetails() {
		return jdbcTemplate.query(SQL_GET_PRODUCT_DETAILS,
				new ProductDetailsExtractor());
	}

	private final class ProductDetailsExtractor implements
			ResultSetExtractor<List<ProductDetailsBo>> {
		@Override
		public List<ProductDetailsBo> extractData(ResultSet rs)
				throws SQLException, DataAccessException {
			Map<Integer, ProductDetailsBo> productMap = null;
			List<ProductDetailsBo> products = null;
			SpecificationBo specification = null;
			ProductDetailsBo product = null;
			int productId = 0;

			productMap = new HashMap<Integer, ProductDetailsBo>();
			while (rs.next()) {
				productId = rs.getInt("PRODUCT_ID");

				if (productMap.containsKey(productId) == false) {
					// if product not yet created then create product and
					// specification
					product = new ProductDetailsBo();
					product.setId(productId);
					product.setName(rs.getString("PRODUCT_NM"));
					product.setType(rs.getString("TYPE"));
					product.setPrice(rs.getFloat("PRICE"));
					productMap.put(productId, product);
				}

				product = productMap.get(productId);
				specification = new SpecificationBo();
				specification.setId(rs.getInt("SPECIFICATION_ID"));
				specification.setName(rs.getString("SPECIFICATION_NM"));
				specification.setDescr(rs.getString("DESCR"));
				if (product.getSpecifications() == null) {
					product.setSpecifications(new ArrayList<SpecificationBo>());
				}
				product.getSpecifications().add(specification);
			}

			if (productMap.size() > 0) {
				products = new ArrayList<ProductDetailsBo>(productMap.values());
			}
			return products;
		}
	}
}
