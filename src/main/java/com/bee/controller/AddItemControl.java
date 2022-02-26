/*
 * package com.bee.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.bee.model.Users;
 * 
 * @Controller public class AddItemControl {
 * 
 * @Autowired UserController usercontrol;
 * 
 * private boolean isLoggedIn = usercontrol.isLoggedIn(); private Users
 * userlogged = usercontrol.getUserlogged();
 * 
 * @RequestMapping("/add") public ModelAndView addpage() { if(isLoggedIn == true
 * && userlogged.getRole()=="Admin") { ModelAndView mv = new
 * ModelAndView("addpage"); return mv; } else { ModelAndView mv = new
 * ModelAndView("login-page"); return mv; } }
 * 
 * }
 */