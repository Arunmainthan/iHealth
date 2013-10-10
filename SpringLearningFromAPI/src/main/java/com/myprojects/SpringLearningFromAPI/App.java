package com.myprojects.SpringLearningFromAPI;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myprojects.SpringLearningFromAPI.domain.POJO;

/**
 * Hello world!
 *
 */
public class App 
{
	private ApplicationContext context; 
	private POJO pojo;
            
	public POJO getPojo() {
		return pojo;
	}

	public void setPojo(POJO pojo) {
		this.pojo = pojo;
	}

	public App() {
		super();
		context = new ClassPathXmlApplicationContext("Beans.xml");
		this.pojo = (POJO)context.getBean("pojo");
	}
	
	public void addToList(){
		pojo.getMyList().add("Arun");
	}
	
	public void addToList2(){
		pojo.getMyList().add("mainthan");
	}

	
	
}
