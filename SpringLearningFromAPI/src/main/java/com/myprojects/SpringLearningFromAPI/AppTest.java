package com.myprojects.SpringLearningFromAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Beans.xml"})
public class AppTest{

	@Autowired
	private App app;
	
	@Test
	public void testFunction() {
		app.addToList();
		System.out.println(app.getPojo().getMyList());
	}

	@Test
	public void testFunction2() {
		app.addToList2();
		System.out.println(app.getPojo().getMyList());
	}

}
