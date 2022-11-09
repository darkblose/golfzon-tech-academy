package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {

	@Autowired
	TestService service;
	
	
	@GetMapping("m_insert")
	public String insert(Model model) {
		log.info("/m_insert...");
		return "member/insert";
	}
	
	@GetMapping("m_selectAll")
	public String m_selectAll(Model model) {
		log.info("/m_selectAll...");
		
		model.addAttribute("vos", service.selectAll());
		
		
		return "member/selectAll";
	}
	
}
