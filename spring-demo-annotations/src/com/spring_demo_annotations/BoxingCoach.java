package com.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your foot work";
	}

}
