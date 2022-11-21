package com.z9devs.SpringFrameworkTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Con l'annotation @Component, sto facendo la stessa cosa
// che cerare il tag <bean> nell'xml-based configuration.
// Il nome di default di questo bean è il nome della classe, quindi
// "car". L'iniziale viene messa minuscola.
@Component
public class Car implements Vehicle
{
	@Autowired
	private Tyre tyre;
	
	public void drive() 
	{
		System.out.println("Sto guidando una macchina con tyre: " + tyre);
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
}
