package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class TestRepository {

	public TestRepository() {
		log.info("TestRepository()...");
	}
	
	public String getName() {
		log.info("getName()...");
		return "yangssem";
	}
	
	public TestVO selectOne(TestVO vo) {
		log.info("selectOne()...");
		log.info("{}",vo);
		
		return new TestVO(1,"admin1","hi1111","kim1","011");
	}
	
	
	public List<TestVO> selectAll() {
		log.info("selectAll()...");
		
		List<TestVO> vos = new ArrayList<>();
		vos.add(new TestVO(1,"admin1","hi1111","kim1","011"));
		vos.add(new TestVO(2,"admin2","hi1111","kim1","011"));
		vos.add(new TestVO(3,"admin3","hi1111","kim1","011"));
		
		return vos;
	}
	
	
	
	
	
}
