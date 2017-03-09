package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.web.model.User;
import com.web.service.UserService;

public class UserManagementController extends AbstractController{

	ApplicationContext context =
    		new ClassPathXmlApplicationContext("spring-config.xml");
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		System.out.println("UserManagementController...");
		String action=request.getParameter("action");
		ModelAndView model=null;
		
		if(action!=null && action.equals("D")){
			model =new ModelAndView("DeleteUser");
		}else if(action!=null && action.equals("DELETE_SUBMIT")){
			model =deleteUser(request);
		}
		
		return model;
	}

	private ModelAndView deleteUser(HttpServletRequest request) {

		String userId=request.getParameter("userId");

		System.out.println("Deleting userId:"+userId);
		
		UserService service=(UserService) context.getBean("userService");
		boolean result=service.deleteUser(userId);
		ModelAndView model = new ModelAndView();
		
		if(result){
			model.setViewName("DeleteUser");
			model.addObject("msg", "Deleted User Succesfully.");
		}else{
			model.setViewName("DeleteUser");
			model.addObject("msg", "No user found for the given userId.");
		}
		return model;
	}
	
}