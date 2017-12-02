package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.q.bo.ManufacturerBo;

public class ManufacturerDao {
	// sql queries
	private final String SQL_GET_NO_OF_MANUFS = "SELECT COUNT(1) FROM MANUFACTURER";
	private final String SQL_FIND_MANUF_NM_BY_MANUF_ID = "SELECT NAME FROM MANUFACTURER WHERE MANUFACTURER_ID = ?";
	private final String SQL_FIND_MANUF_BY_MANUF_ID = "SELECT MANUFACTURER_ID AS MANUF_ID, NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM, EST_DT FROM MANUFACTURER WHERE MANUFACTURER_ID = ?";
	private final String SQL_GET_MANUFACTURERS = "SELECT MANUFACTURER_ID AS MANUF_ID, NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM, EST_DT FROM MANUFACTURER";
	private final String SQL_UPD_MANUF_NM_BY_MANUF_ID = "UPDATE MANUFACTURER SET NAME = ? WHERE MANUFACTURER_ID = ?";
	private final String SQL_GET_MANUF_AND_BRAND_NM = "SELECT NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM FROM MANUFACTURER";

	// logic
	private JdbcTemplate jdbcTemplate;

	public ManufacturerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getNoOfMerchants() {
		return jdbcTemplate.queryForInt(SQL_GET_NO_OF_MANUFS);
	}

	public String findManufacturerName(int manufacturerId) {
		return jdbcTemplate.queryForObject(SQL_FIND_MANUF_NM_BY_MANUF_ID,
				String.class, new Object[] { manufacturerId });
	}

	public ManufacturerBo findManufacturer(int manufacturerId) {
		return jdbcTemplate.queryForObject(SQL_FIND_MANUF_BY_MANUF_ID,
				new ManufacturerRowMapper(), new Object[] { manufacturerId });
	}

	public List<ManufacturerBo> getManufacturers() {
		return jdbcTemplate.query(SQL_GET_MANUFACTURERS,
				new ManufacturerRowMapper());
	}

	public int updateManufNameById(int manufacturerId, String name) {
		return jdbcTemplate.update(SQL_UPD_MANUF_NM_BY_MANUF_ID, new Object[] {
				name, manufacturerId });
	}

	public List<Map<String, Object>> getManufacturersAndBrandDetails() {
		return jdbcTemplate.queryForList(SQL_GET_MANUF_AND_BRAND_NM);
	}

	private final class ManufacturerRowMapper implements
			RowMapper<ManufacturerBo> {
		@Override
		public ManufacturerBo mapRow(ResultSet rs, int row) throws SQLException {
			ManufacturerBo bo = null;

			bo = new ManufacturerBo(rs.getInt("MANUF_ID"),
					rs.getString("MANUF_NM"), rs.getString("MANUF_BRAND_NM"),
					rs.getDate("EST_DT"));
			return bo;
		}

	}
}
