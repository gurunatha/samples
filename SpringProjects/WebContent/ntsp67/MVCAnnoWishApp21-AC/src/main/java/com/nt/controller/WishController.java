package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	/*@RequestMapping("/wish.htm")
	public ModelAndView process(){
		String msg=null;
		//use Service class
		msg=service.generateWishMessage();
		//return MAV object
		return new ModelAndView("result","wMsg",msg);
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String process(ModelMap map){
		String msg=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		map.addAttribute("wMsg",msg);
		return "result";
	}//method
*/
	
	/*@RequestMapping("/wish.htm")
	public String process(Model model){
		String msg=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		model.addAttribute("wMsg",msg);
		return "result";
	}//method
*/
	
	/*@RequestMapping("/wish.htm")
	public String process(Map map){
		String msg=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		map.put("wMsg",msg);
		return "result";
	}//method
*/
	
	/*@RequestMapping("/wish.htm")
	public void  process(Map map){
		String msg=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		map.put("wMsg",msg);

	}//method
*/	
	
	/*@RequestMapping("/wish.htm")
	public Model  process(){
		String msg=null;
		Model model=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		model= new ExtendedModelMap();
		model.addAttribute("wMsg",msg);
		return model;
	}//method
	*/
	
	/*@RequestMapping("/wish.htm")
	public ModelMap  process(){
		String msg=null;
		ModelMap map=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		map= new ModelMap();
		map.addAttribute("wMsg",msg);
		return map;
	}//method
*/	
	
	@RequestMapping("/wish.htm")
	public Map  process(){
		String msg=null;
		Map<String,Object> map=null;
		//use Service class
		msg=service.generateWishMessage();
		//create model Attribute
		map= new HashMap();
		map.put("wMsg",msg);
		return map;
	}//method
	
}//class
