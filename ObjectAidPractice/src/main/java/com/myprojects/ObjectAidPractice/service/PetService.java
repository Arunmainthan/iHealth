package com.myprojects.ObjectAidPractice.service;

import java.util.List;

import com.myprojects.ObjectAidPractice.domain.Pet;

public interface PetService {

	void addPet(Pet pet);

	void editPet(Pet newPet);

	public List<Pet> getPets();

	public void setPets(List<Pet> pets);

}
