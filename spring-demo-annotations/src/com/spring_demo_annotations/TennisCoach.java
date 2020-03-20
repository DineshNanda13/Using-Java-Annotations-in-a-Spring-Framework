package com.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component //("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your Backhand Volley";
	}

}
