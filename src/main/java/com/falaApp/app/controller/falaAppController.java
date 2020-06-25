package com.falaApp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class falaAppController {

	@GetMapping(value = "/appName")
	public String getName() {
		return "My first app";
	}

}
