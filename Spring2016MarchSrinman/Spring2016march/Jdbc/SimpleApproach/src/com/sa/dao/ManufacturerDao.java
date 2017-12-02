package com.sa.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.sa.bo.ManufacturerBo;

public class ManufacturerDao {
	private DataSource dataSource;

	public ManufacturerDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public String findName(int manufacturerId) {
		SimpleJdbcCall getManufacturerName = null;
		Map<String, Object> paramMap = null;

		getManufacturerName = new SimpleJdbcCall(dataSource);
		getManufacturerName.setProcedureName("GET_MANUFACTURER_NM");
		paramMap = new HashMap<String, Object>();
		paramMap.put("PID", manufacturerId);

		Map<String, Object> outMap = getManufacturerName.execute(paramMap);
		return (String) outMap.get("ONM");
	}

	public int saveManufacturer(ManufacturerBo bo) {
		SimpleJdbcInsert manufacturerJdbcInsert = null;
		Map<String, Object> paramMap = null;

		manufacturerJdbcInsert = new SimpleJdbcInsert(dataSource);
		manufacturerJdbcInsert.setTableName("MANUFACTURER");
		paramMap = new HashMap<String, Object>();

		paramMap.put("MANUFACTURER_ID", bo.getId());
		paramMap.put("NAME", bo.getName());
		paramMap.put("BRAND_NM", bo.getBrandName());
		paramMap.put("EST_DT", bo.getEstDate());

		return manufacturerJdbcInsert.execute(paramMap);
	}
}
