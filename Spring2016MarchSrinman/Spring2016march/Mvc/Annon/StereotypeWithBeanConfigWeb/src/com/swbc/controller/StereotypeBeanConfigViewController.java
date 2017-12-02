package com.swbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StereotypeBeanConfigViewController {
	@RequestMapping("/stereotype-bean-config.htm")
	public String showStereotypeBeanConfigView() {
		return "stereotype-bean-config";
	}
}
