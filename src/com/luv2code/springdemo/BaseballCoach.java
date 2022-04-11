package com.luv2code.springdemo;

public class BaseballCoach implements Coach{  // Class implementing interface "Coach"

	@Override        // Because child(inherited) class
	public String getDailyWorkout() {  // Creating method or function
		
		return "Spend 30 minutes on batting practice";
		
	}
	
	
	
}
