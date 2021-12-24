package com.springcore.constructor.reference.injuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHome {

	public static void main(String[] args) {
	
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/constructor/reference/injuction/reference.xml");
		 Home ho = (Home) context.getBean("home");

		 System.out.println(ho);
	}

}
