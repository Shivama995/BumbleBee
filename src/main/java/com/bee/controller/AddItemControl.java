
  package com.bee.controller;
  
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.bee.model.Color;
import com.bee.model.Items;
import com.bee.model.Users;
import com.bee.repository.ColorRepo;
import com.bee.repository.ItemsRepo;
  
  @Controller
  public class AddItemControl {

	  @Autowired
	  private ItemsRepo itemsrepo;
	  @Autowired
	  private ColorRepo colorrepo;

	  @RequestMapping("/achh")
		public ModelAndView a()
		{
			ModelAndView mv = new ModelAndView("NewFile");
			Items item = new Items();	
			mv.addObject("item", item);
			return mv;
		}
	  @ResponseBody
	  @RequestMapping("/achhsave")
	  public Items savecolor(@ModelAttribute("item") Items request)
	  {
		  request.getColors().forEach(color -> color.setItem(request));
		  itemsrepo.save(request);
		  
		  return request;
	  }
	  @ResponseBody
	  @RequestMapping("/list")
	  public List<Items> listall()
	  {
		  return itemsrepo.findAll();
	  }
 }
