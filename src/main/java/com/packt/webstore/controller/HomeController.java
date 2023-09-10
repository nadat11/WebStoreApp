package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	//REQUEST MAPPING-which method will be invoked for as a response to the request based on the request path
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("greeting","Welcome to the web store!");
		model.addAttribute("tagline","The one and only amaizing web store!");
		model.addAttribute("nadavar","Nada has writen this code!");
		return "welcome";
	}
}
