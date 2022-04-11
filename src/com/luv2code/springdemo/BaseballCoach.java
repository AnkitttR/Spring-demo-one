package com.luv2code.springdemo;

public class BaseballCoach implements Coach{  // Class implementing interface "Coach"

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;	
		
	}
	
	
	
	@Override        // Because child(inherited) class
	public String getDailyWorkout() {  // Creating method or function
		
		return "Spend 30 minutes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		// Use my fortuneService to get a fortune
		
		return fortuneService.getFortune(); //This is called dependency injection or helper
											// injection
	}
	
	
	//Coach interface ke under getDailyFortune() method hai.
}   //FortuneService Interface ke under getFortune() method hai.
    
