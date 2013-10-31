package com.myprojects.ObjectAidPractice.domain;

public interface Pet {
	
	public int getId();

	public void setId(int id);

	public String getPetName();

	public void setPetName(String petName);
	
	public void makeNoise();
}
