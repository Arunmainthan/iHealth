package com.myprojects.ObjectAidPractice.domain;

public abstract class PetImpl implements Pet {

	private int id;
	private String petName;

	public PetImpl(int id, String petName) {
		this.id = id;
		this.petName = petName;
	}

	@Override
	public boolean equals(Object object) {
		return this.id == ((Pet) object).getId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public String getPetName() {
		return this.petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
}
