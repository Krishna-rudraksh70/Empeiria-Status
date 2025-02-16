package com.test.testspringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlainHTML {

	@GetMapping("/greet")
	public String hello() {
		return "<h1>Hello, World! 🌍</h1>";
	}

	@GetMapping("/greet/{name}")
	public String helloWithPathVar(@PathVariable String name) {
		return "<h1>Hello, " + name + "! 👋</h1>";
	}

	@GetMapping("/greetUser")
	public String helloWithQueryParam(@RequestParam(defaultValue = "Guest") String name) {
		return "<h1>Hello, " + name + "! 🎉</h1>";
	}
}
