package com.junitproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
	@GetMapping
	public String getData() {
		return "Hello World!";
	}
}
