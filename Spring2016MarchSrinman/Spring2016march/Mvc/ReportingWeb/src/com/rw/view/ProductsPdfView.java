package com.rw.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.rw.dto.ProductDto;

public class ProductsPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> modelMap,
			Document pdfDocument, PdfWriter pdfWriter,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ProductDto> products = null;

		products = (List<ProductDto>) modelMap.get("products");
		Table productsTable = new Table(3);
		for (int i = 0; i < products.size(); i++) {
			ProductDto dto = products.get(i);
			productsTable.addCell(String.valueOf(dto.getProductId()));
			productsTable.addCell(dto.getName());
			productsTable.addCell(String.valueOf(dto.getPrice()));
		}
		pdfDocument.add(productsTable);
	}

}
