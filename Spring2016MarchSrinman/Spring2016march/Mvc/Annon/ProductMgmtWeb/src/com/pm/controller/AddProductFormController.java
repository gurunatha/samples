package com.pm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pm.dto.ManufacturerDto;
import com.pm.form.AddProductForm;
import com.pm.service.ProductService;
import com.pm.validator.AddProductFormValidator;

@Controller
@RequestMapping("/add-product.htm")
public class AddProductFormController {
	private static Logger logger = Logger
			.getLogger(AddProductFormController.class);

	@Autowired
	private ProductService productService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		logger.debug("entered into initBinder()");
		binder.addValidators(new AddProductFormValidator());
	}

	@ModelAttribute("manufacturers")
	public List<ManufacturerDto> populateManufacturers(
			HttpServletRequest request) {
		List<ManufacturerDto> manufacturers = null;

		logger.info("calling productService to get all manufacturers");
		manufacturers = productService.getAllManufacturers();
		logger.debug("retrieved " + manufacturers.size() + " manufacturers");
		return manufacturers;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupProductForm(Model model) {
		AddProductForm form = null;

		logger.info("entered into setupProductForm()");
		form = new AddProductForm();
		model.addAttribute("productForm", form);
		return "add-product";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addProduct(Model model,
			@Valid @ModelAttribute("productForm") AddProductForm form,
			Errors errors) {
		if (errors.hasErrors()) {
			logger.debug("errors found while submitting the form : "
					+ errors.getErrorCount());
			return "add-product";
		}
		logger.info("saving product with product name : " + form.getName());
		int productId = productService.saveProduct(form);
		logger.debug("saved product with product id : " + productId);
		model.addAttribute("id", productId);
		return "add-product-success";
	}
}
