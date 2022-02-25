package com.bee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.model.Users;

@Controller
public class UserController {

	@GetMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("login-page");
		Users user = new Users();
		mv.addObject("user", user);
		return mv;	
	}
}
