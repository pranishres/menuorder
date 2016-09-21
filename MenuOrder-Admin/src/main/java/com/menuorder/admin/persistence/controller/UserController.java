package com.menuorder.admin.persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.menuorder.api.persistence.entity.User;
import com.menuorder.api.persistence.service.*;

@Controller
public class UserController {

	@Autowired
	UserService userService;   

	@RequestMapping(value = "/", method = RequestMethod.GET)   
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";    

	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String saveUser() {

		System.out.println("saving user");

		User user = new User();
		user.setFirstName("Pranish");   
		user.setLastName("shrestha");
		user.setMiddleName("maan");
		user.setPassword("asddf");
		user.setUsername("ranish");

		userService.saveOrUpdate(user);

		return "redirect:/success.jsp";
	}

	@RequestMapping(value = "/users/success", method = RequestMethod.GET)
	public ModelAndView savedUser() {

		ModelAndView modelAndView = new ModelAndView("/success");

		System.out.println("saving user");

		return modelAndView;
	}

}
