package com.personal.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

	@GetMapping(path = "/welcome")
	public ResponseEntity<String> getWelcomeMessage()
	{
		return new ResponseEntity<String>("Welcome to my channel Amruta",HttpStatus.OK);
	}
}
