package com.office.model;

public class LoginEmployee {
	private int id;
	private String uname;
	private String password;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "LoginEmployee [id=" + id + ", uname=" + uname + ", password=" + password + ", type=" + type + "]";
	}
	
}
