package com.springrest.springrest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
	
	@GetMapping("/helloworld")
	public String hellworld() {
		
		return "Hello world";
	}

}
