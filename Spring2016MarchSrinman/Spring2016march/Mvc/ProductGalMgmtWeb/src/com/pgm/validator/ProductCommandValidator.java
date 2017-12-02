package com.pgm.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pgm.command.ProductCommand;
import com.pgm.util.StringUtils;

public class ProductCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> commandClass) {
		return commandClass.isAssignableFrom(ProductCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		ProductCommand pCommand = null;

		pCommand = (ProductCommand) command;

		if (errors.hasFieldErrors("productId") == false) {
			if (pCommand.getProductId() <= 0) {
				errors.rejectValue("productId", "productid.invalid");
			}
		}
		if (StringUtils.isEmpty(pCommand.getName())) {
			errors.rejectValue("name", "name.blank");
		}

		if (errors.hasFieldErrors("price") == false) {
			if (pCommand.getPrice() <= 0) {
				errors.rejectValue("price", "price.invalid");
			}
		}
	}
}
