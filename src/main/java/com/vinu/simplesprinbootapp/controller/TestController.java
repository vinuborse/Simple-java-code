package com.vinu.simplesprinbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.simplesprinbootapp.response.GenericResponse;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public GenericResponse testForGet() {
		return new GenericResponse("This is a test api for GET!!!");
	}
	
	@PostMapping("/test")
	public GenericResponse testForPost() {
		return new GenericResponse("This is a test api for POST!!!");
	}
	
}
