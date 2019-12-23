package com.iru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/api")
@RestController
public class LoginController {
	
	public ModelAndView getLoginPage() {
		
		System.out.println("####### Login Method ########");
		
		ModelAndView modelAndView = new ModelAndView("/login.jsp");
		return modelAndView;
		
	}

}
