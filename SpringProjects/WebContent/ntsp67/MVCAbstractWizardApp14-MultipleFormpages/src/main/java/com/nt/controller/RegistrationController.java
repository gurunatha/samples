package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class RegistrationController extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException be) throws Exception {
			
		
		return new ModelAndView("result","cmdData",((RegisterCommand)command));
	}
	
	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
	   return new ModelAndView("welcome");
	}

}
