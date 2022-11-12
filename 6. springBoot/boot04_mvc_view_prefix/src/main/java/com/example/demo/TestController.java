package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {

	
	@GetMapping({"/","/hello"})
	public String hello(Model model) {
		log.info("/hello...");
		return "hello";
	}
	
}
