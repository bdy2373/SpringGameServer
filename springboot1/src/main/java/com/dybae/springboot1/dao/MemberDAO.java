package com.dybae.springboot1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dybae.springboot1.dto.Member;

@Repository
public interface MemberDAO {
	public List<Member> testMember();
	public Member getMember(Integer id);
	public List<Member> sortMember(String sort);
	public void insertMember(Member member);
}
