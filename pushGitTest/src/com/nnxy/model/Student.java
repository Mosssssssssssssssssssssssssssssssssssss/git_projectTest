package com.nnxy.model;

public class Student {
	private String name;
	private String username;
	private String password;
	private int sex;
	private String hobby;
	
	public Student(String name, String username, String password, int sex, String hobby) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
