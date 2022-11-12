package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestService {
	
	@Autowired
	private TestRepository repo;

	public TestService() {
		log.info("TestService()...");
	}
	
	public String getName() {
		return repo.getName();
	}
	
	public TestVO selectOne(TestVO vo) {
		return repo.selectOne(vo);
	}
	
	
	public List<TestVO> selectAll() {
		return repo.selectAll();
	}

	public TestResult getTestResult(int test) {
		TestResult result = new TestResult();
		
		if(test==1) {
			result.setCode(TestResult.CODE_SUCCESS);
			result.setMessage(TestResult.MESSAGE_HELLO);
			result.setData(repo.selectOne(new TestVO()));
		}else {
			result.setCode(TestResult.CODE_FAIL);
			result.setMessage(TestResult.MESSAGE_ERROR);
			result.setData(repo.selectOne(new TestVO()));
		}
		
		
		return result;
	}
	
	
	
	
	
}
