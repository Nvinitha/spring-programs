package com.cg.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {
	
	@RequestMapping(value = "showLogin")
	public String createLogin(Model model) {
		System.out.println("In createLogin()");
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping(value = "checkLogin")
	public String checkLogin() {
		
		
		return "LoginSuccessful";
	}
	
	
	@RequestMapping(value = "showRegister")
	public String showRegister(Model model) {
		
		System.out.println("In showRegister()");
		model.addAttribute("register", new User());
		return null;
	}
}
