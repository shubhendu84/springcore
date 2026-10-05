package com.kk.springcore.springcore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/hello")
	public String helloWord() {
		
		return "<h2>Hello world....!!!</h2>";
	}

	
	public void happy() {
		
		System.out.println("I am happy method...!!");
	}
}
