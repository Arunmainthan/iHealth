package com.projects.myfavmusic.action;

public class HomeAction{
	 
	private String username = "Arun";
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	// all struts logic here
	public String execute() {
 
		return "SUCCESS";
 
	}
}
