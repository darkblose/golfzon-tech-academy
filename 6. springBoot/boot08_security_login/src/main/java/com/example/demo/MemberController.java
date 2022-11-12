package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

	private final MemberService service;

	@GetMapping("/m_insert")
	public String m_insert(Model model) {
		log.info("m_insert");

		model.addAttribute("content", "thymeleaf/member/th_insert");
		model.addAttribute("title", "회원가입");
		return "thymeleaf/member/th_layout_main";
	}

	@PostMapping("/m_insertOK")
	public String m_insertOK(MemberVO vo) throws UnsupportedEncodingException {
		log.info("m_insertOK");
		log.info("vo:{}", vo);

		Long result = 0L;
		try {
			result = service.insertOK(vo);
			log.info("result:{}", result);

		} catch (DataIntegrityViolationException e) {
			e.printStackTrace();
			result = -1L;
			return "redirect:login?result=" + result;
		} catch (Exception e) {
			e.printStackTrace();
			result = -2L;
		}
		if (result > 0) {
			return "redirect:hello";
		} else {
			return "redirect:m_insert?result=" + result;
		}

	}

	@GetMapping("/login")
	public String login(Model model, @RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "exception", required = false) String exception) {
		log.info("login");

		model.addAttribute("error", error);
		model.addAttribute("exception", exception);
		model.addAttribute("content", "thymeleaf/member/th_login");
		model.addAttribute("title", "로그인");
		return "thymeleaf/member/th_layout_main";
	}

	// 로그인 처리는 설정한 스프링 시큐리티가 자동검증 해준다.
	// 스프링 시큐리티를 사용하면 이부분이 필요없어진다.
//	@GetMapping("/logout")
//    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
//		logger.info("logout");

////        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
//        return "redirect:/hello";
//    }

//	//스프링 시큐리티를 사용하면 이부분이 필요없어진다.
//	@PostMapping("/m_loginOK")
//	public String m_loginOK(@RequestParam("username") String email, @RequestParam("password") String pwd) {
//		log.info("m_loginOK");
//		
//		return "redirect:/hello";
//	}
//	
	@GetMapping("/m_selectAll")
	public String m_selectAll(Model model) {
		log.info("m_selectAll");

		long total_rowCount = service.total_rowCount();
		log.info("total_rowCount:{}", total_rowCount);
		model.addAttribute("total_rowCount", total_rowCount);

		List<MemberEntity> vos = service.selectAll();
		log.info("vos:{}", vos);
		model.addAttribute("vos", vos);
		model.addAttribute("content", "thymeleaf/member/th_selectAll");
		model.addAttribute("title", "회원목록");
		return "thymeleaf/member/th_layout_main";
	}

	@GetMapping("/m_selectOne")
	public String m_selectOne(Model model, MemberEntity vo) {
		log.info("m_selectOne");

		Optional<MemberEntity> optional = service.selectOne(vo);
		if (optional.isPresent()) {
			// findById는 Entity의 id로 검색을 해서, Optional<T>를 리턴 타입으로 반환하는 메서드입니다.
			// 따라서 다음과 같이 isPresent() 를 이용하여 Optional 내부에 객체가 들어있는지 확인한 후에
			// get()을 이용해 반환된 객체를 꺼내 쓸 수 있습니다.
			MemberEntity vo2 = optional.get();
			log.info("vo2:{}", vo2);

			model.addAttribute("vo2", vo2);
			model.addAttribute("content", "thymeleaf/member/th_selectOne");
			model.addAttribute("title", "회원정보 및 변경");
			return "thymeleaf/member/th_layout_main";
		} else {
			return "redirect:m_selectAll";
		}
	}

	@PostMapping("/m_updateOK")
	public String m_updateOK(MemberEntity vo) {
		log.info("m_updateOK");
		log.info("vo:{}", vo);

		Long result = 0L;
		try {
			result = service.updateOK(vo);
			log.info("result:{}", result);

			//로그인 상태에서만 수정을 하게되므로 계정권한변경시 리셋해주는 로직
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			List<GrantedAuthority> updatedAuthorities = new ArrayList(vo.getAuthorities());
//			updatedAuthorities.add(new SimpleGrantedAuthority(vo.getAuth()));
			Authentication newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(),
					updatedAuthorities);

			SecurityContextHolder.getContext().setAuthentication(newAuth);

		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:m_insert";
		}
		if (result > 0) {
			return "redirect:hello";
		} else {
			return "redirect:m_insert";
		}

	}

}
