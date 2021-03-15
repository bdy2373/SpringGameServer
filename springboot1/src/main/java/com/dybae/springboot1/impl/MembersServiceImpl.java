package com.dybae.springboot1.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dybae.springboot1.dao.MemberDAO;
import com.dybae.springboot1.dto.Member;
import com.dybae.springboot1.service.MembersService;

@Service
public class MembersServiceImpl implements MembersService{

	@Autowired
	private MemberDAO dao;
	@Override
	public List<Member> testMember() {
		// TODO Auto-generated method stub
//		Member test1 = new Member();
//		test1.setName("amy");
//		test1.setScore("154");
		return dao.testMember();
	}
	@Override
	public Member getMember(Integer id) {
		// TODO Auto-generated method stub
		return dao.getMember(id);
	}
	@Override
	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		dao.insertMember(member);
	}
	@Override
	public List<Member> sortMember(String sort) {
		// TODO Auto-generated method stub
		return dao.sortMember(sort);
	}


}
