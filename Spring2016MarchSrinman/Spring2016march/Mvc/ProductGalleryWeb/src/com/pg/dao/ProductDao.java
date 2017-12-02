package com.pg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pg.bo.ProductSpecificationBo;
import com.pg.bo.SpecificationBo;

public class ProductDao {
	private final String SQL_GET_PRODUCTS_AND_SPECIFICATIONS = "SELECT P.PRODUCT_ID, P.PRODUCT_NM, P.TYPE,P.PRICE,P.MANUFACTURER_ID,P.OFFER_TYPE, S.SPECIFICATION_ID, S.SPECIFICATION_NM, S.DESCR FROM PRODUCTS P INNER JOIN SPECIFICATIONS S ON P.PRODUCT_ID = S.PRODUCT_ID WHERE P.OFFER_TYPE = ?";
	private JdbcTemplate jdbcTemplate;

	public ProductDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ProductSpecificationBo> getProductsWithSpecification(String offerType) {
		return jdbcTemplate.query(SQL_GET_PRODUCTS_AND_SPECIFICATIONS,
				new ProductsAndSpecificationResultSetExtractor(),
				new Object[] { offerType });
	}

	private final class ProductsAndSpecificationResultSetExtractor implements
			ResultSetExtractor<List<ProductSpecificationBo>> {

		@Override
		public List<ProductSpecificationBo> extractData(ResultSet rs)
				throws SQLException, DataAccessException {
			List<ProductSpecificationBo> productsAndSpecification = null;
			Map<Integer, ProductSpecificationBo> productMap = null;
			ProductSpecificationBo productSpecificationBo = null;
			SpecificationBo specificationBo = null;
			int productId = 0;

			productMap = new HashMap<Integer, ProductSpecificationBo>();

			while (rs.next()) {
				productId = rs.getInt("PRODUCT_ID");

				if (productMap.containsKey(productId) == false) {
					productSpecificationBo = new ProductSpecificationBo();
					productSpecificationBo.setProductId(productId);
					productSpecificationBo.setName(rs.getString("PRODUCT_NM"));
					productSpecificationBo.setType(rs.getString("TYPE"));
					productSpecificationBo.setPrice(rs.getFloat("PRICE"));
					productSpecificationBo.setOfferType(rs
							.getString("OFFER_TYPE"));
					productMap.put(productId, productSpecificationBo);
				}
				specificationBo = new SpecificationBo(
						rs.getInt("SPECIFICATION_ID"),
						rs.getString("SPECIFICATION_NM"), rs.getString("DESCR"));
				productMap.get(productId).getSpecifications()
						.add(specificationBo);
			}
			productsAndSpecification = new ArrayList<ProductSpecificationBo>();
			if (productMap != null) {
				for (Integer pId : productMap.keySet()) {
					productsAndSpecification.add(productMap.get(pId));
				}
			}
			return productsAndSpecification;
		}
	}
}
