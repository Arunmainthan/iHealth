package com.myprojects.ObjectAidPractice;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Mockito;

import com.myprojects.ObjectAidPractice.domain.Dog;
import com.myprojects.ObjectAidPractice.domain.Pet;
import com.myprojects.ObjectAidPractice.service.PetService;
import com.myprojects.ObjectAidPractice.service.PetServiceImpl;

public class AppTest extends TestCase {

	
	PetService petService = new PetServiceImpl();
	App app = new App();
	
	@Override
	protected void setUp(){
		app.setPetService(petService);
	}
	
	public void testListPets(){
		
		Pet dog = new Dog(1,"puppy");
		petService.addPet(dog);
		assertTrue(petService.getPets().size()>0);
		
		Pet newDog = new Dog(1,"tommy");
		petService.editPet(newDog);
		assertTrue(petService.getPets().get(0).getPetName().equals("tommy"));
		

	}
}
