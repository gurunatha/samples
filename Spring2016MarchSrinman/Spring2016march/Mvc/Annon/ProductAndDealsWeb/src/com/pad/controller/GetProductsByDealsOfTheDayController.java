package com.pad.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pad.dto.ProductDto;

@Controller
public class GetProductsByDealsOfTheDayController {
	@RequestMapping("/deals-of-the-day.htm")
	public String getDealsOfTheDayProducts(ModelMap model) {
		List<ProductDto> products = null;

		products = new ArrayList<ProductDto>();
		products.add(new ProductDto(1, "Ipod", "Apple", 3938.34f));
		products.add(new ProductDto(2, "Television", "Samsung", 45738.34f));

		model.addAttribute("products", products);
		return "products-deals";
	}
}
