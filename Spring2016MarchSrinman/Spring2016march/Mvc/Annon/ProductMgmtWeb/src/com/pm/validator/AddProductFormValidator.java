package com.pm.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pm.form.AddProductForm;

@Component
public class AddProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> commandClass) {
		return commandClass.isAssignableFrom(AddProductForm.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		AddProductForm productForm = null;

		productForm = (AddProductForm) command;
		if (productForm.getName() == null
				|| productForm.getName().trim().length() == 0) {
			errors.rejectValue("name", "name.blank");
		}

		if (productForm.getManufacturer() <= 0) {
			errors.rejectValue("name", "manufacturer.blank");
		}

		if (errors.hasFieldErrors("price") == false) {
			if (productForm.getPrice() <= 0) {
				errors.rejectValue("price", "price.invalid");
			}
		}
	}

}
