package com.springcore.reference.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/reference/type/refrence.xml");
	Car carObj = (Car) context.getBean("carref");
	
//	System.out.println(carObj);
	System.out.println(carObj.getWheel());
	System.out.println(carObj.getName());
	System.out.println(carObj.getEngine().getNameOfCompany());
	
	}
}
