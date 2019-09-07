package com.example.sba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.User;
import com.example.sba.service.AdminServiceImpl;
import com.example.sba.service.UserServiceImpl;

@Controller
public class AdminControllerImpl {

	@Autowired
	AdminServiceImpl adminService;
	@Autowired
	UserServiceImpl userService;
	
	
	@RequestMapping(path="/loadUserlist",method=RequestMethod.GET)
	public String loadUser(User user,ModelMap model)
	{
		model.addAttribute("userList",adminService.getList());
		return "manageUsers";
	}
	
	  @RequestMapping(path="/activate/{id}",method=RequestMethod.GET) 
	  public  String editUser(@PathVariable ("id") int id) {
	User user=userService.getUser(id);
	if(user.getActive()==0)
		user.setActive(1);
	else
		user.setActive(0);
	userService.getUpdateUser(user);
	return "redirect:/loadUserlist";
	  }
}
	 
	
	

