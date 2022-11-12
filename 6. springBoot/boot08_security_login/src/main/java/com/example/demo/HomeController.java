package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// Controller에서 Model에 인증에 사용된 객체를 Model에 담아 보내는 방법이 있다.
	// @AuthenticationPrincipal 어노테이션은 별도의 캐스팅 작업 없이
	// 직접 실제 Member 타입을 사용할 수 있기 때문에 좀 더 편하게 사용할 수 있게 한다.
	@GetMapping({ "/", "/hello" })
	public String hello(Model model, Authentication authentication, @AuthenticationPrincipal MemberEntity vo) {
		logger.info("hello");

		Date to_day = new Date();
		model.addAttribute("to_day", to_day);

		model.addAttribute("content", "thymeleaf/th_hello");
		model.addAttribute("title", "Hello 페이지");
		model.addAttribute("vo", vo);

		// Authentication 객체를 통해 유저 정보를 가져올 수 있다.
		// @AuthenticationPrincipal 어노테이션은 별도의 캐스팅 작업 없이 사용가능
		if (authentication != null) {
			MemberEntity userVo = (MemberEntity) authentication.getPrincipal(); // userDetail 객체를 가져옴
			model.addAttribute("info", userVo.getUsername() + "님"); // 유저 아이디
		}

		return "thymeleaf/th_layout_hello";
	}

}