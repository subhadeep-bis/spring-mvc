package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "shout";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();
		String nw = theName + " used Request Param Annotation";
		model.addAttribute("message",nw);
		return "shout";
	}
}
