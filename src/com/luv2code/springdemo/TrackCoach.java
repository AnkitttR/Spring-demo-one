package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	//define a private field for the dependency
	private FortuneService fortuneService; //FortuneService ek interface hai, jiske under method hai getFortune();
	   //FortuneService Interface ka ek private field humne banaya jo hai = "fortuneService"
	
	public TrackCoach() {} // No argument constructor, for handling error in MyApp.java
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) { //Private field ko humne TrackCoach class ke under pass kiya ya argument rakha.
		
		this.fortuneService = fortuneService; //Iski value line no 27 se aayegi
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " +  fortuneService.getFortune(); //constructor ke private field 
	}                  //"fortuneService" ke help se HappyFortuneService class ke getFortune() method ko call karenge"

}
