package com.lostandfound.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lostandfound")
public class FoundController {
	
	@GetMapping("/home")
	public String found(Model model) {
		return "home";
	}

}
