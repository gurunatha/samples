package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.UserCommand;

@Component("loginValidator")
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		UserCommand command=null;
		//type casting
		command=(UserCommand)cmd;
		//form validation logic
		if(command.getUser()==null || command.getUser().equals("") || command.getUser().length()==0){
			errors.rejectValue("user","login.user.required");
		}
		else{
			if(command.getUser().length()<4)
				errors.rejectValue("user","login.user.minlength");
		}
		
		if(command.getPwd()==null || command.getPwd().equals("") || command.getPwd().length()==0){
			errors.rejectValue("pwd","login.pwd.required");
		}
	}//validate(-,-)
}//class
