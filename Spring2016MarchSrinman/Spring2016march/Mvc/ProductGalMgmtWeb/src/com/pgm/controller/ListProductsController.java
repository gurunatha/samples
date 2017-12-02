package com.pgm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.pgm.dto.ProductDto;
import com.pmg.service.ManageProductService;

public class ListProductsController extends AbstractController {
	private ManageProductService manageProductService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<ProductDto> products = null;
		ModelAndView mav = null;

		mav = new ModelAndView();
		products = manageProductService.getProducts();
		mav.addObject("products", products);
		mav.setViewName("products");

		return mav;
	}

	public void setManageProductService(ManageProductService manageProductService) {
		this.manageProductService = manageProductService;
	}

}
