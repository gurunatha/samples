package com.npjt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.npjt.bo.ManufacturerBo;

public class ManufacturerDao {
	private final String SQL_GET_NO_OF_MANUFS_BY_NM = "SELECT COUNT(1) FROM MANUFACTURER WHERE NAME LIKE :p_manufNm";
	private final String SQL_GET_MANUFS_BETWEEN_DT = "SELECT MANUFACTURER_ID AS MANUF_ID, NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM, EST_DT FROM MANUFACTURER WHERE EST_DT BETWEEN :p_startDt AND :p_endDt";
	private final String SQL_INSERT_INTO_MANUFACTURER = "INSERT INTO MANUFACTURER(MANUFACTURER_ID, NAME, BRAND_NM, EST_DT) VALUES(:id, :name, :brandName, :estDate)";
	private NamedParameterJdbcTemplate npJdbcTemplate;

	public ManufacturerDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public int getNoOfManufacturers(String name) {
		Map<String, Object> paramMap = null;

		paramMap = new HashMap<String, Object>();
		paramMap.put("p_manufNm", "%" + name + "%");
		return npJdbcTemplate.queryForInt(SQL_GET_NO_OF_MANUFS_BY_NM, paramMap);
	}

	public List<ManufacturerBo> getManufactures(Date startDt, Date endDt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();

		paramSource.addValue("p_startDt", startDt);
		paramSource.addValue("p_endDt", endDt);
		return npJdbcTemplate.query(SQL_GET_MANUFS_BETWEEN_DT, paramSource,
				new ManufacturerRowMapper());
	}

	public int saveManufacturer(ManufacturerBo bo) {
		return npJdbcTemplate.update(SQL_INSERT_INTO_MANUFACTURER,
				new BeanPropertySqlParameterSource(bo));
	}

	private final class ManufacturerRowMapper implements
			RowMapper<ManufacturerBo> {
		@Override
		public ManufacturerBo mapRow(ResultSet rs, int row) throws SQLException {
			return new ManufacturerBo(rs.getInt("MANUF_ID"),
					rs.getString("MANUF_NM"), rs.getString("MANUF_BRAND_NM"),
					rs.getDate("EST_DT"));
		}
	}
}
