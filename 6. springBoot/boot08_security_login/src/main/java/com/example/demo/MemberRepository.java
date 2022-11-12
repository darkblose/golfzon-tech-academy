package com.example.demo;


import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
	
	static final String UPDATE_MEMBER_LAST_LOGIN = "UPDATE Member "
			+ "SET LAST_LOGIN_TIME = :lastLoginTime "
			+ "WHERE EMAIL = :email";
	
	@Transactional
	@Modifying
	@Query(value=UPDATE_MEMBER_LAST_LOGIN, nativeQuery = true)
	public int updateMemberLastLogin(@Param("email") String email, @Param("lastLoginTime") LocalDateTime lastLoginTime);
	
	
	
	public MemberEntity findByEmail(String email);
	
	
	
}

