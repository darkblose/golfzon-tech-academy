package com.example.demo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestVO implements Serializable {
	
	private int num;
	private String id;
	private String pw;
	private String name;
	private String tel;

}
