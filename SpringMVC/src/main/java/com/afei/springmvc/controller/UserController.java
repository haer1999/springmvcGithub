package com.afei.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/getHello")
	public ModelAndView getHello(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello world");
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
