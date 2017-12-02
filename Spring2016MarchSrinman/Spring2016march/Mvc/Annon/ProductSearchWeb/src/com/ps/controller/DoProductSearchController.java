package com.ps.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ps.dto.ProductDto;
import com.ps.form.ProductSearchForm;

@Controller
public class DoProductSearchController {
	@RequestMapping("/search-products.htm")
	public String searchProducts(Model model,
			@ModelAttribute ProductSearchForm form, Errors errors) {
		List<ProductDto> products = null;

		products = new ArrayList<ProductDto>();
		products.add(new ProductDto(1, form.getProduct(), form
				.getManufacturer(), 3535.34f));
		products.add(new ProductDto(2, "Led", "Samsung", 39393.34f));

		model.addAttribute("products", products);
		return "product-list";
	}
}
