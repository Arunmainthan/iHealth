package com.myprojects.ObjectAidPractice.domain;

public class Dog extends PetImpl {

	public Dog(int id, String petName) {
		super(id, petName);
	}

	public void makeNoise() {
		System.out.println("bark");

	}
}
