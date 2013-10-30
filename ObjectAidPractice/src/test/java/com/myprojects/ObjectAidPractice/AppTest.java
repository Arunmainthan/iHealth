package com.myprojects.ObjectAidPractice;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Mockito;

import com.myprojects.ObjectAidPractice.domain.Dog;
import com.myprojects.ObjectAidPractice.domain.Pet;
import com.myprojects.ObjectAidPractice.service.PetService;

public class AppTest extends TestCase {

	
	PetService petService = Mockito.mock(PetService.class);
	App app = new App();
	public void testListPets(){
		//List<Pet> listPets = app.listPets();
		Pet[] pet = new Dog[]{new Dog(1,"puppy")};
		List<Pet> list = Arrays.asList(pet);
		Mockito.when(petService.listPets()).thenReturn(list);
		app.setPetService(petService);
		app.listPets();
	}
}
