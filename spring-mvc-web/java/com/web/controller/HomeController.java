package com.web.controller;

import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController{

	@Resource(name="myProperties")
	private Properties myProperties;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		System.out.println("In HomeController.. ");
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("Login");
		
		model.addObject("msg", "welcome to my site.");
		
		return model;
	}
	
}