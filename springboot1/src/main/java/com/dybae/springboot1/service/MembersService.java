package com.dybae.springboot1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dybae.springboot1.dto.Member;

@Service
public interface MembersService {
	List<Member> testMember();
	
	Member getMember(Integer id);
	
	List<Member> sortMember(String sort);
	
	void insertMember(Member member);
}
