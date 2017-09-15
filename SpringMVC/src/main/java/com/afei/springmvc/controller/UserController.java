package com.afei.springmvc.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.weaver.UnresolvedTypeVariableReferenceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.afei.springmvc.model.User;
import com.afei.springmvc.service.IUserService;
import com.afei.springmvc.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(HttpServletRequest req){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello world");
		modelAndView.setViewName("hello");
		/*
		Enumeration attribute = req.getAttributeNames();
		System.out.println("attribute:");
		while(attribute.hasMoreElements()){
			System.out.println(attribute.nextElement());
		}
		Enumeration parameter = req.getParameterNames();
		System.out.println("parameter");
		while(parameter.hasMoreElements()){
			System.out.println(parameter.nextElement());
		}
		*/
		
		User user = new User();
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
//		System.out.println(userName+password+email);
		user.setUserName(userName);
		user.setPassword(password);
		user.setEmail(email);
		userService.saveUser(user);
		
		return modelAndView;
	}
}
