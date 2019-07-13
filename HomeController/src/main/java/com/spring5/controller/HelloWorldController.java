package com.spring5.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")

public class HelloWorldController {
	/*
	 * Show HTML form
	 * */
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	/*
	 * to process HTML form create one more controller
	 */
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersontwo")
	public String modelForm(HttpServletRequest request, Model model) {
		String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		String result="second version form with name of"+theName;
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	@RequestMapping("/processFormVersonthree")
	public String modelFormTwo(@RequestParam("studentName") String theName, Model model) {
		theName=theName.toUpperCase();
		String result="third version form with name of!"+theName;
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
