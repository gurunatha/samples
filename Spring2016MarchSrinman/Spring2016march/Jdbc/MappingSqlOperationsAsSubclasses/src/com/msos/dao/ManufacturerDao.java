package com.msos.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.msos.bo.ManufacturerBo;

public class ManufacturerDao {
	private final String SQL_INS_MANUF = "INSERT INTO MANUFACTURER(MANUFACTURER_ID, NAME, BRAND_NM, EST_DT) VALUES(?,?,?,?)";
	private final String SQL_GET_MANUF_BY_NM = "SELECT MANUFACTURER_ID AS MANUF_ID, NAME AS MANUF_NM, BRAND_NM AS MANUF_BRAND_NM, EST_DT FROM MANUFACTURER WHERE NAME LIKE ?";

	private DataSource dataSource;

	private NewManufacturer newManufacturer;
	private GetManufacturers getManufacturers;

	public ManufacturerDao(DataSource dataSource) {
		this.dataSource = dataSource;
		this.newManufacturer = new NewManufacturer(dataSource);
		this.getManufacturers = new GetManufacturers(dataSource);
	}

	public int saveManufacturer(ManufacturerBo bo) {
		return newManufacturer.save(bo);
	}

	public List<ManufacturerBo> getManufacturers(String name) {
		return getManufacturers.list(name);
	}

	private final class NewManufacturer extends SqlUpdate {
		public NewManufacturer(DataSource dataSource) {
			super(dataSource, SQL_INS_MANUF);
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.DATE));
			compile();
		}

		public int save(ManufacturerBo bo) {
			return super.update(new Object[] { bo.getId(), bo.getName(),
					bo.getBrandName(), bo.getEstDate() });
		}
	}

	private final class GetManufacturers extends
			MappingSqlQuery<ManufacturerBo> {

		public GetManufacturers(DataSource dataSource) {
			super(dataSource, SQL_GET_MANUF_BY_NM);
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}

		@Override
		protected ManufacturerBo mapRow(ResultSet rs, int row)
				throws SQLException {
			return new ManufacturerBo(rs.getInt("MANUF_ID"),
					rs.getString("MANUF_NM"), rs.getString("MANUF_BRAND_NM"),
					rs.getDate("EST_DT"));
		}

		public List<ManufacturerBo> list(String name) {
			return super.execute(new Object[] { "%" + name + "%" });
		}

	}
}
