package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;


public class MyPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, com.lowagie.text.Document doc,
			com.lowagie.text.pdf.PdfWriter pw, HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<String>studList=null;
		Paragraph p=null;
		Table t=null;
		//get Model Attribute value
		studList=(List<String>)map.get("namesList");
		//construct pdf doucment
		p = new Paragraph("Student details");
		p.setAlignment("center");
		p.setFont(new Font(Font.BOLD));
		doc.add(p);
				
		t = new Table(1);
		t.addCell(studList.get(0)+" ");
		t.addCell(studList.get(1)+" ");
		t.addCell(studList.get(2)+" ");
		t.addCell(studList.get(3)+" ");
		doc.add(t);
		
		
	}

}
