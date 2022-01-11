package com.te.springMvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springMvc.model.Register;
import com.te.springMvc.service.Service;

//@RequestMapping("/")
//@Component

@Controller
public class MvcController {

	@RequestMapping("home")
	public String home() {
//		return "home.jsp";
		return "home";
	}

	@RequestMapping("login")
	public String login() {
//		return "login.jsp";
		return "login";
	}

	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String log(@RequestParam("uname") String userName, @RequestParam("pawd") String password) {
//		String parameter = req.getParameter("uname");
//		String parameter2 = req.getParameter("pawd");
		if (userName.isBlank()) {
//			return "failPage.jsp";
			return "failPage";
		}

//		return "success.jsp";
		return "success";

	}
	
	@GetMapping("register")
	public String register() {
		return "register";
	}
	
	@Autowired
	Service service;
	
	@PostMapping("register")
//	public String register(@ModelAttribute Register  reg) {
        public String register( Register  reg,Model map) {
		map.addAttribute("details", reg);
		service.save(reg);
//		System.out.println(reg.getName()+""+reg.getMail());
		return "success";
		
		
	}

}
