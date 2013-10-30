package com.myprojects.ObjectAidPractice.domain;

public class Dog implements Pet {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	private String petName;

	public Dog(int id, String petName) {
		this.id= id;
		this.petName = petName;
	}
}
