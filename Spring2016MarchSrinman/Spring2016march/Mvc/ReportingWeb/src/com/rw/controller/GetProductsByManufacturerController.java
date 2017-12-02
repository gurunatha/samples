package com.rw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rw.dto.ProductDto;

public class GetProductsByManufacturerController extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<ProductDto> products = null;
		String manufacturer = null;
		String view = null;
		ModelAndView mav = null;
		String outcome = "products";

		manufacturer = request.getParameter("manufacturer");
		view = request.getParameter("view");

		products = new ArrayList<ProductDto>();
		products.add(new ProductDto(1, "BiCycle", 3535.34f));
		products.add(new ProductDto(22, "Iron Man Diecast", 234.34f));
		products.add(new ProductDto(21, "Wallet", 4356.3f));
		products.add(new ProductDto(45, "Shoes", 4324.34f));

		mav = new ModelAndView();
		mav.addObject("manufacturer", manufacturer);
		mav.addObject("products", products);

		if (view != null) {
			if (view.equals("excel")) {
				outcome = "excel-products";
			} else if (view.equals("pdf")) {
				outcome = "pdf-products";
			}
		}
		mav.setViewName(outcome);
		return mav;
	}

}
