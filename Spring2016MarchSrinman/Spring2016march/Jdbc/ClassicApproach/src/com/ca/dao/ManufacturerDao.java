package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.ca.bo.ManufacturerBo;

public class ManufacturerDao {
	// sql queries
	private final String SQL_GET_MANUFACTURERS = "SELECT MANUFACTURER_ID AS MANUF_ID, NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM, EST_DT AS EST_DT FROM MANUFACTURER";

	// logic
	private JdbcTemplate jdbcTemplate;

	public ManufacturerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ManufacturerBo> getManufacturers() {
		return jdbcTemplate.execute(
				new GetManufacturersPreparedStatementCreator(),
				new GetManufacturersPreparedStatementCallback());
	}

	/**
	 * 
	 * @author sriman Contains logic for get all the manufacturers in
	 *         manufacturer table by executing preparedstatement passed
	 */
	private final class GetManufacturersPreparedStatementCreator implements
			PreparedStatementCreator {
		@Override
		public PreparedStatement createPreparedStatement(Connection con)
				throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_GET_MANUFACTURERS);
			return pstmt;
		}
	}

	private final class GetManufacturersPreparedStatementCallback implements
			PreparedStatementCallback<List<ManufacturerBo>> {
		@Override
		public List<ManufacturerBo> doInPreparedStatement(
				PreparedStatement pstmt) throws SQLException,
				DataAccessException {
			List<ManufacturerBo> manufacturers;
			ManufacturerBo bo = null;
			ResultSet rs = null;

			rs = pstmt.executeQuery();
			manufacturers = new ArrayList<ManufacturerBo>();

			while (rs.next()) {
				bo = new ManufacturerBo();
				bo.setManufacturerId(rs.getInt("MANUF_ID"));
				bo.setName(rs.getString("MANUF_NM"));
				bo.setBrandName(rs.getString("MANUF_BRAND_NM"));
				bo.setEstablishedDate(rs.getDate("EST_DT"));

				manufacturers.add(bo);
			}

			return manufacturers;
		}

	}
}
