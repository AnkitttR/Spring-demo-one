package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	//Defining private field for dependency
	private FortuneService fortuneService;
	
	//add new fields for emailaddress & team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {  //read only method
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {  //Write only method
		System.out.println("CricketCoach: Inside Setter Method- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {      //read only method
		return team;
	}

	public void setTeam(String team) {     //Write only method
		System.out.println("CricketCoach: Inside Setter Method- setTeam");
		this.team = team;
	}


	
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
