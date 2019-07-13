package com.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/showForm")
	public String testController() {
		return "test-page";
	}

}
