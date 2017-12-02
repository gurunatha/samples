package com.pm.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pm.command.ProductCommand;
import com.pm.util.ValidatorUtils;

public class ProductCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> commandClass) {
		return commandClass.isAssignableFrom(ProductCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		ProductCommand pCommand = null;

		pCommand = (ProductCommand) command;

		// no type conversion errors for id
		if (errors.hasFieldErrors("id") == false) {
			if (pCommand.getId() <= 0) {
				errors.rejectValue("id", "id.shouldbe.positiveInteger");
			}
		}

		if (ValidatorUtils.isEmpty(pCommand.getName())) {
			errors.rejectValue("name", "field.blank", new Object[] { "Name" },
					null);
		} else if (pCommand.getName().length() > 50) {
			errors.rejectValue("name", "field.maxlengtherror", new Object[] {
					"Name", "50" }, null);

		}

		if (ValidatorUtils.isEmpty(pCommand.getBrand())) {
			errors.rejectValue("brand", "field.blank",
					new Object[] { "Brand" }, null);
		}

		if (ValidatorUtils.isEmpty(pCommand.getCategory())) {
			errors.rejectValue("category", "field.blank",
					new Object[] { "Category" }, null);
		}

		if (errors.hasFieldErrors("price") == false) {
			if (pCommand.getPrice() <= 0) {
				errors.rejectValue("price", "price.invalid");
			}
		}

	}

}
