package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	//Defining private field for dependency
	private FortuneService fortuneService;
	
	//Creating a no-argument constructor
	public CricketCoach(){
		System.out.println("CricketCoach: Inside No-Argument Constructor");
			
	}
	
	//Create a setter method for dependency(helper) injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside Setter Method- setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "practice fast bowling for 15 min";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
