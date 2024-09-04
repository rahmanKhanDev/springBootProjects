package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeRedirectController {
//redirect to home
	@GetMapping("/")
	public String redirectToHome() {
		//redirect
		return "redirect:/employee/";
	}

}
