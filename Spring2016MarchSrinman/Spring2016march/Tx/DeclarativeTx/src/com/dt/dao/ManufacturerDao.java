package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.bo.ManufacturerBo;

public class ManufacturerDao {
	private final String SQL_INSERT_MANUFACTURER = "INSERT INTO MANUFACTURER(MANUFACTURER_ID, NAME, BRAND_NM, EST_DT) VALUES(?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public ManufacturerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveManufacturer(ManufacturerBo manufacturerBo) {
		jdbcTemplate.update(
				SQL_INSERT_MANUFACTURER,
				new Object[] { manufacturerBo.getManufacturerId(),
						manufacturerBo.getManufacturerName(),
						manufacturerBo.getBrandName(),
						manufacturerBo.getEstDate() });
	}

}
