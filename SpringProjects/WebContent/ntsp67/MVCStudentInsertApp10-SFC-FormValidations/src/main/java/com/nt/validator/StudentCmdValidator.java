package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCmd;

public class StudentCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("StudentCmdValidator:supports(-)");
		return clazz.isAssignableFrom(StudentCmd.class);
	}

	@Override
	public void validate(Object command, Errors errs) {
		System.out.println("StudentCmdValidator:validate(-,-)");
		StudentCmd cmd=null;
		//type casting
		cmd=(StudentCmd)command;
		//form validations
		if(cmd.getSno()==null)
			errs.rejectValue("sno","sno.required");
		
		if(cmd.getSname()==null || cmd.getSname().equals("") ||cmd.getSname().length()==0)
			errs.rejectValue("sname","sname.required");
		
		if(cmd.getSadd()==null || cmd.getSadd().equals("") || cmd.getSadd().length()==0)
			errs.rejectValue("sadd","sadd.required");
		
		else if(cmd.getSadd().length()<=5)
			errs.rejectValue("sadd", "sadd.minlength");
	}

}
