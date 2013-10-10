package com.myprojects.SpringLearningFromAPI;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	static App app;

	@Override
	protected void setUp() {
		if(app==null){
			app = new App();
		}
	}

	public void test() {
		app.addToList();
		System.out.println(app.getPojo().getMyList());
	}

	public void test2() {
		app.addToList2();
		System.out.println(app.getPojo().getMyList());
	}

}
