package com.ed.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ed.bo.ManufacturerBo;

public class ManufacturerDao {
	private final String SQL_INS_MANUF = "INSERT INTO MANUFACTURER(MANUFACTURER_ID, NAME, BRAND_NM, EST_DT) VALUES(?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public ManufacturerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveManufacturer(ManufacturerBo bo) {
		return jdbcTemplate.update(
				SQL_INS_MANUF,
				new Object[] { bo.getId(), bo.getName(), bo.getBrandName(),
						bo.getEstDate() });
	}
}
