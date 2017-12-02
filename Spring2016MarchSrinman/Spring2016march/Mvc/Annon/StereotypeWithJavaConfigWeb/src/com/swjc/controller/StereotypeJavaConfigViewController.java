package com.swjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StereotypeJavaConfigViewController {
	@RequestMapping("/java-config.htm")
	public String viewStereotypeJavaConfig() {
		return "stereotype-java-config";
	}
}
