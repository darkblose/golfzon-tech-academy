package com.example.demo;

import java.io.Serializable;

import lombok.Data;

@Data
public class TestResult implements Serializable {

	public final static String CODE_SUCCESS = "200";
	public static final String CODE_FAIL = "400";
	
	public final static String MESSAGE_HELLO = "안녕하세요";
	public final static String MESSAGE_ERROR = "오류입니다.";

	
	private String code;
	private String message;
	private TestVO data;

}
