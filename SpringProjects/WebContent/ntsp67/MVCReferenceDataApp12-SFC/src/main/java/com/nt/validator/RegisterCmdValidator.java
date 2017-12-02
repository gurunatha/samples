package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCmd;

public class RegisterCmdValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegisterCmd.class);
	}
	
	@Override
	public void validate(Object command, Errors errors) {
		RegisterCmd cmd=null;
		//typecasting
		cmd=(RegisterCmd)command;
		//form validations
		if(cmd.getSno()<=0)
			errors.rejectValue("sno","sno.required");
		if(cmd.getHobbies()==null || cmd.getHobbies().length==0)
			errors.rejectValue("hobbies","hobbies.required");
		
		
	}

}
