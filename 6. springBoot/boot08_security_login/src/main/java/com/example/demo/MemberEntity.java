package com.example.demo;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Entity
@Data
@NoArgsConstructor
@Table(name="MEMBER")
public class MemberEntity extends BaseTimeEntity implements UserDetails{

	@Id // pk설정
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_member_id")
	@SequenceGenerator(sequenceName = "seq_member_id", allocationSize = 1, name = "seq_member_id") // 시퀀스 자동생성된다.
	@Column(name = "id")
	private Long id;

	@Column(name = "email", unique = true)
	private String email;
	private String pwd;
	private String auth;//ROLE_USER,ROLE_ADMIN

	@Column(name = "lastLoginTime", insertable = false)
	private LocalDateTime lastLoginTime;
	
	@Builder
	public MemberEntity(String email, String pwd, String auth) {
		this.email = email;
		this.pwd = pwd;
		this.auth = auth;
	}
	
	//계정이 가지고있는 권한 목록을 리턴
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
		for(String role : auth.split(",")) {
			log.info("role:{}",role);
			roles.add(new SimpleGrantedAuthority(role));
		}
		return roles;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	

}
