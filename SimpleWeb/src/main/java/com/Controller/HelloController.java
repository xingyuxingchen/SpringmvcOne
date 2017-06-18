package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Service.HelloService;

@Controller
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping("/home")
	public String hello() {
		System.out.println(helloService.sayhello());
		return "index";
	}

	@ExceptionHandler(Exception.class)
	public String handleIOException(Exception ex) {
		return "index";
	}

}
