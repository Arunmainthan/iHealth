package com.myprojects.ObjectAidPractice;

import java.util.List;

import com.myprojects.ObjectAidPractice.domain.Dog;
import com.myprojects.ObjectAidPractice.domain.Pet;
import com.myprojects.ObjectAidPractice.service.PetService;

/**
 * Hello world!
 * 
 */
public class App {
	private PetService petService;

	public PetService getPetService() {
		return petService;
	}

	public void setPetService(PetService petService) {
		this.petService = petService;
	}

	public void listPets() {
		// TODO Auto-generated method stub
		 List<Pet> listPets = petService.listPets();
		 for (Pet pet : listPets) {
			System.out.println(pet);
		}
	}

	public void editPet(Pet dog) {
		petService.editPet(dog);
	}

	public void addPet(Pet animal) {
		// TODO Auto-generated method stub
		petService.addPet(animal);

	}
}