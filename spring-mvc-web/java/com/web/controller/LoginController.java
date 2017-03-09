package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.web.model.User;
import com.web.service.UserService;

public class LoginController extends AbstractController{

	ApplicationContext context =
    		new ClassPathXmlApplicationContext("spring-config.xml");
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		System.out.println("In LoginController.. ");
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");

		System.out.println("Input userId:"+userId+":pwd:"+password);
		
		UserService service=(UserService) context.getBean("userService");
		User user=service.validateUser(userId, password);
		ModelAndView model = new ModelAndView();
		
		if(user==null){
			model.setViewName("Login");
			model.addObject("errMsg", "Invalid login..Please retry after 1 year :)");
		}else{
			model.setViewName("Menu");
			model.addObject("user", user);
			model.addObject("msg", "Successful login.");
		}
		return model;
	}
	
}