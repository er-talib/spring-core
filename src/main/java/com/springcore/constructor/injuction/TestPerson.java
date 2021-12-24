package com.springcore.constructor.injuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	public static void main(String[] args) {
		
	ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/constructor/injuction/cunstructor.xml");
	Person per = (Person) context.getBean("person");
	System.out.println(per);
		
	}

}
