package com.way2learnonline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(String name) {
		return "Hello "+name;
	}

	@GetMapping("/admin/hello")
	public String sayAdminHello(String name) {
		return "Hello Admin "+name;
	}

	@GetMapping("/student/hello")
	public String sayStudentHello(String name) {
		return "Hello Student "+name;
	}

}
