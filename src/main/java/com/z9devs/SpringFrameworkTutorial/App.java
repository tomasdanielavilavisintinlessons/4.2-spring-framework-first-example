package com.z9devs.SpringFrameworkTutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Voglio istanziare oggetti che estendano Vehicle
    	 * senza però specificare col new.
    	 * Non voglio avere: "Vehicle c = new Car()". 
    	 * Devo usare un metodo che si chiama getBean(), usando
    	 * una di due interfacce:
    	 * - BeanFactory (org.springframework.beans.factory.BeanFactory)
    	 * - ApplicationContext (org.springframework.context.ApplicationContext)
    	 * 
    	 * Entrambe appartengono a Spring Framework
    	 */
    	
    	// Per usare  ApplicationContext ho bisogno di un file xml che 
    	// contenga lle configurazioni dei bean
    	
    	/*
    	 * Esempio di utilizzo xml-schema based
    	 * 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
        Vehicle c = (Vehicle) context.getBean("vehicle");
        c.drive();
        
        */
    	
    	/*
    	 * Esempio di utilizzo annotation based
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotation_based.xml");
    	Vehicle o = (Vehicle)  context.getBean("car");
    	o.drive();
    	 */
    	
    	/*
    	 * Esempio di proprietà passata da xml
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotation_based.xml");

    	Tyre t = (Tyre) context.getBean("tyre");
    	System.out.println(t.toString());
    	
    	*/
    	
    	ApplicationContext c = new ClassPathXmlApplicationContext("spring_annotation_based.xml");
    	Car v = (Car) c.getBean("car");
    	v.drive();
    }
}