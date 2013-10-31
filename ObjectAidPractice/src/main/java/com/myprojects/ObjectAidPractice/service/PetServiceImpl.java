package com.myprojects.ObjectAidPractice.service;

import java.util.List;

import com.myprojects.ObjectAidPractice.domain.Pet;

public class PetServiceImpl implements PetService {

	List<Pet> pets;
	
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public void addPet(Pet pet) {
		// TODO Auto-generated method stub
		pets.add(pet);
		
	}

	public void editPet(Pet newPet) {
		// TODO Auto-generated method stub
		for (Pet pet : pets) {
			if(pet.equals(newPet)){
				pet.setPetName(newPet.getPetName());
			}
		}
		
	}
}
