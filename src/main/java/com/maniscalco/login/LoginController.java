package com.maniscalco.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maniscalco.login.UserValidationService;

@Controller
public class LoginController {
	
	@Autowired
	UserValidationService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password.hashCode());
		if(service.isUserValid(name, password)) {
			return "welcome";
		} else {
			return "userunknown";
		}
			
	}
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	@ResponseBody
	public String sayHealth() {
		return "{ \"status\": \"Server is alive\" }";
	}
}
