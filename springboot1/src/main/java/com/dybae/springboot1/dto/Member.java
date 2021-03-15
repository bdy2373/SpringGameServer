package com.dybae.springboot1.dto;

public class Member {
	private Integer id;
	private String name;
	private Integer score;
	
	public Member() {
		super();
	}
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public String toString() {
		return "Member [name="+name+", score="+score+"]";
		
	}

}
