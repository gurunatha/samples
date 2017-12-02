package com.ps.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.ps.command.ProductCatalogSearchCommand;
import com.ps.dto.ProductDto;

public class ProductCatalogSearchCommandController extends
		AbstractCommandController {
	@Override
	protected ModelAndView handle(HttpServletRequest request,HttpServletResponse response, Object command,BindException bindException) throws Exception {
		ProductCatalogSearchCommand productCatalogSearchCommand = null;
		List<ProductDto> products = null;
		ModelAndView mav = null;
		int productIdCounter = 0;

		// call service by passing command
		// it returns list containing productDto
		// bind to model and forward to view
		productCatalogSearchCommand = (ProductCatalogSearchCommand) command;
		products = new ArrayList<ProductDto>();

		if (productCatalogSearchCommand.getBrand().equals("apple")) {
			products.add(new ProductDto(++productIdCounter, "IPod", 8473.34f));
			products.add(new ProductDto(++productIdCounter, "Mac", 84373.34f));
		} else if (productCatalogSearchCommand.getBrand().equals("nike")) {
			products.add(new ProductDto(++productIdCounter, "Sports Shoe",
					3893.34f));
		}

		if (productCatalogSearchCommand.getCategory().equals(
				"fashion and lifestyle")) {
			products.add(new ProductDto(++productIdCounter, "T-Shirt", 383.34f));
		}

		mav = new ModelAndView();
		mav.addObject("products", products);
		mav.setViewName("product-search-result");

		return mav;
	}

}
