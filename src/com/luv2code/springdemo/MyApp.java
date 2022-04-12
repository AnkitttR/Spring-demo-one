package com.luv2code.springdemo;

public class MyApp {   //Main or driver class

	public static void main(String[] args) {
		
		
		// Create the object "theCoach" of the class "BaseballCoach"
        //BaseballCoach theCoach = new BaseballCoach();
		//Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();  // Left side changed from child class "BaseballCoach"
		                                      // to parent class "Coach"
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout()); // Access the getDailyWorkout method of 
								//class BaseballCoach through the "theCoach" obj of same class.
		
	}

}
