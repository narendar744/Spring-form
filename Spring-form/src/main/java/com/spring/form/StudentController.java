package com.spring.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	@RequestMapping("/")
	private String studentForm(Model model) {
		Student theStudent= new Student();
		model.addAttribute("student", theStudent);
		return "student-form";
	}
	@RequestMapping("/studentconfirmation")
	public String processForm(@ModelAttribute("student") Student newStudent) {
		System.out.println("theStudent :"+newStudent.getFname()+" "+newStudent.getLname());
		return "student-confirmation";
	}

}
