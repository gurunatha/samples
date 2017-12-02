package com.rw.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.rw.dto.ProductDto;

public class ProductsExcelView extends AbstractExcelView {
	@Override
	protected void buildExcelDocument(Map<String, Object> modelMap,
			HSSFWorkbook workBook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<ProductDto> products = null;
		HSSFSheet productSheet = null;

		products = (List<ProductDto>) modelMap.get("products");
		productSheet = workBook.createSheet("products");

		for (int i = 0; i < products.size(); i++) {
			ProductDto dto = products.get(i);
			HSSFRow row = productSheet.createRow(i + 1);
			HSSFCell cell1 = row.createCell(1);
			cell1.setCellValue(dto.getProductId());

			HSSFCell cell2 = row.createCell(2);
			cell2.setCellValue(dto.getName());

			HSSFCell cell3 = row.createCell(3);
			cell3.setCellValue(dto.getPrice());
		}
	}
}
