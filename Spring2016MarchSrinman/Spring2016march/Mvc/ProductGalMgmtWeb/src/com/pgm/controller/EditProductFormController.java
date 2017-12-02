package com.pgm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.pgm.command.ProductCommand;
import com.pgm.dto.ProductDto;
import com.pmg.service.ManageProductService;

public class EditProductFormController extends SimpleFormController {
	private ManageProductService manageProductService;

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		ProductCommand command = null;
		ProductDto productDto = null;
		int id = 0;

		id = Integer.parseInt(request.getParameter("id"));
		productDto = manageProductService.getProduct(id);
		command = new ProductCommand();
		BeanUtils.copyProperties(command, productDto);

		return command;
	}

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		List<String> manufacturerNames = null;
		Map<String, Object> referenceDataMap = null;

		referenceDataMap = new HashMap<String, Object>();
		manufacturerNames = manageProductService.getManufacturerNames();
		referenceDataMap.put("manufacturerNames", manufacturerNames);
		return referenceDataMap;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ProductCommand pCommand = null;
		ProductDto productDto = null;
		ModelAndView mav = null;

		pCommand = (ProductCommand) command;
		productDto = new ProductDto();
		BeanUtils.copyProperties(productDto, pCommand);
		manageProductService.updateProduct(productDto);
		mav = new ModelAndView();
		mav.setViewName("redirect:products.htm?route=ep");
		return mav;
	}

	public void setManageProductService(
			ManageProductService manageProductService) {
		this.manageProductService = manageProductService;
	}

}
