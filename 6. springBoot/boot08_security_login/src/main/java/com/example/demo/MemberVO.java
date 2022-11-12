package com.example.demo;

import lombok.Data;

@Data
public class MemberVO {

	private Long id;
	private String email;
	private String pwd;
	private String auth;
}
