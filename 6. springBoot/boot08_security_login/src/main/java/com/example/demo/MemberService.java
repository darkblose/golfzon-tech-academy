package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

	private final MemberRepository memberRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		MemberEntity member = memberRepository.findByEmail(username);
		log.info("member:{}",member);
		
		if(member==null) throw new UsernameNotFoundException("Not founc account.");
		
		return member;
	}

	public Long insertOK(MemberVO vo) throws Exception{
		vo.setPwd(new BCryptPasswordEncoder().encode(vo.getPwd()));
		return memberRepository.save(MemberEntity.builder().email(vo.getEmail()).auth(vo.getAuth()).pwd(vo.getPwd()).build()).getId();
	}
	
	public long total_rowCount() {
		log.info("total_rowCount()....");
		return memberRepository.count();
	}

	public List<MemberEntity> selectAll() {
		log.info("selectAll()....");
		return memberRepository.findAll();	
	}


	public Optional<MemberEntity> selectOne(MemberEntity vo) {
		log.info("selectOne()....");
		return memberRepository.findById(vo.getId());
	}


	public Long updateOK(MemberEntity vo) {
		vo.setPwd(new BCryptPasswordEncoder().encode(vo.getPwd()));
		return memberRepository.save(vo).getId();
	}
	
	
	
}
