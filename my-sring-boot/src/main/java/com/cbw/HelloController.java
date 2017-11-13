package com.cbw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "hello spring boot first project";
		
		//初始化代码,并且准备马上提价了...
		
	}
	
}
