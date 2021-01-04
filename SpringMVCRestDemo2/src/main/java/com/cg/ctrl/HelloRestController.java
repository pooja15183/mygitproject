package com.cg.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping(value="/hello")
	public String sayHello() {
		System.out.println("heelo........");
		return "Hello Cg! from Spring Framework!";
	}
}
