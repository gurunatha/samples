package com.pm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.pm.command.ProductCommand;

public class AddProductFormController extends SimpleFormController {
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mav = null;
		ProductCommand pCommand = null;

		pCommand = (ProductCommand) command;
		mav = new ModelAndView();
		mav.addObject("id", pCommand.getId());
		mav.setViewName("add-product-success");
		return mav;
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("duplicate-form-error");
	}

}
