package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		//BaseballCoach theCoach = new BaseballCoach();
				//Coach theCoach = new BaseballCoach();
		Coach theCoach = context.getBean("myCoach", Coach.class); //myCoach id is linked to TrackCoach class
		
       //Coach.class matlab, Coach Interface mein jo method hai, wo kis class pe apply hoga.
		//class name ko particular naa karke, general kardiya hai, aur class ke package ko
		//applicationContext.xml mein likh diya hai.
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
	
		//close the context
		context.close();
		
	}

}
