package com.myprojects.ObjectAidPractice.service;

import java.util.List;

import com.myprojects.ObjectAidPractice.domain.Pet;

public interface PetService {

	void addPet(Pet animal);

	void editPet(Pet dog);

	List<Pet> listPets();

}
