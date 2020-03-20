# Using-Java-Annotations-in-a-Spring-Framework
Using @Component to specify that the class is special spring bean whenever spring scans it and register it in spring configuration file

//File Name: applicationContext.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
    
	<!-- add entry to enable component scanning -->

	<context:component-scan
		base-package="com.spring_demo_annotations" />

</beans>

//File Name: Coach.java

package com.spring_demo_annotations;

public interface Coach {
	
	public String getDailyWorkout();

}

//File Name: TennisCoach.Java

package com.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component //("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your Backhand Volley";
	}

}

//File Name: BoxingCoach.Java

package com.spring_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your foot work";
	}

}

//File Name: MyWorkout.Java

package com.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyWorkout {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("boxingCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
