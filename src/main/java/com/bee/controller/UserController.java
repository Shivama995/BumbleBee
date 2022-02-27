package com.bee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.model.Users;
import com.bee.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	UserService userservice;
	
	
	
	private boolean isLoggedIn=false;
	private Users userlogged = new Users();

	

	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = displaypage("homepage");
		return mv;
	}
	
	
	
	
	
	@GetMapping("/logout")
	public ModelAndView logout()
	{
		isLoggedIn=false;
		userlogged=new Users();
		ModelAndView mv = login();
		return mv;
	}
	
	public ModelAndView displaypage(String in)
	{
		ModelAndView mv = new ModelAndView(in);
		mv.addObject("isLoggedIn", isLoggedIn);
		mv.addObject("userlogged", userlogged);
	return mv;
	}
	
	
	
	@GetMapping("/login")
	public ModelAndView login()
	{
		if(!isLoggedIn)
		{
		ModelAndView mv = new ModelAndView("login-page");
		Users user = new Users();
		mv.addObject("user", user);
		return mv;	
		}
		else
		{
			ModelAndView mv = displaypage("homepage");
			return mv;
		}
	}
	
	
	
	
	
	@RequestMapping("/checkuser")
	public ModelAndView checkUser(@ModelAttribute("user") Users user)
	{
	if(userservice.checkuser(user))
	{
		userlogged = userservice.getUser(user.getUser_id());
		isLoggedIn = true;
		ModelAndView mv = displaypage("homepage");
		return mv;
	}
	else
	{
		ModelAndView mv = new ModelAndView("login-page");
		mv.addObject("invalid","Invalid Username or Password");
		return mv;
	}
	}
	
	@RequestMapping("/checkuserid")
	public ModelAndView checkUserid(@ModelAttribute("user") Users user)
	{
	if(userservice.checkuserid(user))
	{
		ModelAndView mv = new ModelAndView("login-page");
		mv.addObject("alreadyexist","User already exists");
		mv.addObject("reg", true);
		return mv;	
	}
	else
	{
		userservice.save(user);
		userlogged = userservice.getUser(user.getUser_id());
		isLoggedIn=true;
		ModelAndView mv = displaypage("homepage");
		return mv;
	}
	}
	
	
	@RequestMapping("/add")
	public ModelAndView addpage()
	{
		if(isLoggedIn == true)
		{
		if(userlogged.getRole().equals("Admin"))
		{
		ModelAndView mv = displaypage("addpage");
		return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("homepage");
			mv.addObject("userlogged", userlogged);
		return mv;
		}
		}
		else
		{
			ModelAndView mv = new ModelAndView("login-page");
			mv.addObject("user",userlogged);
			return mv;
		}
	}
	
	@RequestMapping("/achh")
	public ModelAndView a()
	{
		ModelAndView mv = displaypage("NewFile");
		return mv;
	}
	
}
