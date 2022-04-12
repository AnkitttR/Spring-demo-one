package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
 //Trackcoach ka obj myCoach ko reference diya myFortune ka, myFortune id hai HappyFortuneService 
// class ka, isi class ke under method hai getFortune() , wo return karta hai "Today is your lucky day"

//Ab mere pass getFortune() mein value padi hai jo assign ho jayegi fortuneService ko, jo ki 
//Constructor ka argument hai, aur wo value mujhe display ho jayegi