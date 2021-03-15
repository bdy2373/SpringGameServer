package com.dybae.springboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dybae.springboot1.dto.Member;
import com.dybae.springboot1.impl.MembersServiceImpl;
import com.dybae.springboot1.service.MembersService;

@RestController
public class MembersConstroller {
	
	@Autowired
	private MembersService membersService;
	
	@GetMapping(path="/test")
	public List<Member> memberTest() {
		return membersService.testMember();
	}
	
	@GetMapping(path="/member/{id}")
	public Member getMember(@PathVariable Integer id) {
		return membersService.getMember(id);
	}
	
	@GetMapping(path="/member")
	public List<Member> sortMember(@RequestParam("sort") String sort) {
		//sort ASC DESC
		return membersService.sortMember(sort);
	}
	
	@PostMapping(path="/member")
	public Member insertMember(@RequestBody Member member) {
		membersService.insertMember(member);
		return member;
	}

}
