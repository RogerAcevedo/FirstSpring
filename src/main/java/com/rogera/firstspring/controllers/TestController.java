package com.rogera.firstspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping("/")
	public String name() {
		return "What is going on, bro!?";
	}
		
	@RequestMapping("/welcome")
	public String welcome() {
		return "What is going on, brudda!?";
	}
	
//	id on /{id} must match "@PathVariable("id")
	@RequestMapping("/recipe/{id}")
	public String oneRecipe( @PathVariable("id") String recipeid) {
		return "One recipe:" + recipeid ;
//		"recipeid" must match on path variable
	}


	@RequestMapping("/users/{username}/{id}")
	public String showUserProfile(
			@PathVariable("username") String username,
			@PathVariable("id") String id
			) {
		return "username: " + username + ", id: " + id;
	}


}
