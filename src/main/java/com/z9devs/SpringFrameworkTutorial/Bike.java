package com.z9devs.SpringFrameworkTutorial;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("Sto guidando una bici...");
	}
}
